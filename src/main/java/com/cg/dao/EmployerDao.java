package com.cg.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
import com.cg.entity.Job;

public interface EmployerDao {
	public void registerEmployer(Employer employer) throws PersistenceException, Exception;
	public void postJob(Job job)throws PersistenceException, Exception;
	public Integer deleteAJob(Integer job_id)throws PersistenceException, Exception;
	public Employer findById(Integer employer_id)throws PersistenceException, Exception;
	public List<Job> viewAllJobsByEmployer()throws PersistenceException, Exception;
	
}