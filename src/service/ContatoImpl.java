package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Contato;

public class ContatoImpl {
private EntityManager em;
	
	public ContatoImpl(){
		EntityManagerFactory fabrica = Persistence.
				createEntityManagerFactory("Agenda");
		em=fabrica.createEntityManager();
	}
	
	public Contato porId(int id){
		return em.find(Contato.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Contato> listarContatos(){
		List<Contato> retorno = null;
		Query q = em.createQuery("select c from Contato c");
		retorno = q.getResultList();
		return retorno;
	}
	
	public void gravarContato(Contato c){
		try{
			em.getTransaction().begin();	
			if(c.getIdContato()>0){
				em.merge(c);
			}else{
				em.persist(c);
			}
			em.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			em.getTransaction().rollback();
		}
			
	}
}
 