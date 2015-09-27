package br.com.senai.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.model.MeioDeComunicacao;

public interface IMeioDeComunicacaoDAO extends JpaRepository<MeioDeComunicacao, Long>{

}
