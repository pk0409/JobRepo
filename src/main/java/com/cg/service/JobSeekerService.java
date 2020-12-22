package com.cg.service;

import com.cg.entity.JobSeeker;
import com.cg.exception.JobSeekerException;

public interface JobSeekerService {
	public void registerJobSeeker(JobSeeker jobSeekerObject) throws JobSeekerException, Exception;
}
