package com.cg.entity;

import javax.persistence.Column;

public final class AppliedJobsBuilder {
	private Integer id;
	private Integer job_id;
	private Integer jobseeker_id;
	
	public AppliedJobsBuilder() {
		
	}
	
	public static AppliedJobsBuilder anAppliedJobsBuilder() {
    	return new AppliedJobsBuilder();
    }
	public AppliedJobsBuilder withId(Integer id) {
		this.id = id;
		return this;
	}
	public AppliedJobsBuilder withJobId(Integer job_id) {
		this.job_id=job_id;
		return this;
	}
	public AppliedJobsBuilder withJobseekerId(Integer jobseeker_id) {
		this.jobseeker_id=jobseeker_id;
		return this;
	}
	
	public AppliedJobs build() {
		AppliedJobs appliedjobs=new AppliedJobs();
		appliedjobs.setId(id);
		appliedjobs.setJob_id(job_id);
		appliedjobs.setJobseeker_id(jobseeker_id);
		
		return appliedjobs;
	}

}