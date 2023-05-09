package med.voll.api.domain.consulta.validacao;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamnetosConsultas;
import med.voll.api.domain.medico.MedicoRepository;

public class ValidadorMedicoAtivo {

    private MedicoRepository repository;

    public void validar(DadosAgendamnetosConsultas dados) {
        if(dados.idMedico() == null) {
            return;
        }
        var medicoEstaAtivo = repository.finAtivoById(dados.idMedico());
            if (!medicoEstaAtivo) {
                throw new ValidacaoException("Consulta não pode ser agendado com mécico");
            }
        }
    }
