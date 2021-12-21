package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Reusablecodesofselenium.Utils;

public class sorteddropdown {

	public static void main(String[] args) {
		
	WebDriver driver = Utils.setUp("chrome", "https://www.twoplugs.com/");
	
	driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
	
	WebElement drpdrw = driver.findElement(By.xpath("//select[@name='category_id']"));
	
	Select slt = new Select(drpdrw);
	
	Utils.dropdown(driver, null, drpdrw, null, null, null);
	

	}

}
