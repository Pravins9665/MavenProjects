package Selenium1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class techlistic {

	public static void main(String[] args) {

		String chromedriverpath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		RemoteWebDriver edriver = new ChromeDriver();

		edriver.get("https://www.techlistic.com/");

		edriver.manage().window().maximize();

		//edriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		edriver.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/selenium-tutorials.html\']")).click();
		edriver.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/selenium-tutorials.html\']")).sendKeys(Keys.ENTER);
		System.out.println("url of current page is: "+edriver.getCurrentUrl());
	}
}
