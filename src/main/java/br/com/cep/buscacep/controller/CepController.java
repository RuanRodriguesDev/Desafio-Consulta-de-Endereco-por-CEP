package br.com.cep.buscacep.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cep.buscacep.CepDto.CepDto;
import br.com.cep.buscacep.entity.Cep;
import br.com.cep.buscacep.service.Apiconexao;
import br.com.cep.buscacep.service.CepService;

@RestController
@RequestMapping(value = "api/endereco")
public class CepController {
    private final Apiconexao apiconexao;

    private final CepService cepService;

  
    public CepController(Apiconexao apiconexao, CepService cepService) {
        this.apiconexao = apiconexao;
        this.cepService = cepService;
    }

    @GetMapping("/cep/{cep}")
    public ResponseEntity<CepDto> buscaCep(@PathVariable("cep") String cep){
        return  ResponseEntity.ok().body(apiconexao.cepDto(cep));
    }
    @PostMapping("/cep/{cep}")
    public Cep saveCep(@PathVariable String cep) throws Exception{
        return cepService.saveCep(cep);
    }

    @GetMapping("/cep")
    public ResponseEntity<List<Cep>> list(){
        return ResponseEntity.ok().body(cepService.list());
    }

    @DeleteMapping("/cep/{id}")
    public ResponseEntity<List<Cep>> delete(@PathVariable("id")Long id){
        return ResponseEntity.ok().body(cepService.delete(id));
    }
}
