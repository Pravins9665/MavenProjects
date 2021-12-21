package keyboardmouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Reusablecodesofselenium.Utils;

public class mousehoveropencart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Utils.setUp("chrome", "https://demo.opencart.com/");

		WebElement desktops = driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[text() = 'Desktops']//following::a[2]"));

		Utils.mousehover(driver, "targetonly", desktops, null, null, null);
		Thread.sleep(3000);
		Utils.mousehover(driver, "targetwithcordinates", desktops, null, 100, 0); //laptops
		Thread.sleep(3000);
		Utils.mousehover(driver, "targetwithcordinates", desktops, null, 200, 0); //components
		Thread.sleep(3000);
		Utils.mousehover(driver, "targetwithcordinates", desktops, null, 300, 0); //tablets
		Thread.sleep(3000);
		Utils.mousehover(driver, "targetwithcordinates", desktops, null, 400, 0); //softwares
		Thread.sleep(3000);
		Utils.mousehover(driver, "targetwithcordinates", desktops, null, 500, 0); //phone
		Thread.sleep(3000);
		Utils.mousehover(driver, "targetwithcordinates", desktops, null, 600, 0); //cameras
		Thread.sleep(3000);
		Utils.mousehover(driver, "targetwithcordinates", desktops, null, 700, 0); //mp3
		Thread.sleep(3000);
		Utils.mousehover(driver, "cordinatesonly", null, null, -700, 0);
		Thread.sleep(5000);
		Utils.mousehover(driver, "childtarget", desktops, mac, null, null);

	}

}
