package XpathLocator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucelabs {

	public static void main(String[] args) throws InterruptedException {

		String chromedriverpath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		WebDriver cdriver = new ChromeDriver();

		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		cdriver.get("https://www.saucedemo.com/");

//		WebElement username = cdriver.findElement(By.xpath("//div[text(), 'standard_user']"));
//		WebElement username = cdriver.findElement(By.xpath("//div[contains(text(), 'standard')]"));

		WebElement username = cdriver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		username.sendKeys("standard_user");

		WebElement password = cdriver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("secret_sauce");

		WebElement login = cdriver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		login.click();

		WebElement menu = cdriver.findElement(By.xpath("//button[contains(text(), 'Open Menu')]"));
		menu.click();

		WebElement logout = cdriver.findElement(By.xpath("//a[text() = 'Logout']"));
		logout.click();

		Thread.sleep(2000);
		cdriver.close();
	}
}
