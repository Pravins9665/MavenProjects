package fullflowautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Reusablecodesofselenium.Utils;

public class Opencart {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = Utils.setUp("chrome", "https://demo.opencart.com/");
		Thread.sleep(1000);
		WebElement laptops = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		WebElement alldesktops = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
		
		Utils.mousehover(driver, "childtarget", laptops, alldesktops, null, null);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='HP LP3065']")).click();
		Thread.sleep(1000);
		WebElement date = driver.findElement(By.xpath("//input[@id='input-option225']"));
		date.clear();
		date.sendKeys("2021-11-25");
		Thread.sleep(1000);
		WebElement quantity = driver.findElement(By.xpath("//input[@id='input-quantity']"));
		quantity.clear();
		quantity.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[text()=' View Cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
		Thread.sleep(1000);
	}

}
