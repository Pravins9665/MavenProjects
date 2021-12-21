package Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Reusablecodesofselenium.Utils;

public class pickdate2 {

	public static void main(String[] args) {

		WebDriver driver = Utils.setUp("chrome", "https://www.dummyticket.com/dummy-ticket-for-visa-application/");

		driver.findElement(By.xpath("//input[@id='dob']")).click();

		WebElement month = driver.findElement(By.cssSelector(".ui-datepicker-month"));
		Utils.dropdown(driver, "text", month, null, "Dec", null);
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Utils.dropdown(driver, "text", year, null, "2000", null);

		Utils.pickdate(driver, "5", driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td")));

	}

}
