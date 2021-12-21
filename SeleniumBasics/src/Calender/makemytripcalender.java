package Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Reusablecodesofselenium.Utils;

public class makemytripcalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = Utils.setUp("chrome", "https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//body")).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();

		Utils.calendar(driver, "January", "2022", "//div[contains(text(),'January 2022')]",
				"//span[@aria-label='Next Month']");
		Utils.pickdate(driver, "25", driver.findElements(By.xpath("(//div[@class='DayPicker-Week']/div//div)[25]")));
	}

}
