package br.com.senai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TelefoneDAO {

	public TelefoneDAO() {

	}

	public void inserir(Telefone telefone) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("projetoservletjsp");

		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		em.persist(telefone);
		em.getTransaction().commit();

		em.close();

	}

}
