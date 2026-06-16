package collections;

import java.util.PriorityQueue;

class Mobile implements Comparable<Mobile>
{
	private String name;
	private double price;
	private int ram;
	
	
	

	public Mobile(String name, double price, int ram) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getRam() {
		return ram;
	}



	public void setRam(int ram) {
		this.ram = ram;
	}



	@Override
	public int compareTo(Mobile o) {
		return Integer.compare(o.getRam(), this.ram);
	}



	@Override
	public String toString() {
		return "Name=" + name + " Price=" + price + " RAM=" + ram + "]";
	}
	
	
	
}

public class ComparableExample {
	public static void main(String args[])
	{
		PriorityQueue<Mobile> pq = new PriorityQueue<>();
		
		pq.add(new Mobile("Apple", 10000, 8));
		pq.add(new Mobile("Samsung", 15000, 16));
		pq.add(new Mobile("Oppo", 1000, 6));
		
		while(!pq.isEmpty()) {
		    System.out.println(pq.poll());
		}
	}
}
