package com.cg.dao;

public interface QueryMapper {
public static final String ADD_NEW_EMPLOYER="insert into employer values"
		+ "(?,?,?,?,?,?)";
public static final String ADD_NEW_JOBSEEKER="insert into jobseeker values"
		+ "(?,?,?,?,?,?,?,?)";
public static final String LOGIN_AS_EMPLOYER="insert into login values"
		+ "(?,?,?)";
public static final String LOGIN_AS_JOBSEEKER="insert into login values"
		+ "(?,?,?)";
public static final String POST_A_JOB="insert into job values"	
		+ "(?,?,?,?,?,?,?,?,?,?,?)";
public static final String DELETE_A_JOB="delete from job where job_id=?";
public static final String VIEW_ALL_JOBS_BY_EMPLOYER="select * from job where employer_id=?";
}
