package Program1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class firstprogram {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Online Resume Builder!");
	        System.out.println("Let's start building your resume.");

	        // Collect user information
	        System.out.print("Enter your full name: ");
	        String fullName = scanner.nextLine();

	        System.out.print("Enter your email address: ");
	        String email = scanner.nextLine();

	        System.out.print("Enter your phone number: ");
	        String phoneNumber = scanner.nextLine();

	        System.out.print("Enter your address: ");
	        String address = scanner.nextLine();

	        System.out.print("Enter your career objective: ");
	        String careerObjective = scanner.nextLine();

	        System.out.println("Enter your educational background:");
	        System.out.print("Enter your degree: ");
	        String degree = scanner.nextLine();
	        System.out.print("Enter your university: ");
	        String university = scanner.nextLine();
	        System.out.print("Enter your graduation year: ");
	        String graduationYear = scanner.nextLine();

	        System.out.println("Enter your work experience (if any):");
	        System.out.print("Enter your job title: ");
	        String jobTitle = scanner.nextLine();
	        System.out.print("Enter the company name: ");
	        String companyName = scanner.nextLine();
	        System.out.print("Enter the employment period: ");
	        String employmentPeriod = scanner.nextLine();

	        // Generate the resume content
	        String resume = generateResume(
	                fullName, email, phoneNumber, address, careerObjective,
	                degree, university, graduationYear,
	                jobTitle, companyName, employmentPeriod
	        );

	        // Save the resume to a file
	        try {
	            FileWriter fileWriter = new FileWriter("resume.txt");
	            fileWriter.write(resume);
	            fileWriter.close();
	            System.out.println("Your resume has been saved as 'resume.txt'");
	        } catch (IOException e) {
	            System.err.println("An error occurred while saving the resume.");
	            e.printStackTrace();
	        }
	    }

	    public static String generateResume(
	            String fullName, String email, String phoneNumber, String address, String careerObjective,
	            String degree, String university, String graduationYear,
	            String jobTitle, String companyName, String employmentPeriod) {
	        StringBuilder resume = new StringBuilder();

	        resume.append("======= Resume =======\n");
	        resume.append("Full Name: ").append(fullName).append("\n");
	        resume.append("Email: ").append(email).append("\n");
	        resume.append("Phone Number: ").append(phoneNumber).append("\n");
	        resume.append("Address: ").append(address).append("\n");
	        resume.append("\n");
	        resume.append("Career Objective:\n").append(careerObjective).append("\n");
	        resume.append("\n");
	        resume.append("Education:\n");
	        resume.append("Degree: ").append(degree).append("\n");
	        resume.append("University: ").append(university).append("\n");
	        resume.append("Graduation Year: ").append(graduationYear).append("\n");
	        resume.append("\n");
	        resume.append("Work Experience:\n");
	        resume.append("Job Title: ").append(jobTitle).append("\n");
	        resume.append("Company Name: ").append(companyName).append("\n");
	        resume.append("Employment Period: ").append(employmentPeriod).append("\n");

	        return resume.toString();
	    }
	}


