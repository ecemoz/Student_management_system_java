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
	
	public student ()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name ");
		this.firstName=in.nextLine();
		
		System.out.print("Enter student last name ");
		this.lastName= in.nextLine();
		
		System.out.print("0-Hazırlık\n1-1.sınıf\n2-2.sınıf\n3-3.sınıf\n4-4.sınıf\nEnter student class level: ");
		this.gradeInt= in.nextInt();
		
		if(gradeInt == 0) {
			gradeYear = "Hazırlık";
		}else if (gradeInt==1) {
			gradeYear = "1. Sınıf";
		}else if (gradeInt==2) {
			gradeYear = "2. Sınıf";
		}else if (gradeInt==3) {
			gradeYear = "3. Sınıf";
		}else if (gradeInt==4) {
			gradeYear = "4. Sınıf";
		}
		
		setStudentID();
	
	}
		
		
		private void setStudentID() {
			id++;
			this.studentID= gradeInt+""+ id;
		}

		public void viewBalance() {
			System.out.println("Dersleri almak için ödenmesi gereken miktar: $"+ tuitionBalance);
		}
		
		public void checkPayment() {
		    System.out.println("Kaç ders almak istediğinizi girin.");
		    Scanner in = new Scanner(System.in);
		    int numberOfCourse = in.nextInt();
		    tuitionBalance = numberOfCourse * costOfCourse;
		    viewBalance();
		    
		    System.out.println("Bütçenizi girin.");
		    int budget = in.nextInt();
		    tuitionBalance = tuitionBalance - budget;
		    
		    if (tuitionBalance <= 0) {
		        System.out.println("Kayıt başarılı. Ders seçimine geçebilirsiniz.");
		        enroll();  // Ders seçimine geçiliyor
		    } else {
		        System.out.println("Ödeme yetersiz. Kayıt başarısız.");
		    }
		}

		public void enroll() {
		    do {    
		        System.out.print("Enter course to enroll (Q to quit): ");
		        Scanner in = new Scanner(System.in);
		        String course = in.nextLine();
		        if (!course.equals("Q")) {
		            courses += course + "\n";
		        } else {
		            break;
		        }
		    } while (true);  // 1!=0 yerine true kullanımı daha anlaşılır
		        
		    System.out.println("ENROLLED IN: \n" + courses);
		}

		
		
		
		
	
	public String showInfo() {
		return "\n\n\nName:" +firstName+ " " +lastName +
				"\nGrade Level: "+ gradeYear+
				"\nStudent ID: "+ studentID+
				"\nEnrolled Courses: \n"+ courses +
				"\nTuition Balance $" + tuitionBalance;		
	}
	
		
		
	
		
		
		


			
		}









		
		
			
		



