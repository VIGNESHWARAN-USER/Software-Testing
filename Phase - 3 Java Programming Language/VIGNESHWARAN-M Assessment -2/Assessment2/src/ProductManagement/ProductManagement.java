package ProductManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ProductManagement {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader bf = new BufferedReader(new FileReader("src/ProductManagement/input.txt"));
		
    	
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
        	String[] array = bf.readLine().split(" ");
        	System.out.print("Enter your choice: ");
        	choice = Integer.parseInt(array[0]);
        	
        	switch(choice)
        	{
        		case 1:
        			System.out.print("Enter Product ID: ");
        			int id = Integer.parseInt(array[1]);
        			System.out.println(id);
        			System.out.print("Enter product name: ");
        			String name = array[2];
        			System.out.println(name);
        			System.out.print("Enter Product price: ");
        			double price = Double.parseDouble(array[3]);
        			System.out.println(price);
        			System.out.print("Enter warranty period: ");
        			int warrantyPeriod = Integer.parseInt(array[4]);
        			System.out.println(warrantyPeriod);
        			
        			ep.add(new ElectronicProduct(id, name, price, warrantyPeriod));
        			
        			System.out.println("Product addedd successfully.");
        			
        			break;
        		case 2:
        			
        			System.out.print("Enter Product ID: ");
        			id = Integer.parseInt(array[1]);
        			System.out.println(id);
        			System.out.print("Enter product name: ");
        			name = array[2];
        			System.out.println(name);
        			System.out.print("Enter Product price: ");
        			price = Double.parseDouble(array[3]);
        			System.out.println(price);
        			System.out.print("Enter size: ");
        			String size = array[4];
        			System.out.println(size);
        			System.out.print("Enter Material: ");
        			String material = array[5];
        			System.out.println(material);
        			
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