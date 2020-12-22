package com.cg.pl;


import java.util.List;
import java.util.Scanner;

import com.cg.entity.Employer;
import com.cg.entity.EmployerBuilder;
import com.cg.entity.Job;
import com.cg.entity.JobBuilder;
import com.cg.entity.JobSeeker;
import com.cg.entity.JobSeekerBuilder;
import com.cg.entity.Login;
import com.cg.entity.LoginBuilder;
import com.cg.exception.EmployerException;
import com.cg.exception.JobSeekerException;
import com.cg.exception.LoginException;
import com.cg.service.EmployerService;
import com.cg.service.EmployerServiceImpl;
import com.cg.service.JobSeekerService;
import com.cg.service.JobSeekerServiceImpl;
import com.cg.service.LoginService;
import com.cg.service.LoginServiceImpl;

public class JobSearchTester {

	private static Scanner scanner=new Scanner(System.in);
	private static EmployerService service= new EmployerServiceImpl();
	private static JobSeekerService jservice = new JobSeekerServiceImpl();
	private static LoginService lservice = new LoginServiceImpl();
	public static void main(String[] args) throws Exception {
		while(true) {
			System.out.println("Enter 1. Register as Employer 2.Login as Employer 3. Register as JobSeeker 4. Login as JobSeeker 5.Post A Job 6. Delete a job"
					+ "7. View All Jobs Posted By Employer");
			int option= Integer.parseInt(scanner.nextLine());
			try {
				switch(option) {
				case 1:
					EmployerBuilder builder=new EmployerBuilder();
					registerEmployer(builder);
					System.out.println("New Employer Added succesfully.. ");
					break;
			   case 2:
				    LoginBuilder lbuilder=new LoginBuilder();
				    loginAsEmployer(lbuilder);
				    System.out.println("Employer logged in succesfully.. ");
				    break;
				case 3:
					JobSeekerBuilder jbuilder=new JobSeekerBuilder();
					registerJobSeeker(jbuilder);
					System.out.println("New JobSeeker Added succesfully.. ");
					break;
				case 4:
					LoginBuilder jobbuilder=new LoginBuilder();
					loginAsJobSeeker(jobbuilder);
					System.out.println("JobSeeker logged in succesfully.. ");
				case 5:
					JobBuilder jjbuilder=new JobBuilder();
					postAjob(jjbuilder);
					System.out.println("New Job Posted succesfully.. ");
					break;
				case 6:
					JobBuilder jdbuilder=new JobBuilder();
					System.out.println("Enter job id:");
					int job_id=Integer.parseInt(scanner.nextLine());
					int id=deleteAjob(job_id);
					System.out.println("Job Deleted succesfully.. ");
					break;
				case 7:
					JobBuilder viewbuilder=new JobBuilder();
					viewAllJobsByEmployer();
					break;
				default: System.out.println("Invalid option");
				 break;	
				}
			}catch(EmployerException e) {
				e.printStackTrace();
			}
			System.out.println("Enter y to continue..");
			String ch=scanner.nextLine();
			if(!ch.equalsIgnoreCase("y")) {
				break;
			}}}
			
			
			
			
	private static void loginAsJobSeeker(LoginBuilder jobbuilder) {
		// TODO Auto-generated method stub
		System.out.println("Enter username");
		Login loginObject=jobbuilder.
				 withUsername(scanner.nextLine())
				.withPassword(scanner.nextLine())
				.withRole("JobSeeker")
				.build();
		lservice.loginAsEmployer(loginObject);	
		
		
	}




	private static void loginAsEmployer(LoginBuilder lbuilder) throws LoginException {
		// TODO Auto-generated method stub
		System.out.println("Enter username");
		Login loginObject=lbuilder.
				 withUsername(scanner.nextLine())
				.withPassword(scanner.nextLine())
				.withRole("Employer")
				.build();
		lservice.loginAsEmployer(loginObject);	
		
	}




	private static void viewAllJobsByEmployer() throws EmployerException, Exception {
		System.out.println("Enter employer id:");
		Integer id=Integer.parseInt(scanner.nextLine());
		 List <Job> jobList=service.viewAllJobsByEmployer();
		 jobList.stream().filter(j->j.getEmployer().getEmployer_Id()==id)
	       .forEach(System.out:: println);
	        }
	  

	private static Integer deleteAjob(Integer job_id) throws EmployerException {
		
		return service.deleteAJob(job_id);
		
	}





	
	private static void registerJobSeeker(JobSeekerBuilder builder) throws Exception{
		
		
		// TODO Auto-generated method stub
		System.out.println("Enter jobseeker details");
		JobSeeker jobSeekerObject=builder.withJobSeeker_Name(scanner.nextLine())
				.withAddress(scanner.nextLine())
				.withContact_No(Long.parseLong(scanner.nextLine()))
				.withMail_ID(scanner.nextLine())
				.withSkillSet(scanner.nextLine())
				.withLocation_preference(scanner.nextLine())
				.withUsername(scanner.nextLine())
				.withPassword(scanner.nextLine())
				.build();
		try {
			jservice.registerJobSeeker(jobSeekerObject);
		} catch (JobSeekerException e) {
			
			e.printStackTrace();
		}	
	}
	private static int registerEmployer(EmployerBuilder builder) throws Exception {
		System.out.println("Enter employer details:");
		Employer employerObject=builder.withOrganizationName(scanner.nextLine())
		.withAddress(scanner.nextLine())
		.withContactNo(Long.parseLong(scanner.nextLine()))
		.withEmail(scanner.nextLine())
		.withUsername(scanner.nextLine())
		.withPassword(scanner.nextLine())
		.build();
		//.withId(Integer.parseInt(scanner.nextLine()))
		
		

		try {
			service.registerEmployer(employerObject);
		} catch (EmployerException e) {
			
			e.printStackTrace();
		}
		return 0;		
		
	}
	private static void postAjob(JobBuilder jBuilder) throws Exception{
        System.out.println("Enter the job details");
       
        Job jobObject = jBuilder.withTitle(scanner.nextLine())
                .withLocation(scanner.nextLine()).withDescription(scanner.nextLine())
                .withExperience(scanner.nextLine()).withSalary(Double.parseDouble(scanner.nextLine()))
                .withNoticePeriod(scanner.nextLine()).withStatus(scanner.nextLine())
                .withEmail(scanner.nextLine())
                .withContactNo(Long.parseLong(scanner.nextLine())).withSkillSet(scanner.nextLine()).build();
        Employer employer=service.findById(Integer.parseInt(scanner.nextLine()));
        	jobObject.setEmployer(employer);	
        try {
            service.postAjob(jobObject);
        }catch(EmployerException e) {
            e.printStackTrace();
        }
    }

}
