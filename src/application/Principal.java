package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantity;
		Product product = new Product();
		System.out.println("Enter product data:");
		System.out.println("name: ");
		product.name = sc.nextLine();
		System.out.println("price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: "+product);
		System.out.println();
		
		
		System.out.println("Enter the number of product to be added in stock: ");
		quantity = sc.nextInt();
		product.AddProducts(quantity);
		System.out.println("Update data: "+product);
		System.out.println();
		System.out.println("Enter the number of product to be removed from stock");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		System.out.println("Update data: "+product);
		sc.close();
	}

}
