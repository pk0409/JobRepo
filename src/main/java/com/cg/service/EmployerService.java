package com.cg.service;

import java.util.List;

import javax.persistence.PersistenceException;

import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
import com.cg.entity.Job;
import com.cg.exception.EmployerException;

public interface EmployerService {
	public void registerEmployer(Employer employerObject) throws EmployerException, Exception;
	
	public void postAjob(Job jobObject) throws EmployerException,Exception;
	public Employer findById(Integer employer_id)throws EmployerException, Exception;
	public Integer deleteAJob(Integer job_id) throws EmployerException;
	public List<Job> viewAllJobsByEmployer()throws EmployerException, Exception;
}
