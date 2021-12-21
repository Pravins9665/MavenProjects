package TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;

public class Erailwindowhandles extends reusables {
	static WebDriver driver;

	@BeforeTest
	public void browserandURL() {
		driver = setUp("chrome", "https://etrain.info/in");
		driver.manage().window().maximize();
	}

	@Test
	public void windowhandle() {
		driver.findElement(By.xpath("//a[text()='Reservation Rules']")).click();
		String homewinID = driver.getWindowHandle();

		Set<String> allwinids = driver.getWindowHandles();

		allwinids.remove(homewinID);
		System.out.println("All win ids after removing homewinid: " + allwinids);

		String childwinID = allwinids.iterator().next();
		driver.switchTo().window(childwinID);
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.xpath("//a[text()='Mobile Ticketing Services']")).click();

//		driver.switchTo().window(child2winID);
//		driver.findElement(By.xpath("//span[contains(text(), 'https://www.utsonmobile.indianrail.gov.in')]")).click();

	}

}
