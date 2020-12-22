package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
import com.cg.entity.Job;



public class EmployerDaoImpl implements EmployerDao {

	private EntityManagerFactory emf= 
			Persistence.createEntityManagerFactory("jobsearch1");
	
	

	@Override
	public void registerEmployer(Employer employer) throws PersistenceException, Exception {
     EntityManager entityManager=emf.createEntityManager();
		
		try {		
			EntityTransaction entr=entityManager.getTransaction();
		     entr.begin();
		 
			entityManager.persist(employer);
		    entityManager.flush();
			//entityManager.getTransaction();
			entr.commit();			
		}catch(PersistenceException e) {
			entityManager.getTransaction().rollback();
			throw e;
		}catch(Exception e) {
			throw e;
		}finally {
			entityManager.close();
		}	
	}



	@Override
	public void postJob(Job job) throws PersistenceException, Exception {
		// TODO Auto-generated method stub
EntityManager entityManager=emf.createEntityManager();
		
		try {		
			EntityTransaction entr=entityManager.getTransaction();
		     entr.begin();
		 
			entityManager.persist(job);
		    entityManager.flush();
			//entityManager.getTransaction();
			entr.commit();			
		}catch(PersistenceException e) {
			entityManager.getTransaction().rollback();
			throw e;
		}catch(Exception e) {
			throw e;
		}finally {
			entityManager.close();
		}	
	}



	


	@Override
	public Integer deleteAJob(Integer job_id) {
		// TODO Auto-generated method stub
EntityManager entityManager=emf.createEntityManager();
		try {		
			EntityTransaction entr=entityManager.getTransaction();
		     entr.begin();
		 
			//entityManager.persist(job_id);
		     Job job=entityManager.find(Job.class, job_id);
		     entityManager.remove(job);
		    entityManager.flush();
			//entityManager.getTransaction();
			entr.commit();			
		}catch(PersistenceException e) {
			entityManager.getTransaction().rollback();
			throw e;
		}catch(Exception e) {
			throw e;
		}finally {
			entityManager.close();
		}
		return job_id;	
	}



	@Override
	public Employer findById(Integer employer_id) throws PersistenceException, Exception {
		// TODO Auto-generated method stub
EntityManager entityManager=emf.createEntityManager();
		Employer employer;
		try {		
			EntityTransaction entr=entityManager.getTransaction();
		     entr.begin();
		 
			employer=entityManager.find(Employer.class, employer_id);
		    entityManager.flush();
			//entityManager.getTransaction();
			//entr.commit();			
		}catch(PersistenceException e) {
			entityManager.getTransaction().rollback();
			throw e;
		}catch(Exception e) {
			throw e;
		}finally {
			entityManager.close();
		}
		return employer;	
	}



	@Override
	public List<Job> viewAllJobsByEmployer() throws PersistenceException, Exception {
		EntityManager entityManager=emf.createEntityManager();
		//		String jql="select p from Product p";
		String jql= "From Job j";
		try {			
			entityManager.getTransaction().begin();
//			Query q= entityManager.createQuery(jql);
			TypedQuery<Job> query=
					entityManager.createQuery(jql, Job.class);
			List<Job> jobList=query.getResultList();
			entityManager.getTransaction().commit();
			return jobList;
		}catch(PersistenceException e) {
			entityManager.getTransaction().rollback();		
			
			throw e;
		}catch(Exception e) {
			throw e;
		}finally {
			entityManager.close();
		}
	}



	

	
}
