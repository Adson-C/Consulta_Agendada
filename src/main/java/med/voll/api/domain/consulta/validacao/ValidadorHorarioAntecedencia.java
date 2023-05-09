package med.voll.api.domain.consulta.validacao;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamnetosConsultas;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorHorarioAntecedencia implements ValidadorAgendamentoConsulta {

    public void validar(DadosAgendamnetosConsultas dados) {
        var  dataConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferencaDeMinutos = Duration.between(agora, dataConsulta).toMinutes();

        if (diferencaDeMinutos < 30){
            throw new ValidacaoException("Consulta dever ser agendada com antecencia minima de 30 minutos");
        }
    }
}
