package med.voll.api.domain.consulta.validacao;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamnetosConsultas;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class ValidadorHorarioFuncionametoConsulta  implements ValidadorAgendamentoConsulta {

    public void validar(DadosAgendamnetosConsultas dados) {
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaDaClinica = dataConsulta.getHour() < 7;
        var depoisDoEncerramentoDaClinica = dataConsulta.getHour() > 18;
        if (domingo || antesDaAberturaDaClinica || depoisDoEncerramentoDaClinica) {
            throw new ValidacaoException("Consulta fora do horário de funcionamento da clinica");
        }
    }
}
