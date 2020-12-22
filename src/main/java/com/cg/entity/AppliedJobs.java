package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AppliedJobs")
public class AppliedJobs {
	@Id   
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable=false)
	private Integer id;
	@Column(name= "job_id")
	private Integer job_id;
	@Column(name="jobseeker_id",nullable=false)
	private Integer jobseeker_id;
	
	public AppliedJobs() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getJob_id() {
		return job_id;
	}

	public void setJob_id(Integer job_id) {
		this.job_id = job_id;
	}

	public Integer getJobseeker_id() {
		return jobseeker_id;
	}

	public void setJobseeker_id(Integer jobseeker_id) {
		this.jobseeker_id = jobseeker_id;
	}

	@Override
	public String toString() {
		return "AppliedJobs [id=" + id + ", job_id=" + job_id + ", jobseeker_id=" + jobseeker_id + "]";
	}
	
	

}