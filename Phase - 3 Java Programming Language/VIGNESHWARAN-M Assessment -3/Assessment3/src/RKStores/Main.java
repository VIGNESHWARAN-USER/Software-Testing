package RKStores;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		RKStoresManagement rkObj = new RKStoresManagement();
		
		RKStoresManagement.products.add(new Product(1, "IPhone10", "Mobile", 20000.0, 2.0, 1 ));
		RKStoresManagement.products.add(new Product(3, "Dell", "Laptop", 20000.0, 2.3, 10 ));
		RKStoresManagement.products.add(new Product(5, "IPhone13", "Mobile", 30000.0, 2.0, 8 ));
		RKStoresManagement.products.add(new Product(6, "Lenovo", "Laptop", 34000.0, 2.0, 10 ));
		RKStoresManagement.products.add(new Product(8, "IPhone12", "Mobile", 180000.0, 10.0, 8 ));
		RKStoresManagement.products.add(new Product(7, "IPhone10", "Mobile", 20000.0, 2.0, 1 ));
		RKStoresManagement.products.add(new Product(2, "Samsung", "Mobile", 40000.0, 2.0, 4 ));
		
		
		System.out.println("---------- RK Stores ----------");
		System.out.println("1. Sort by ID");
		System.out.println("2. Sort by Name");
		System.out.println("3. Sort by Price");
		System.out.println("4. Sort by Quantity");
		System.out.println("5. Sort by Discount");
		System.out.println("6. List Mobiles with price more than 40000 ");
		System.out.println("7. Exit");
		
		while(true)
		{
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					rkObj.sortById();
					break;
				case 2:
					rkObj.sortByName();
					break;
				case 3:
					rkObj.sortByPrice();
					break;
				case 4:
					rkObj.sortByQuantity();
					break;
				case 5:
					rkObj.sortByDiscount();
					break;
				case 6:
					rkObj.displayMobilesMorethan40k();
					break;
				case 7:
					System.out.println("Exiting, Thank You!");
					return;
				default:
					System.out.println("Invalid choice, Try Again");
			}
		}
	}
}	
