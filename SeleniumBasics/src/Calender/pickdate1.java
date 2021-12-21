package Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Reusablecodesofselenium.Utils;

public class pickdate1 {

	public static void main(String[] args) {

		WebDriver driver = Utils.setUp("chrome", "https://www.redbus.in/");

		driver.findElement(By.xpath("//label[text()='Date']")).click();

		Utils.calendar(driver, "dec", "2030", "//td[@class='monthTitle']", "//button[text()= '>']");
		Utils.pickdate(driver, "5", driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td")));

	}

}
