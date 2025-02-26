package exercises;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class TesteEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		var sc =  new Scanner(System.in);
		
		var employee = new Employee();
		
		System.out.println("Enter with the name, grossSalary and tax of the employee: ");
		employee.setName(sc.nextLine());
		employee.setGrossSalary(sc.nextDouble());
		employee.setTax(sc.nextDouble());
		
		System.out.printf("Employee: %s, $ %.2f%n", employee.getName(), employee.netSalary());
		
		System.out.println("Which percentage to increase salary? ");
		
		employee.increaseSalary(sc.nextDouble());
		
		System.out.printf("Updated Data: %s, $ %.2f%n", employee.getName(), employee.getGrossSalary());
		
		sc.close();

	}

}
