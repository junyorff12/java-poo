package basics;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Triangle x, y;

		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter with the measures of the triangle X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter with the measures of the triangle Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.calculateArea();
		double areaY = y.calculateArea();

		System.out.printf("Area triangle x: %.4f%n", areaX);
		System.out.printf("Area triangle y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Area of triangle X larger!");
		} else {
			System.out.println("Area of trinagle Y larger!");
		}

		sc.close();

	}

	

}
