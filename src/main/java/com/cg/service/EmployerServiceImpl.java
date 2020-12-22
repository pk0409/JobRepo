package com.cg.service;

import java.util.List;

import javax.persistence.PersistenceException;

import com.cg.dao.EmployerDao;
import com.cg.dao.EmployerDaoImpl;
import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
import com.cg.entity.Job;
//import com.cg.exception.EmployerException;
//import com.cg.training.exception.ProductException;
import com.cg.exception.EmployerException;


public class EmployerServiceImpl implements EmployerService {
	
	public void registerEmployer(Employer employer) throws Exception{
		try {
	
		{
			EmployerDao employerDao= new EmployerDaoImpl();
			
				
				employerDao.registerEmployer(employer);			
			
		}
	} catch (PersistenceException e) {
		
		e.printStackTrace();
	} catch (Exception e) {
		
		e.printStackTrace();
	}

	}

	@Override
		public void postAjob(Job job) throws EmployerException, Exception {
	        // TODO Auto-generated method stub
	        try {
	            EmployerDao employerDao= new EmployerDaoImpl();
	            employerDao.postJob(job);        

	 

	        } catch (PersistenceException e) {
	            e.printStackTrace();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


	@Override
	public Integer deleteAJob(Integer job_id) throws EmployerException {
		// TODO Auto-generated method stub
		try { 
			 EmployerDao employerDao= new EmployerDaoImpl();
			employerDao.deleteAJob(job_id);
			//return job_id;
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return job_id;
	}

	@Override
	public Employer findById(Integer employer_id) throws EmployerException, Exception {
		// TODO Auto-generated method stub
		Employer employer = null;
		try { 
			 EmployerDao employerDao= new EmployerDaoImpl();
			employer =employerDao.findById(employer_id);
			//return job_id;
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return employer;
	}

	@Override
	public List<Job> viewAllJobsByEmployer() throws EmployerException, Exception {
		// TODO Auto-generated method stub
		EmployerDao employerDao= new EmployerDaoImpl();
		try {			
			List<Job> jobList= 
					employerDao.viewAllJobsByEmployer();
			return jobList;
		}catch(PersistenceException e) {
			throw new EmployerException(e.getMessage(),e);
		}
	}

	
	}
	

