package br.com.senai;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
	
	public List<Telefone> listarPorUsuario(Usuario usuario){
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("projetoservletjsp");
		
		EntityManager em = factory.createEntityManager();
		
		Query query = em
				.createQuery("select t from Telefone t where t.usuario = :usuario");
		query.setParameter("usuario", usuario);
		
		return query.getResultList();
	}
	
	public void excluir(int id) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("projetoservletjsp");

		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		Telefone telefone = em.find(Telefone.class, id);
		em.remove(telefone);
		em.getTransaction().commit();

		em.close();
	}
			
}
