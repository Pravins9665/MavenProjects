package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHRM {

	public static void main(String[] args) 
	{
		String msedgedriverpath = System.getProperty("user.dir")+ "\\executables\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", msedgedriverpath);
		WebDriver edriver = new EdgeDriver();
		
		edriver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("Current Page URL is: "+edriver.getCurrentUrl());
		
		System.out.println("Current Page title is: "+edriver.getTitle());
		
		System.out.println("Length of title is: "+edriver.getTitle().length());
		
		System.out.println(" webpage Source is : "+edriver.getPageSource());
		
		System.out.println("Length of webpage Source is : "+edriver.getPageSource().length());
		
		WebElement usernameinputfield = edriver.findElement(By.name("txtUsername"));
		usernameinputfield.sendKeys("Admin");
		
		WebElement passwordinputfield = edriver.findElement(By.name("txtPassword"));
		passwordinputfield.sendKeys("admin123");
		
		WebElement loginbutton = edriver.findElement(By.name("Submit"));
		loginbutton.click();
		
//		WebElement forgotpassword = edriver.findElement(By.linkText("Forgot your password?"));
//		WebElement forgotpassword = edriver.findElement(By.partialLinkText("ot your pass"));
//		forgotpassword.click();
		
//		edriver.close();
	}
}