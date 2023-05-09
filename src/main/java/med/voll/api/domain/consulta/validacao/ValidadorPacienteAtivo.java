package med.voll.api.domain.consulta.validacao;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamnetosConsultas;
import med.voll.api.domain.paciente.PacienteRepository;

public class ValidadorPacienteAtivo {

    private PacienteRepository repository;

    public void validar(DadosAgendamnetosConsultas dados) {

        var pacienteEstaAtivo = repository.finAtivoById(dados.idPaciente());
            if (!pacienteEstaAtivo) {
                throw new ValidacaoException("Consulta não pode ser agendada com paciente excluido");
            }
        }
    }
