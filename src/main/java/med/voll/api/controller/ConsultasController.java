package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.consulta.DadosAgendamnetosConsultas;
import med.voll.api.domain.consulta.DadosdetalhamentoConsultas;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consultas")
public class ConsultasController {

    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamnetosConsultas dados) {
        System.out.println(dados);
        return ResponseEntity.ok(new DadosdetalhamentoConsultas(null, null, null, null));
    }
}
