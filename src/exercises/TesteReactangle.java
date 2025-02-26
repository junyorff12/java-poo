package exercises;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class TesteReactangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);
		
		var rectangle = new Rectangle();
		
		System.out.println("Enter with the rectangle Width and Height");
		rectangle.setWidth(sc.nextDouble());
		rectangle.setHeigth(sc.nextDouble());
		
		System.out.printf("AREA = %.2f\n" , rectangle.area());
		System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f\n" ,rectangle.diagonal());
		
		sc.close();
		
	}

}
