package online_shop.com.jdc.work.service;

import online_shop.com.jdc.work.db.ProductDb;
import online_shop.com.jdc.work.product.Product;

public class ProductService {

	ProductDb pddb = new ProductDb();

//	create,read, update , delete;
	public void viewProductById(int id) {


		for (Product p : pddb.getProduct()) {
			if (p.getId() == id) {
				System.out.println("Name: " + p.getName());
				System.out.println("Price: " + p.getPrice());
				System.out.println("Description: " + p.getDescription());
				System.out.println("Quantity: " + p.getQuantity());
				System.out.println("Category: " + p.getCategory());
				System.out.println("Brand: " + p.getBrand());
			}
		}
		System.out.println("Product not found.");
	}

	public void ViewallProduct() {

		for (Product p : ProductDb.getProduct()) {

			System.out.println("Name: " + p.getName());
			System.out.println("Price: " + p.getPrice());
			System.out.println("Description: " + p.getDescription());
			System.out.println("Quantity: " + p.getQuantity());
			System.out.println("Category: " + p.getCategory());
			System.out.println("Brand: " + p.getBrand());

		}

	}
}