package exercises;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class TesteStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		var student = new Student();
		
		System.out.println("Enter with the student data:");
		System.out.print("Name: ");
		student.setName(sc.nextLine());
		System.out.print("Nota 1: ");
		student.setN1(sc.nextDouble());
		System.out.print("Nota 2: ");
		student.setN2(sc.nextDouble());
		System.out.print("Nota 3: ");
		student.setN3(sc.nextDouble());
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade() );
		
		if(student.finalGrade() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSED %.2f POINTS ", student.missing());
		} else {
			System.out.println("PASS");
		}

		sc.close();
		
	}

}
