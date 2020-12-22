package com.cg.entity;
public final class EmployerBuilder {

	private String organizationName;
	private String address;
	private long contactNo;
    private String email;
    private String username;
    private String password;
    private Integer employer_Id;
    public EmployerBuilder()
    {
    	
    }
    public static EmployerBuilder anEmployerBuilder() {
    	return new EmployerBuilder();
    }
	public EmployerBuilder withOrganizationName(String organizationName) {
		this.organizationName = organizationName;
		return this;
	}
	public EmployerBuilder withAddress(String address) {
		this.address = address;
		return this;
	}
	public EmployerBuilder withContactNo(long contactNo) {
		this.contactNo = contactNo;
		return this;
	}
	public EmployerBuilder withEmail(String email) {
		this.email = email;
		return this;
	}
	public EmployerBuilder withUsername(String username) {
		this.username = username;
		return this;
	}
	public EmployerBuilder withPassword(String password) {
		this.password = password;
		return this;
	}
	public EmployerBuilder withEmployer_Id(Integer employer_Id) {
		this.employer_Id = employer_Id;
		return this;
	}
	public Employer build()
	{
		Employer employer=new Employer();
		employer.setOrganizationName(organizationName);
		employer.setAddress(address);
		employer.setContactNo(contactNo);
		employer.setEmail(email);
		employer.setUsername(username);
		employer.setPassword(password);
		employer.setEmployer_Id(employer_Id);
		
		return employer;
		
	}
    
}