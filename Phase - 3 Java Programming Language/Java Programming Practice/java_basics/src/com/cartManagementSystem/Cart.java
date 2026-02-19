package com.cartManagementSystem;

import java.util.*;

public class Cart {
	private int productId = 0;
	private ArrayList<Product> products = new ArrayList<>();
	
	public void addProduct(Product product)
	{
		product.setProductId(++productId);
		products.add(product);
		System.out.println("Product added successfully.");
	}
	
	public void removeProduct(int productId)
	{
		for(Product product: products)
		{
			if(product.getProductId() == productId)
			{
				products.remove(productId-1);
				System.out.println("The product deleted successfully");
				return;
			}
		}
		System.out.println("Product not found.");
	}
	
	public double calculateCartTotal()
	{
		double total = 0;
		for(Product product: products)
		{
			total += product.calculateTotal();
		}
		return total;
	}
	
	public void displayCartItems()
	{
		if(products.size() == 0)
		{
			System.out.println("The cart is empty");
			return;
		}
		System.out.println("---- Product Details -----");
		for(Product product: products)
		{
			System.out.println(product.getProductDetails());
			System.out.println();
		}
	}
}
