package software;

import software.services.AtendimentoService;

public class Main {
    public static void main(String[] args) {

        var atendimentoService = new AtendimentoService();
        atendimentoService.realizarAtendimento();
    }
}