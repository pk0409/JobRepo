package com.cg.dao;

import javax.persistence.PersistenceException;

import com.cg.entity.JobSeeker;

public interface JobSeekerDao {
	public void registerJobSeeker(JobSeeker jobSeekerObject) throws PersistenceException, Exception;
}
