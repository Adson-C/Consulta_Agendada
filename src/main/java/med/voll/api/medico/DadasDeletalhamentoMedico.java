package med.voll.api.medico;

import med.voll.api.endereco.Enderco;

public record DadasDeletalhamentoMedico(Long id, String nome, String email, String crm,String telefone, Especialidade especialidade, Enderco enderco) {

    public DadasDeletalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone() ,medico.getEspecialidade(), medico.getEnderco());
    }
}
