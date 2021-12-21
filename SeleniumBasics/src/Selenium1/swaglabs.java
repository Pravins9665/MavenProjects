package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swaglabs {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver cdriver = new ChromeDriver();

		cdriver.get("https://www.saucedemo.com/");
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// username
		cdriver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");

		// password
		cdriver.findElement(By.xpath("//*[@id='user-name']//following::input[1]")).sendKeys("secret_sauce");

		// login
		cdriver.findElement(By.xpath("//*[@id='user-name']//following::input[2]")).click();

	}

}
