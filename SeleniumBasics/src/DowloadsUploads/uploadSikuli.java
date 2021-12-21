package DowloadsUploads;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import Reusablecodesofselenium.Utils;

public class uploadSikuli {

	public static void main(String[] args) throws Exception {

		WebDriver driver = Utils.setUp("Chrome", "http://demo.automationtesting.in/Register.html");

		WebElement upload = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		/*
		 * When we try to click on browse file to upload files, sometimes direct
		 * click may not work. So we have to use Actions class to perform click
		 * operation.
		 */

		// 1. Using Actions class(it will work for all browsers)
		Actions act = new Actions(driver);
		act.click(upload).perform();
		
		// or
		// 2. Using javacsriptExecutor (it may not work at all time)
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].click();", upload);

		// location of openbutton & file name screenshots
		String pngfilepath = ".\\SeleniumBasics\\datafile\\";
		// location of file to be upload
		String uploadfilepath = ".\\SeleniumBasics\\ScreenShots\\";

		// Pattern class with passing location with filenames 
		Pattern inputtextbox = new Pattern(pngfilepath + "inputtextbox.PNG");
		Pattern openbutton = new Pattern(pngfilepath + "openbutton.PNG");
		Thread.sleep(2000);
		// create screem class
		Screen s = new Screen();
		// wait for screen
		s.wait(inputtextbox, 10);
		// this method will type the path location of file 
		s.type(inputtextbox, uploadfilepath + "macbook.PNG");
		// click method will click on 
		s.click(openbutton);

	}

}
