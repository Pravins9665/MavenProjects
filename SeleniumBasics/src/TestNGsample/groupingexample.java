package TestNGsample;

import org.testng.annotations.Test;

public class groupingexample {

	@Test(groups = { "Sanity" })
	public void testcase1() {
		System.out.println("this is testcase1...");
	}

	@Test(groups = { "Sanity" })
	public void testcase2() {
		System.out.println("this is testcase2...");
	}

	@Test(groups = { "Regression" })
	public void testcase3() {
		System.out.println("this is testcase3...");
	}

	@Test(groups = { "Regression" })
	public void testcase4() {
		System.out.println("this is testcase4...");
	}

	@Test(groups = { "Sanity", "Regression" })
	public void testcase5() {
		System.out.println("this is testcase5...");
	}

}
