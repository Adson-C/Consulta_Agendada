package med.voll.api.domain.consulta.validacao;

import med.voll.api.domain.consulta.DadoCancelamentoConsultas;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadoCancelamentoConsultas dados);
}
