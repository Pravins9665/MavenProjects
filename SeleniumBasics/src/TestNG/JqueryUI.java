package TestNG;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;


public class JqueryUI extends reusables {
	static WebDriver driver;

	@BeforeTest
	public void browserandURL() {
		driver = setUp("chrome", "https://jqueryui.com/");
		String actual = "jQuery UI";
		Assert.assertEquals(actual, "jQuery UI");
	}

//	@Test(priority = 0)
//	public void draggable() throws InterruptedException {
//		Actions act = new Actions(driver);
//		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
//		driver.switchTo().frame(0);
//		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
//		act.clickAndHold(drag).moveByOffset(280, 150).perform();
//		Thread.sleep(2000);
//
//	}
//
//	@AfterMethod(description = "it will return to home page")
//	public void backtodefaultcontent() throws InterruptedException {
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//h2[@class='logo']")).click();
//		Thread.sleep(1000);
//	}

//	@Test(priority = 1)
//	public void droppable() throws InterruptedException {
//		Actions act = new Actions(driver);
//		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
//		driver.switchTo().frame(0);
//		WebElement dragme = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement drophere = driver.findElement(By.xpath("//div[@id='droppable']"));
//		act.dragAndDrop(dragme, drophere).perform();
//		Thread.sleep(2000);
//	}

	@Test(priority = 2)
	public void sortable() throws InterruptedException {
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		driver.switchTo().frame(0);
		List<WebElement> sortit = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
//		WebElement item7= driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"));
//		WebElement item6= driver.findElement(By.xpath("//ul[@id='sortable']/li[6]"));
//		WebElement item5= driver.findElement(By.xpath("//ul[@id='sortable']/li[5]"));
//		WebElement item4= driver.findElement(By.xpath("//ul[@id='sortable']/li[4]"));
//		WebElement item3= driver.findElement(By.xpath("//ul[@id='sortable']/li[3]"));
//		WebElement item2= driver.findElement(By.xpath("//ul[@id='sortable']/li[2]"));
//		WebElement item1= driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));

//		act.clickAndHold(item1).dragAndDropBy(item1, 0, 222).perform();
//		act.clickAndHold(item6).dragAndDropBy(item6, 0, -250).perform();
//		act.clickAndHold(item5).dragAndDropBy(item5, 0, -200).perform();
//		act.clickAndHold(item4).dragAndDropBy(item4, 0, -150).perform();
//		act.clickAndHold(item3).dragAndDropBy(item3, 0, -100).perform();
//		act.clickAndHold(item2).dragAndDropBy(item2, 0, -50).perform();	
	}

}
