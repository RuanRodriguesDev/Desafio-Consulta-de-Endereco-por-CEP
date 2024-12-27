package br.com.cep.buscacep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cep.buscacep.CepDto.CepDto;
import br.com.cep.buscacep.service.Apiconexao;

@RestController
@RequestMapping(value = "api/endereco")
public class CepController {
    private final Apiconexao apiconexao;

    public CepController(Apiconexao apiconexao) {
        this.apiconexao = apiconexao;
    }
    @GetMapping("/cep/{cep}")
    public ResponseEntity<CepDto> buscaCep(@PathVariable("cep") String cep){
        return  ResponseEntity.ok().body(apiconexao.cepDto(cep));
    }
}
