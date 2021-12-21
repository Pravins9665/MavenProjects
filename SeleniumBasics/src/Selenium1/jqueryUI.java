package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Reusablecodesofselenium.Utils;

public class jqueryUI {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Utils.setUp("chrome", "https://jqueryui.com/");
		Actions act = new Actions(driver);
		
	}

}
