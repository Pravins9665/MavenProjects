package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Reusablecodesofselenium.Utils;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		{

			WebDriver driver = Utils.setUp("Chrome", "https://demo.opencart.com/");

			// Full page screenshot

			TakesScreenshot ts = (TakesScreenshot) driver;
			File file = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(".\\ScreenShots\\HomePage.png");
			FileUtils.copyFile(file, target);

			// Specific section of page

			WebElement featured = driver.findElement(By.xpath("//div[@id='content']//div[@class='row']"));
			File file1 = featured.getScreenshotAs(OutputType.FILE);
			File target1 = new File(".\\ScreenShots\\Featuredproducts.png");
			FileUtils.copyFile(file1, target1);

			// Specific web element screenshot

			WebElement macbook = driver.findElement(By.xpath("//img[@title='MacBook']"));
			File file2 = macbook.getScreenshotAs(OutputType.FILE);
			File target2 = new File(".\\ScreenShots\\macbook.png");
			FileUtils.copyFile(file2, target2);

		}

	}
}
