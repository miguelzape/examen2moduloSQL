package parteIV.daos;


import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import parteIV.entities.Contrato;
import utils.JpaUtil;
import java.util.Date;

public class UserDao {
	
	private EntityManager em;

	public UserDao() {
		em = JpaUtil.getEM("HibernateOracle");
	}
	
	public void close() {
		if (em!=null) {
			em.close();
			em=null;
		}
	}
	

	public List<Contrato> getContratos (){
		List<Contrato> contratos;
		
		contratos = em.createQuery("from Contrato", Contrato.class)
			.getResultList();
		
		return contratos;
	}
	
	public List<Contrato> getContratosByName (String name){
	
		TypedQuery<Contrato> query = em.createQuery(
				"from Contrato c where c.nombreCliente=?1", 
				Contrato.class);
		query.setParameter(1, name);
		return query.getResultList();
	}
	
	public List<Contrato> getContratosByDate (Date fecha){
		List<Contrato> contrato;
		
		TypedQuery<Contrato> query = em.createQuery(
				"from Contrato c where c.fechaFin>=?1", Contrato.class);
		
		query.setParameter(1, fecha);
		contrato = query.getResultList(); 
		
		return contrato;
	}
	
	
	public List<Contrato> getContratosSupImporte (long importe){
		TypedQuery<Contrato> query = em.createQuery(
				"from Contrato c where c.importe>=?1", Contrato.class);
		
		query.setParameter(1, importe);
		return query.getResultList(); 
	}
	

	
	public void insertarContratos (List<Contrato> contrato) {
		 em.getTransaction().begin();
		 
		 try {
			 for (Contrato c : contrato) {
				 em.persist(c);
			 }
			 em.getTransaction().commit();
		 }catch(Exception e) {
			 em.getTransaction().rollback();
		 }
	     
	}
	


	
}
