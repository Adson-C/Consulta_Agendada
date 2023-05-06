package med.voll.api.paciente;

public record DaddosListarPaciente(Long id, String nome, String email, String cpf, String telefone) {

    public DaddosListarPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone());
    }
}
