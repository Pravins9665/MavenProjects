package TestNGsample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Seleniumreusecodes.reusables;

public class parametersTestNG extends reusables {

	static WebDriver driver;

	@Test(priority = 0)
	public void openbrowserandURL() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		String acttitle = driver.getTitle();
		String exptitle = "OrangeHRM";
		Assert.assertEquals(acttitle, exptitle);
	}

	@Test(priority = 1)
	@Parameters({ "username", "password" })
	public void login(String username, String password) {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();

	}

}
