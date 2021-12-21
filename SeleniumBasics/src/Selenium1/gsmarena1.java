package Selenium1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena1 {

	public static void main(String[] args) {
	
		String chromedriverpath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cdriver.manage().window().maximize();
		
		cdriver.get("https://www.gsmarena.com/");
		
		cdriver.findElement(By.cssSelector(".brandmenu-v2 li:nth-of-type(2)")).click();
		List <WebElement> elements = cdriver.findElements(By.cssSelector("div[class=\"makers\"] span"));
		System.out.println("number of elements after search are: " + elements.size());
		for (WebElement ele : elements) {
			System.out.println(ele.getText());
		}

	}

}
