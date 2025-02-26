package basics;

import java.util.Locale;
import java.util.Scanner;

public class TesteProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter with the product data: ");
		
		System.out.print("Name: ");
		p.setName(sc.nextLine());
		
		System.out.print("Price: ");
		p.setPrice(sc.nextDouble());
		
		System.out.print("Quantity in stock: ");
		p.setQuantity(sc.nextInt());
		
		System.out.println(p.toString());
		
		System.out.println("Enter with the number of products to be added in stock: ");
		
		p.addProducts(sc.nextInt());
		System.out.println(p.toString());

		System.out.println("Enter with the number of products to be removed from the stock: ");
		
		p.removeProducts(sc.nextInt());
		System.out.println(p.toString());
		
		
		sc.close();

	}

}
