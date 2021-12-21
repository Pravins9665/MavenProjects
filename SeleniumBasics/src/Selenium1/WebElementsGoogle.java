package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsGoogle {

	public static void main(String[] args) {

		String chromedriverpath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		WebDriver cdriver = new ChromeDriver();

		cdriver.get("https://www.google.com/");

		cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cdriver.manage().window().maximize();
		WebElement search = cdriver.findElement(By.name("q"));
		search.sendKeys("manual");

//		List<WebElement> elements = cdriver.findElements(By.cssSelector("div[class='OBMEnb']>ul>li "));
		List<WebElement> elements = cdriver.findElements(By.cssSelector("div[role='presentation'] li "));
		System.out.println("number of elements after search are: " + elements.size());
		for (WebElement ele : elements) {
			System.out.println(ele.getText());
		}
	}
}
