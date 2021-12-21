package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"G:\\SETUP\\workspace\\SeleniumBasics\\executables\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();

		// Loading a required URL in browser
		cdriver.get("http://www.google.com");

		// Title of URL
		System.out.println("Title of WebPage: " + cdriver.getTitle());
		// Title length
		System.out.println(cdriver.getTitle().length());

		// Current web page URL
		System.out.println("Current Webpage of URL: " + cdriver.getCurrentUrl());

		// web page source
		System.out.println("Page source: " + cdriver.getPageSource());

		// Close the browser
//		cdriver.close();
	}
}