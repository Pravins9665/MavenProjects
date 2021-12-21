package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementsamazon {

	public static void main(String[] args) throws InterruptedException {
		String chromedriverpath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cdriver.manage().window().maximize();
		cdriver.get("https://www.amazon.in/");
		List<WebElement> elements = cdriver.findElements(By.cssSelector("div[id='nav-xshop'] a"));
		int count = elements.size();
		System.out.println("number of elements after search are: " + count);
		for (int i = 0; i < count; i++) {
			if (!elements.get(i).getText().isEmpty()) {
				System.out.println(elements.get(i).getText());
				Thread.sleep(1000);
			} else {
				System.out.println("empty: " + i);
				Thread.sleep(1000);
			}

		}

	}

}
