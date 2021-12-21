package TestNGsample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class forthNG {
	
	@Test
	public void test1() {
		System.out.println("this is a test1...");
	}

	@Test
	public void test2() {
		System.out.println("this is a test2...");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is before method...");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this is after method...");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("this is before class...");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("this is after class...");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before Test...");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("this is after Test...");
	}

}
