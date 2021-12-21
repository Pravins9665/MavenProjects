package keyboardmouseoperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Reusablecodesofselenium.Utils;

public class mouehoverCricinfo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Utils.setUp("chrome", "https://www.espncricinfo.com/");

		List<WebElement> menu = driver.findElements(By.xpath("//li/a[@class=\"nav-link\"][1]"));
		Actions act = new Actions(driver);
		for (int i = 0; i < menu.size(); i++) {
			act.moveToElement(menu.get(i)).perform();
			System.out.println(menu.get(i).getText());
			Thread.sleep(2000);
		}
		List<WebElement> submenu = driver
				.findElements(By.xpath("//a[text()='Live Scores']//following-sibling::div//a"));
		if (submenu.size() > 0) {
			for (int j = 0; j < submenu.size(); j++) {
				act.moveToElement(submenu.get(j)).perform();
				System.out.println(submenu.get(j).getText());
				Thread.sleep(2000);
			}
		}

	}
}
