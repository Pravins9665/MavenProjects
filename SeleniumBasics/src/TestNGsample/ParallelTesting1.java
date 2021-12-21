package TestNGsample;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Seleniumreusecodes.reusables;

public class ParallelTesting1 extends reusables {

	static WebDriver driver;

	@Test(priority = 0)
	public void actitime() {
		driver = setUp("chrome", "https://demo.actitime.com/login.do");
		String acttitle = driver.getTitle();
		Assert.assertEquals(acttitle, "actiTIME - Login");
	}

	@Test(priority = 1)
	public void orangehrm() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		String acttitle = driver.getTitle();
		Assert.assertEquals(acttitle, "OrangeHRM");
	}
}
