package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class facebook {

	public static void main(String[] args) {
	//    https://www.facebook.com/
		String edgedriverpath = System.getProperty("user.dir")+"\\executables\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", edgedriverpath);
		WebDriver edriver = new EdgeDriver();
		
		String url = "https://www.facebook.com/";
		edriver.get(url);
		
		System.out.println("current page url is: "+edriver.getCurrentUrl());
		System.out.println("Length of current page url is: "+edriver.getCurrentUrl().length());
		
		System.out.println("title of current page is: "+edriver.getTitle());
		System.out.println("Length of title of page is: "+edriver.getTitle().length());
		
		System.out.println("page surce of facebook is: "+edriver.getPageSource());
		System.out.println("Length of page surce of facebook is: "+edriver.getPageSource().length());
		
		System.out.println(edriver.getCurrentUrl().equals(url));
		
		WebElement emailphoneinputfield = edriver.findElement(By.name("email"));
		emailphoneinputfield.sendKeys("4554545");
		
		WebElement passwordinputfield = edriver.findElement(By.name("pass"));
		passwordinputfield.sendKeys("5454555");
		
		WebElement loginbutton = edriver.findElement(By.name("login"));
		loginbutton.click();
		
		WebElement forgottenpassword = edriver.findElement(By.linkText("Forgotten password?"));
		forgottenpassword.click();
		
		WebElement createnewaccount = edriver.findElement(By.linkText("Create New Account"));
		createnewaccount.click();
		
	}

}
