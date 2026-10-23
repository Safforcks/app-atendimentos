package software.services;

import software.entities.Atendimento;

import java.util.Scanner;

public class AtendimentoService {
    // Método para fazer a captura dos dados do usuário e gerar um atendimento

    public void realizarAtendimento() {

        try {
            System.out.println("\nSEJA BEM-VINDO AO ATENDIMENTO DA COTI INFORMATICA!\n");

            var atendimento = new Atendimento();
            var scanner = new Scanner(System.in);

            System.out.print("INFORME O SEU NOME......: ");
            atendimento.setUsuario(scanner.nextLine());

            System.out.print("ESCREVA A SUA PERGUNTA..: ");
            atendimento.setPergunta(scanner.nextLine());

            System.out.println("\nPROCESSANDO RESPOSTA...\n");

        } catch (Exception e) {
            System.out.println("\nERRO: " + e.getMessage());
        }
    }
}
