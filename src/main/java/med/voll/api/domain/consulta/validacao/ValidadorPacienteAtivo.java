package med.voll.api.domain.consulta.validacao;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamnetosConsultas;
import med.voll.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoConsulta  {

    @Autowired
    private PacienteRepository repository;

    public void validar(DadosAgendamnetosConsultas dados)  {

        var pacienteEstaAtivo = repository.finAtivoById(dados.idPaciente());
            if (!pacienteEstaAtivo) {
                throw new ValidacaoException("Consulta não pode ser agendada com paciente excluido");
            }
        }
    }
