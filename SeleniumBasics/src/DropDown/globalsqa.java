package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Reusablecodesofselenium.Utils;

public class globalsqa {

	public static void main(String[] args) {
	
		WebDriver driver = Utils.setUp("chrome", "https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement country = driver.findElement(By.xpath("//select"));
		
		Utils.dropdown(driver, "text", country, null, "India", null);

	}

}
