package com.cartManagementSystem;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	public Product(String productName, double price, int quantity)
	{
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	
	public int getProductId()
	{
		return productId;
	}
	
	public String getProductDetails()
	{
		return "Product ID: "+productId+
				"\nProduct Name: "+productName+
				"\nProduct Price: "+price+
				"\nProduct Quantity: "+quantity;
	}
	
	public 	void setQuantity(int newQty)
	{
		quantity = newQty;
	}
	
	public double calculateTotal()
	{
		return price*quantity;
	}
}
