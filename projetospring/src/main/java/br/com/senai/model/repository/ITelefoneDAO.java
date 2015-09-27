package br.com.senai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.MeioDeComunicacao;
import br.com.senai.model.Telefone;
import br.com.senai.model.Titulacao;

public interface ITelefoneDAO extends JpaRepository<Telefone, Long>{

}
