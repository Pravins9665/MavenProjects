package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena2 {

	public static void main(String[] args) {
		String chromedriverpath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cdriver.manage().window().maximize();

		cdriver.get("https://www.gsmarena.com/");

		cdriver.findElement(By.cssSelector(".brandmenu-v2 li:nth-of-type(4)")).click();

		List<WebElement> pagenumbers = cdriver.findElements(By.cssSelector(".nav-pages a"));
		
		int count = pagenumbers.size();
		System.out.println("number of pages are: " + count);

		for (int i = 0; i < count; i++) {
			if (pagenumbers.get(i).isEnabled()) {
				System.out.println("page numbers: " + pagenumbers.get(i).getText());
			}
		}
		String page1 = cdriver.getCurrentUrl();
		System.out.println("current page url: " + page1);

		for (int i = 0; i < count; i++) {
			pagenumbers.get(i).click();
			System.out.println("URL of current page: " + cdriver.getCurrentUrl());
			pagenumbers = cdriver.findElements(By.cssSelector(".nav-pages a"));
		}
		
	}
}
