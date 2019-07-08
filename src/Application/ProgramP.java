package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Product; 

public class ProgramP {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		
		
		Product Product = new Product(name, price);
		Product.totalValueInStock();
		
		System.out.println();
		System.out.println("Product data: " + Product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		Product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + Product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		Product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + Product);
		sc.close();
	}
}