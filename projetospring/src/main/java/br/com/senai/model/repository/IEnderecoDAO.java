package br.com.senai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.Endereco;

public interface IEnderecoDAO extends JpaRepository<Endereco, Long>{

}
