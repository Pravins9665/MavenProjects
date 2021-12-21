package TestNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;


public class actitimelogin extends reusables {
	static WebDriver driver;
	@Test
	public void testElements(){
		driver= setUp("chrome","https://demo.actitime.com/login.do");
		//get the active element from the web page
		WebElement element=driver.switchTo().activeElement();
		
		String actuser=element.getAttribute("placeholder");
		//verifying username field
		Assert.assertEquals(actuser, "Username");
		element.sendKeys("admin",Keys.TAB);
		String actpwd=element.getAttribute("placeholder");
		//verifying username field
		Assert.assertEquals(actpwd, "Password");
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	}


}
