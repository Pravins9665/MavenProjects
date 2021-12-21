package TestNGsample;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority = 2)
	public void M1() {
		System.out.println("This is PositivePriority");
	}
	
	@Test(priority = -1)
	public void M2() {
		System.out.println("This is NegativePriority");
	}
	@Test
	public void M3() {
		System.out.println("This is WithoutPriority");
	}

}
