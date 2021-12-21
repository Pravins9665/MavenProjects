package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Reusablecodesofselenium.Utils;

public class hdfcbankdropdown1 {

	public static void main(String[] args) {
		
		WebDriver driver = Utils.setUp("chrome", "https://www.hdfcbank.com/");

		driver.findElement(By.xpath("//div[@class='drp1']//div")).click();
		List<WebElement> protype = driver.findElements(By.xpath("//div[@class='drp1']//div//li"));
		System.out.println("options under product types: " + protype.size());
		
		Utils.dropdown1(driver, protype, "Accounts");

		driver.findElement(By.xpath("//div[@class='drp2']//div")).click();
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='drp2']//div//li"));
		System.out.println("options under product types: " + product.size());
		
		Utils.dropdown1(driver, product, "Salary Accounts");
	}

}
