package TestNGsample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;

public class dataproviderexample extends reusables {

	static WebDriver driver;

	@Test
	public void browserandURL() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		String acttitle = driver.getTitle();
		String exptitle = "OrangeHRM";
		Assert.assertEquals(acttitle, exptitle);
	}

	@Test(dataProvider = "logindetails")
	public void logintest(String username, String password, String validation) {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();

		if (validation.equals("valid")) {
			driver.findElement(By.xpath("//a[@id='welcome']")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
		}
	}

	@DataProvider(name = "logindetails")
	public Object[][] getdata() {
		Object[][] data = { { "Admin", "admin123", "valid" }, { "admin123", "Admin", "invalid" },
				{ "Admin", "admin", "invalid" }, { "Adam", "admin", "invalid" } };
		return data;
	}
}
