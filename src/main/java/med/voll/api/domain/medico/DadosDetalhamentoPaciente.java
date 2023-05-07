package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Enderco;
import med.voll.api.domain.paciente.Paciente;

public record DadosDetalhamentoPaciente(String nome, String email, String cpf, String telefone, Enderco enderco) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this( paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone(), paciente.getEnderco());
    }
}
