package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;

public class OrangeHRM extends reusables {
	static WebDriver driver;

	@BeforeTest(description = "Open a Brwoser & enter URL")
	public void browserandURL() {
		driver = setUp("Chrome", "https://opensource-demo.orangehrmlive.com/");
		String actualtitle = driver.getTitle();
		String expectedtitle = "OrangeHRM";
		Assert.assertEquals(actualtitle, expectedtitle);
	}

//	@Test(priority = 0, description = "Login with valid credentials")
//	public void login() {
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//	}
	
	@Test(priority = 0, description = "Login with valid credentials")
	public void login() {
		driver.switchTo().activeElement().sendKeys(Keys.TAB, Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Admin", Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin123", Keys.ENTER);
	}

	
	@Test(priority = 1, description = "useing mousehover click on job titles")
	public void jobtitles() {
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		WebElement jobs = driver.findElement(By.xpath("//a[text()='Job']"));
		WebElement jobtitle = driver.findElement(By.xpath("(//a[@class=\"arrow\"])[2]//following::ul[1]/li[1]"));
		mousehover("childtarget", jobs, jobtitle, null, null);
	}

	@Test(priority = 2, description = "Add new job role")
	public void addnewjob() {
		driver.findElement(By.xpath("//input[@id=\"btnAdd\"]")).click();
		driver.findElement(By.xpath("//input[@id='jobTitle_jobTitle']")).sendKeys("API tester1");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}
}
