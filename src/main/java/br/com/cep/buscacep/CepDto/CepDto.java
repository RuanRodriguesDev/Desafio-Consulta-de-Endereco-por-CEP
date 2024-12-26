package br.com.cep.buscacep.CepDto;

public record cepDto(

        String cep,
        String logradouro,
        String complemento,
        String unidade,
        String bairro,
        String localidade,
) {
    
}
