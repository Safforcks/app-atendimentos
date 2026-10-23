package software.repositories;

import software.entities.Atendimento;
import software.factories.ConnectionFactory;

public class AtendimentoRepository {
    // Método para receber um objeto do tipo Atendimento com seus dados preenchidos
    // (feito na camada de serviço) e inserir um registro na tabela do banco de dados

    public void inserir(Atendimento atendimento) throws Exception {

        var factory = new ConnectionFactory();

        try (var connection = factory.createConnection()) {

            var sql = """
                    insert into atendimento(id, usuario, pergunta, resposta) 
                    values(?, ?, ?, ?)
                    """;

            var statement = connection.prepareStatement(sql);

            statement.setObject(1, atendimento.getId());
            statement.setString(2, atendimento.getUsuario());
            statement.setString(3, atendimento.getPergunta());
            statement.setString(4, atendimento.getResposta());
            statement.execute();
        }

    }
}
