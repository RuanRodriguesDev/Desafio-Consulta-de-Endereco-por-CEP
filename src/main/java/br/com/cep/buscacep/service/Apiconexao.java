package br.com.cep.buscacep.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.cep.buscacep.CepDto.CepDto;

@FeignClient(url = "https://viacep.com.br/ws/",name = "cepForent")
public interface Apiconexao {

    @GetMapping("{cep}/json")
    CepDto cepDto(@PathVariable("cep") String cep);

    

}
