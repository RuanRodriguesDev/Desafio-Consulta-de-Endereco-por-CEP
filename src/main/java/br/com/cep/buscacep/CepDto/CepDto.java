package br.com.cep.buscacep.CepDto;


public record CepDto(
       
        Long id,
        String cep,
        String logradouro,
        String complemento,
        String unidade,
        String bairro,
        String localidade
) {
    
}
