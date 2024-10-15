package studentdatabase;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Scanner;

public class student {


	private String firstName;
	private String lastName;
	private int gradeInt;
	private String gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id= 1000;
	private int numberOfCourse;
	private int budget;
	
	public student ()
	{
		System.out.println("ENROLL NEW STUDENT");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName=in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName= in.nextLine();
		
		System.out.print("Press 0 for Prep \n Press 1 for Freshman-\n Press 2 for Sophmore \n Press 3 for Junior\n Press 4 for Senior\n Enter student class level: ");
		this.gradeInt= in.nextInt();
		
		if(gradeInt == 0) {
			gradeYear = " Prep";
		}else if (gradeInt==1) {
			gradeYear = "Freshman";
		}else if (gradeInt==2) {
			gradeYear = "Sophmore";
		}else if (gradeInt==3) {
			gradeYear = "Junior";
		}else if (gradeInt==4) {
			gradeYear = "Senior";
		}
		
		setStudentID();
	
	}
		
		
		private void setStudentID() {
			id++;
			this.studentID= gradeInt+""+ id;
		}

		public void viewBalance() {
			System.out.println("The amount to be paid for enrolling in courses: $"+ tuitionBalance);
		}
		
		public void checkPayment() {
		    System.out.println("Enter how many courses you want to enroll.");
		    Scanner in = new Scanner(System.in);
		    numberOfCourse = in.nextInt();
		    tuitionBalance = numberOfCourse * costOfCourse;
		    viewBalance();
		    
		    System.out.println("Enter your budget.");
		    budget = in.nextInt();
		    tuitionBalance = tuitionBalance - budget;
		    budget = -tuitionBalance;
		   
		    
		    if (tuitionBalance <= 0) {
		        System.out.println("Entered amount is enough. You can continue enrolling your courses.");
		        enroll(); 
		    } else {
		        System.out.println("Entered amount isn't enough. You can't enroll.");
		    } 
		}

		public void enroll() {
			int i=0;
		    do {   
		    	
		    	if(i>= numberOfCourse) {
		    		System.out.println("Courses are successfully enrolled.");
		    		break;
		    	}
		        System.out.print("Enter course to enroll: ");
		        Scanner in = new Scanner(System.in);
		        String course = in.nextLine();
		        courses += "--" + course + "\n";
	            i++;
	            
		    } while (true); 
		        
		    //System.out.println("ENROLLED IN: \n" + courses);
		}

		
		
		
	public String showInfo() {
		return "\n\n*************************"+"\nName:" +firstName+ " " +lastName +
				"\nGrade Level: "+ gradeYear+
				"\nStudent ID: "+ studentID+
				"\nEnrolled Courses: \n"+ courses +
				"Budget: $" + budget;		
	}
	
		
		
	
		
		
		


			
		}









		
		
			
		



