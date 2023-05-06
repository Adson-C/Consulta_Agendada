package med.voll.api.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.NonNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastradoPaciente(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}")
        String cpf,
        @NotBlank
        String telefone,
        DadosEndereco endereco) {
}
