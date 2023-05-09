package med.voll.api.domain.consulta.validacao;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamnetosConsultas;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidadorMedicoNoMemsoHorario {

    private ConsultaRepository repository;

    public void validar(DadosAgendamnetosConsultas dados) {
        var medicoPossuiOutraConsultaNoMesmoHorario = repository.existsByMedicoAndData(dados.idMedico(), dados.data());
            if (medicoPossuiOutraConsultaNoMesmoHorario) {
                throw new ValidacaoException("Medico já possui outra consulta agendada nesse mesmo horario");
            }
        }
    }
