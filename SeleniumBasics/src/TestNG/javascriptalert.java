package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;

public class javascriptalert extends reusables {
	static WebDriver driver;

	@BeforeTest
	public void browserandURL() {
		driver = setUp("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
	}

	@Test(priority = 1)
	public void alertwithsinglebutton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		System.out.println("text of alert window: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

	@Test(priority = 2)
	public void alertwithchoice() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		System.out.println("text of alert window: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
	}

	@Test(priority = 3)
	public void alertwithtextandchoice() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("selenium");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
	}
}
