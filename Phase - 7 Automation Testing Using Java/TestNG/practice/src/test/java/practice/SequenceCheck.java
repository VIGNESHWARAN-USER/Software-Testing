package practice;

import org.testng.annotations.Test;

public class SequenceCheck {
	@Test(priority = 3)
	public void a() {
		System.out.println("Hi");
	}

	@Test(priority = 1)
	public void b() {
		System.out.println("Hello");
	}

	@Test(priority = 2)
	public void c() {
		System.out.println("Welcome");
	}
}
