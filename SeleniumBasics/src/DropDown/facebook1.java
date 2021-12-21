package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Reusablecodesofselenium.Utils;

public class facebook1 {

	public static void main(String[] args) {

		WebDriver driver = Utils.setUp("chrome", "https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Utils.dropdown(driver, "index", day, 15, null, null);
		Utils.dropdown(driver, "text", month, null, "Nov", null);
		Utils.dropdown(driver, "value", year, null, null, "2000");

	}

}
