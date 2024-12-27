package br.com.cep.buscacep.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cep.buscacep.CepDto.CepDto;
import br.com.cep.buscacep.entity.Cep;
import br.com.cep.buscacep.repository.CepRepository;

@Service
public class CepService {
    private CepRepository cepRepository;
    private Apiconexao apiconexao;
    
   

    public CepService(CepRepository cepRepository, Apiconexao apiconexao) {
        this.cepRepository = cepRepository;
        this.apiconexao = apiconexao;
    }

    public Cep saveCep(String cep) throws Exception{
        // Busca o Cep na Api externa
        CepDto cepDto = apiconexao.cepDto(cep);
        if(cepDto == null){
            throw new Exception("Cep não encontrado?");
        }
        // Converte o CepDto para a entidade Cep     
        Cep cepEntity = new Cep(
            null,// ID gerado automaticamente
            cepDto.cep(),
            cepDto.logradouro(),
            cepDto.complemento(),
            cepDto.unidade(),
            cepDto.bairro(),
            cepDto.localidade()
        );   
        // Salva no Banco de Dados
        return cepRepository.save(cepEntity);
    }

    public List<Cep> list(){
        return cepRepository.findAll();
    }

    public List<Cep> delete(Long id){
        cepRepository.deleteById(id);
        return list();
    }
}
