package online_shop.com.jdc.work.db;

import java.util.ArrayList;
import java.util.List;

import online_shop.com.jdc.work.product.Product;

public class ProductDb {
	
	private static List<Product>  pddb = new ArrayList<Product>();
	
	public static void addProduct(Product pd) {
		pddb.add(pd);
	}
	public static List<Product> getProduct() {
		return pddb;
	}	
}
