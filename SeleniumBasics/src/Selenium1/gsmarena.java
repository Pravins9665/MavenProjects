package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena {

	public static void main(String[] args) {
		String chromedriverpath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cdriver.manage().window().maximize();

		cdriver.get("https://www.gsmarena.com/");

		List<WebElement> mobiles = cdriver.findElements(By.cssSelector(".brandmenu-v2 li"));

		int count = mobiles.size();
		System.out.println("Number of moible companies: " + count);
		for (WebElement Cnames : mobiles)
			System.out.println(Cnames.getText());
	}

}
