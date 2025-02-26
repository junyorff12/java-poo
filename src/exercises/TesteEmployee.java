package exercises;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class TesteEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		var sc =  new Scanner(System.in);
		
		var employee = new Employee();
		
		System.out.println("Enter with the data of the employee: ");
		System.out.println("Name: ");
		employee.setName(sc.nextLine());
		System.out.println("GrossSalary: ");
		employee.setGrossSalary(sc.nextDouble());
		System.out.println("Tax: ");
		employee.setTax(sc.nextDouble());
		
		System.out.println("Employee" + employee);
		
		
		System.out.println("Which percentage to increase salary? ");
		
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated Data: " + employee);
		
		sc.close();

	}

}
