package br.com.cep.buscacep.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ceps")
public class Cep {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String cep;
        private String logradouro;
        private String complemento;
        private String unidade;
        private String bairro;
        private String localidade;
      

     public Cep(){}


    public Cep(Long id, String cep, String logradouro, String complemento, String unidade, String bairro,
            String localidade) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.unidade = unidade;
        this.bairro = bairro;
        this.localidade = localidade;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getCep() {
        return cep;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }


    public String getLogradouro() {
        return logradouro;
    }


    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


    public String getComplemento() {
        return complemento;
    }


    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }


    public String getUnidade() {
        return unidade;
    }


    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }


    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public String getLocalidade() {
        return localidade;
    }


    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
  
}
