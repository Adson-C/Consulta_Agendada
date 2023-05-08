package med.voll.api.domain.consulta;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAgendamnetosConsultas(

        Long idMedico,
        @NotNull(message = "Paciente não pode ser Vazio")
        Long idPaciente,
        @NotNull(message = "Hora e data não pode ser vazios")
        @Future
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime data
) {
}
