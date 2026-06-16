package ProductManagement;

public class ClothingProduct extends Product{
	private String size;
	private String material;
	
	public ClothingProduct(int productId, String productName, double price, String size, String material) {
		super(productId, productName, price);
		this.size = size;
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public String getMaterial() {
		return material;
	}

	@Override
	public void displayInfo() {
	    System.out.println("ProductId : " + getProductId());
	    System.out.println("ProductName : " + getProductName());
	    System.out.println("Price : " + getPrice());
	    System.out.println("Size : " + size);
	    System.out.println("Material : " + material);
	}
}
