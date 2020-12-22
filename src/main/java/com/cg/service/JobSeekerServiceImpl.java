package com.cg.service;

import javax.persistence.PersistenceException;

import com.cg.dao.JobSeekerDao;
import com.cg.dao.JobSeekerDaoImpl;
import com.cg.entity.JobSeeker;

public class JobSeekerServiceImpl implements JobSeekerService{

	@Override
	public void registerJobSeeker(JobSeeker jobSeekerObject) throws Exception {
		try {
			JobSeekerDao jobSeekerDao=new JobSeekerDaoImpl();
			jobSeekerDao.registerJobSeeker(jobSeekerObject);
			
		}catch(PersistenceException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
