package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomationTestSite {

	public static void main(String[] args) {
	
		String edgedriverpath = System.getProperty("user.dir")+"\\executables\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", edgedriverpath);
		WebDriver edriver = new EdgeDriver();
		
		edriver.get("https://demosite.executeautomation.com/Login.html");
		
		System.out.println("Title of webpage is: "+edriver.getTitle());
		System.out.println("Length of title of webpage is: "+edriver.getTitle().length());
		
		System.out.println("URI of current page is: "+edriver.getCurrentUrl());
		System.out.println("Verifying the URI: "+edriver.getCurrentUrl().equals("https://demosite.executeautomation.com/Login.html"));
		
		// name locator
		WebElement usernameinputfield = edriver.findElement(By.name("UserName"));
		usernameinputfield.sendKeys("execution");
		
		edriver.findElement(By.name("Password")).sendKeys("admin");
		
		// Tag & attribute CSS Selectors
		edriver.findElement(By.cssSelector("input[value='Login']")).click();
	    System.out.println("Current URL after login is: "+edriver.getCurrentUrl());
	    
	    edriver.findElement(By.cssSelector("#FirstName")).sendKeys("elon");
	    edriver.findElement(By.cssSelector("#MiddleName")).sendKeys("musk");
	    edriver.findElement(By.cssSelector("[name = 'Male']")).click();
	    edriver.findElement(By.cssSelector("input[name = 'english']")).click();
	    edriver.findElement(By.cssSelector("input[name = 'Hindi']")).click();
	    edriver.findElement(By.cssSelector("[name = 'Save']")).click();
			
	}
}