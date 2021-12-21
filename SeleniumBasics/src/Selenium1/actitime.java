package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		
		String chromedriverpath = System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		WebDriver cdriver = new ChromeDriver();
		
		cdriver.manage().window().maximize();
		cdriver.get("https://demo.actitime.com/login.do");
		
		System.out.println("current page itle is: "+cdriver.getTitle());
	    System.out.println("length of title: "+cdriver.getTitle().length());
	    
	    String url = cdriver.getCurrentUrl();
	    System.out.println("current page url: "+url);
	    System.out.println(url.equals("https://demo.actitime.com/login.do"));
	    
	    WebElement Username = cdriver.findElement(By.id("username"));
	    Username.sendKeys("admin");
	    
//	    cdriver.findElement(By.id("username")).sendKeys("admin");
	    
	    WebElement Password = cdriver.findElement(By.name("pwd"));
	    Password.sendKeys("manager");
	    
	    cdriver.findElement(By.id("loginButton")).click();
	    
	    System.out.println("title after login: "+cdriver.getTitle());
	    Thread.sleep(3000);
	    cdriver.close();

	}
}
