package software.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
public class Atendimento {

    private UUID id;
    private String usuario;
    private String pergunta;
    private LocalDateTime dataHora;
}
