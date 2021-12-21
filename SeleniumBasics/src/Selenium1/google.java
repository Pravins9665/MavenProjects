package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {

	public static void main(String[] args) {

//		String edgedriverpath = System.getProperty("user.dir")+"\\executables\\msedgedriver.exe";
//		System.setProperty("webdriver.edge.driver", edgedriverpath);

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver edriver = new ChromeDriver();

		// implicit waits
		edriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		edriver.get("https://www.google.com/");

		System.out.println("title of the webpage is: " + edriver.getTitle());

		System.out.println("html code(page source) of page is: " + edriver.getPageSource());

		System.out.println("current webpage url is: " + edriver.getCurrentUrl());

		WebElement searchbar = edriver.findElement(By.name("q"));
		searchbar.sendKeys("Automation testing");

		edriver.findElement(By.cssSelector("input[aria-label='Google Search']")).click();
		System.out.println("current webpage url is: " + edriver.getCurrentUrl());
		edriver.navigate().back();
		edriver.navigate().forward();
		edriver.navigate().refresh();

	}

}
