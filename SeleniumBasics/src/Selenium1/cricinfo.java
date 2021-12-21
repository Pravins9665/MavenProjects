package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfo {

	public static void main(String[] args) {
		String chromedriverpath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cdriver.manage().window().maximize();
		
		cdriver.get("https://www.espncricinfo.com/");
		
		List<WebElement> menulist = cdriver.findElements(By.cssSelector("div[class=\"collapse navbar-collapse\"]>ul>li>a"));
		int count = menulist.size();
		System.out.println("number of elements in menubar are: "+count);
		for(WebElement Element : menulist)
			System.out.println(Element.getText());

	}

}
