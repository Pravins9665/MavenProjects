package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Reusablecodesofselenium.Utils;

public class multichoicedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Utils.setUp("chrome", "https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.xpath("//input[@id=\"justAnInputBox\"]")).click();

//		Utils.dropdown2(driver,
//				"//div/h3[text()='Multi Selection']//following-sibling::div//span[@class='comboTreeItemTitle']",
//				"choice 1", "choice 3");
//
//		Utils.dropdown2(driver,
//				"//div/h3[text()='Multi Selection']//following-sibling::div//span[@class='comboTreeItemTitle']",
//				"choice 1", "choice 3", "choice 2 1", "choice 2 3", "choice 6 1", "choice 6 2 2");

		Utils.dropdown2(driver,
				"//div/h3[text()='Multi Selection']//following-sibling::div//span[@class='comboTreeItemTitle']", "all");
	}

}
