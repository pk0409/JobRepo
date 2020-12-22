 package com.cg.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Job")
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="job_Id",nullable=false)
	private int job_Id;
	@Column(name="title", nullable = false)
	private String title;
	@Column(name="location", nullable = false)
	private String location;
	@Column(name="description", nullable = false)
	private String description;
	@Column(name="experience", nullable = false)
	private String experience;
	@Column(name="salary", nullable = false)
	private double salary;
	@Column(name="noticePeriod", nullable = false)
	private String noticePeriod;
	@Column(name="status", nullable = false)
	private String status;
	@Column(name="email", nullable = false)
	private String email;
	@Column(name="contactNo", nullable = false)
	private long contactNo;
	@Column(name="skillSet", nullable = false)
	private String skillSet;
	@ManyToOne
	//@JoinColumn(name="employer_id",nullable=false)
	@JoinColumn(name="employer_id",referencedColumnName = "employer_id")
	//private int employer_id;
	private Employer employer;
	@Column(name="jobseeker_id", nullable = false)
	private int jobseeker_id;
	
	
	public Job() {
		
	}
	

	public int getJob_Id() {
		return job_Id;
	}
	public void setJob_Id(int id) {
		this.job_Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getNoticePeriod() {
		return noticePeriod;
	}
	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public int getJobseeker_id() {
		return jobseeker_id;
	}
	public void setJobseeker_id(int jobseeker_id) {
		this.jobseeker_id = jobseeker_id;
	}
	

	@Override
	public String toString() {
		return "Job [id=" + job_Id + ", title=" + title + ", location=" + location + ", description=" + description
				+ ", experience=" + experience + ", salary=" + salary + ", noticePeriod=" + noticePeriod + ", status="
				+ status + ", email=" + email + ", contactNo=" + contactNo + ", skillSet=" + skillSet + ", employer_id="
				+ employer.getEmployer_Id() + ", jobseeker_id="  +jobseeker_id+ "]";
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	

}