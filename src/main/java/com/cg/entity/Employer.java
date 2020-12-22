package com.cg.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity

@Table(name="Employer")
public class Employer {

	  @Id   
	@GeneratedValue(strategy=GenerationType.AUTO)
	   @Column(name="employer_Id",nullable=false)
	   private Integer employer_Id;
	    @Column(name= "organization_Name")
       
        private String organizationName;
	    @Column(name="address",nullable=false)
        private String address;
	    @Column(name="contact_no",nullable=false)
        private long contactNo;
	    @Column(name="email",nullable=false)
        private String email;
	    @Column(name="username",nullable=false)
	    private String username;
	    @Column(name="password",nullable=false)
	    private String password;
	   
	    
	    @OneToMany(mappedBy ="employer")
	    private List<Job> jobs;
	    
	    public Employer()
	    {
	    	
	    }
	   
	    
	    public void setOrganizationName(String organizationName) {
			this.organizationName = organizationName;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public void setContactNo(long contactNo) {
			this.contactNo = contactNo;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public void setEmployer_Id(Integer employer_Id) {
			this.employer_Id = employer_Id;
		}


		public String getOrganizationName() 
	    {
	        return organizationName;
	    }
	   
	    
	    public String getAddress() 
	    {
	        return address;
	    }
	    
	   
	
	    public Long getContactNo()
	    {
	        return contactNo;
	    }
	    
	   
	    
	    public String getEmail() 
	    {
	        return email;
	    }
	    
	    
	  
	    public String getUsername() 
	    {
	        return username;
	    }
	   
	   
	    
	    public String getPassword()
	    {
	        return password;
	    }
	    
	    public int getEmployer_Id() {
			return employer_Id;
		}
	    
	    
	    
	    
	    
	
		@Override
		public String toString() {
			return "Employer [employer_Id=" + employer_Id + ", organizationName=" + organizationName + ", address=" + address
					+ ", contactNo=" + contactNo + ", email=" + email + ", username=" + username + ", password="
					+ password + ", jobs=" + jobs + "]";
		}


		public List<Job> getJobs() {
			return jobs;
		}


		public void setJobs(List<Job> jobs) {
			this.jobs = jobs;
		}
		
	
	 

}
