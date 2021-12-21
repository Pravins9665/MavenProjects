package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Reusablecodesofselenium.Utils;

public class openlinknewtab {

	public static void main(String[] args) {

		WebDriver driver = Utils.setUp("chrome", "https://demo.opencart.com/");

		WebElement desktops = driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[text()='Desktops']//following::a[2]"));

		String newtab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		Actions act = new Actions(driver);

		act.moveToElement(desktops).moveToElement(mac).perform();
		mac.sendKeys(newtab);

	}

}
