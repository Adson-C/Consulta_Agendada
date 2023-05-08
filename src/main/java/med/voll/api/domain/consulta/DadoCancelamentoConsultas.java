package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotNull;

public record DadoCancelamentoConsultas(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivo
) {
}
