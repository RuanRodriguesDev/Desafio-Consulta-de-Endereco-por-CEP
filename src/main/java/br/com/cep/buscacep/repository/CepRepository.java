package br.com.cep.buscacep.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import br.com.cep.buscacep.entity.Cep;

public interface CepRepository extends JpaRepository<Cep, Long> {
    
    
}
