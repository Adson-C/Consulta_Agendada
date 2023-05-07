package med.voll.api.domain.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastradoPaciente(
        @NotBlank(message = "Nome é obrigatório")
        String nome,
        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Formato do email é errado")
        String email,
        @NotBlank(message = "CPF é obrigatório")
        @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}", message = "Formado errado cpf")
        String cpf,
        @NotBlank(message = "Telefone é obrigatório")
        String telefone,
        @NotNull(message = "Dados do Endereço é obrigatório")
        DadosEndereco endereco) {
}
