package software.services;

import software.agents.OpenAiClient;
import software.entities.Atendimento;
import software.repositories.AtendimentoRepository;

import java.util.Scanner;
import java.util.UUID;

public class AtendimentoService {
    // Método para fazer a captura dos dados do usuário e gerar um atendimento

    public void realizarAtendimento() {

        try {

            var atendimento = new Atendimento();
            atendimento.setId(UUID.randomUUID());

            var atendimentoRepository = new AtendimentoRepository();
            var openAiClient = new OpenAiClient();

            var scanner = new Scanner(System.in);

            System.out.println("\nSEJA BEM-VINDO AO ATENDIMENTO DA COTI INFORMATICA!\n");

            System.out.print("INFORME O SEU NOME......: ");
            atendimento.setUsuario(scanner.nextLine());

            System.out.print("ESCREVA A SUA PERGUNTA..: ");
            atendimento.setPergunta(scanner.nextLine());

            System.out.println("\nPROCESSANDO RESPOSTA...\n");

            //Enviando a pergunta para a IA e obter a resposta
            var resposta = openAiClient.perguntar(atendimento.getUsuario(), atendimento.getPergunta());
            atendimento.setUsuario(resposta);

            //Imprimir a resposta para o usuário
            System.out.println("RESPOSTA: \n");
            System.out.println(atendimento.getResposta());

            // Salvando no banco de dados
            atendimentoRepository.inserir(atendimento);

        } catch (Exception e) {
            System.out.println("\nERRO: " + e.getMessage());
        }
    }
}
