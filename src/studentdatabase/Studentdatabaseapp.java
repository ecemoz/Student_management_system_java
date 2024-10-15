package studentdatabase;

import java.util.Scanner;

public class Studentdatabaseapp {

	public static void main(String[] args) {
		System.out.println("                  _ _.-'`-._ _\r\n"
				+ "                ;.'___YTÜ_____'.;\r\n"
				+ "     _________n.[____________].n_________\r\n"
				+ "    |\"\"_\"\"_\"\"_\"\"||==||==||==||\"\"_\"\"_\"\"_\"\"]\r\n"
				+ "    |\"\"\"\"\"\"\"\"\"\"\"||..||..||..||\"\"\"\"\"\"\"\"\"\"\"|\r\n"
				+ "    |LI LI LI LI||LI||LI||LI||LI LI LI LI|\r\n"
				+ "    |.. .. .. ..||..||..||..||.. .. .. ..|\r\n"
				+ "    |LI LI LI LI||LI||LI||LI||LI LI LI LI|\r\n"
				+ " ,,;;,;;;,;;;,;;;,;;;,;;;,;;;,;;,;;;,;;;,;;,,\r\n"
				+ ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		System.out.println("Ecem Nur Özen Apps TM A.Ş. LTD ŞTİ");
		System.out.print("Enter of new students to enroll:");
		Scanner in =new Scanner(System.in);
		int numOfStudents= in.nextInt();
		student[] students =new student[numOfStudents];
		
		for (int n = 0; n < numOfStudents; n++) {
			students [n] = new student ();
			students[n].checkPayment();
			
		}
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].showInfo());
		}
		
		
		
		
	
	}

}
