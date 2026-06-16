package RKStores;

public class Product implements Comparable<Product>{
	private int id;
	private String name;
	private String category;
	private double price;
	private double discount;
	private float quantity;
	
	
	public Product(int id, String name, String category, double price, double discount, float quantity) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getCategory() {
		return category;
	}



	public double getPrice() {
		return price;
	}



	public double getDiscount() {
		return discount;
	}



	public float getQuantity() {
		return quantity;
	}

	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", discount="
				+ discount + ", quantity=" + quantity + "]";
	}


	@Override
	public int compareTo(Product o) {
		return this.id - o.getId();
	}
	
	
}
