package ProductManagement;

import java.util.*;

public class ProductManagement {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
        ArrayList<ElectronicProduct> ep = new ArrayList<>();
        ArrayList<ClothingProduct> cp = new ArrayList<>();
        
        System.out.println("Product Management System"
        		+ "\n1. Add Electronic Product"
        		+ "\n2. Add Clothing Product"
        		+ "\n3. Display Products"
        		+ "\n4. Exit");
        
        while(true)
        {
        	int choice;
        	System.out.print("Enter your choice: ");
        	choice = sc.nextInt();
        	
        	switch(choice)
        	{
        		case 1:
        			System.out.print("Enter Product ID: ");
        			int id = sc.nextInt();
        			System.out.print("Enter product name: ");
        			String name = sc.next();
        			System.out.print("Enter Product price: ");
        			double price = sc.nextDouble();
        			System.out.print("Enter warranty period: ");
        			int warrantyPeriod = sc.nextInt();
        			
        			ep.add(new ElectronicProduct(id, name, price, warrantyPeriod));
        			
        			System.out.println("Product addedd successfully.");
        			
        			break;
        		case 2:
        			
        			System.out.print("Enter Product ID: ");
        			id = sc.nextInt();
        			System.out.print("Enter product name: ");
        			name = sc.next();
        			System.out.print("Enter Product price: ");
        			price = sc.nextDouble();
        			System.out.print("Enter size: ");
        			String size = sc.next();
        			System.out.print("Enter Material: ");
        			String material = sc.next();
        			
        			cp.add(new ClothingProduct(id, name, price, size, material));
        			
        			System.out.println("Product addedd successfully.");
        			
        			break;
        		case 3:
        			System.out.println("ELECTRONIC PRODUCT INFORMATION:");
        	        for(ElectronicProduct product: ep)
        	        {
        	        	product.displayInfo();
        	        }

        	        System.out.println();

        	        System.out.println("CLOTHING PRODUCT INFORMATION:");
        	        for(ClothingProduct product: cp)
        	        {
        	        	product.displayInfo();
        	        }
        			break;
        		case 4:
        			System.out.println("Thank You!");
        			return;
        		default:
        			System.out.println("Invalid Input. Try Again");
        	}
        }
    }
}