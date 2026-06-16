package RKStores;

import java.util.ArrayList;
import java.util.Collections;

public class RKStoresManagement {
	public static ArrayList<Product> products = new ArrayList<>();
	
	public static void displayProducts()
	{
		for(Product i: products)
		{
			System.out.println(i);
		}
	}
	
	public void sortById()
	{
		Collections.sort(products);
		
		System.out.println("Products after sorting by Id are: ");
		displayProducts();
	}
	
	public void sortByName()
	{
		Collections.sort(products, new NameComparator());
		
		System.out.println("Products after sorting by name are: ");
		displayProducts();
	}
	
	public void sortByPrice()
	{
		Collections.sort(products, new PriceComparator());
		
		System.out.println("Products after sorting by price are: ");
		displayProducts();
	}
	
	public void sortByDiscount()
	{
		Collections.sort(products, new DiscountComparator());
		
		System.out.println("Products after sorting by discount are: ");
		displayProducts();
	}
	
	public void sortByQuantity()
	{
		Collections.sort(products, new QuantityComparator());
		
		System.out.println("Products after sorting by quantity are: ");
		displayProducts();
	}
	
	public void displayMobilesMorethan40k()
	{
		System.out.println("Mobiles more than 40000 are: ");
		for(Product i: products)
		{
			if(i.getCategory().equals("Mobile") && i.getPrice() >= 40000)
				System.out.println(i);
		}
	}
}
