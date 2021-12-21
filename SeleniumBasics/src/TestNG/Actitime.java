package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;

public class Actitime extends reusables {

	static WebDriver driver;

	@Test(priority = 0, description = "Open browser & hit URL")
	public void openbrowserwithURL() {
		driver = setUp("Chrome", "https://demo.actitime.com/login.do");
	}

	@Test(priority = 1, description = "Login with valid credentials")
	public void Login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.xpath("//a[@id='loginButton']"));
//		if(login.isEnabled())
//		{
//			login.click();
//		}

	}

	@Test(priority = 2, description = "Click on Tasks & add new task")
	public void newtask() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(1000);
		List<WebElement> addnew = driver.findElements(By.cssSelector("div.addNewMenu>div"));
		dropdown1(addnew, "+ New Tasks");
	}

}
