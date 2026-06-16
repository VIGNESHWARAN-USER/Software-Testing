package RKStores;

import java.util.Comparator;

public class DiscountComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return (int) (o1.getDiscount() - o2.getDiscount());
	}
	
}
