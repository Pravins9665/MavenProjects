package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args) {
	    
		System.setProperty("webdriver.edge.driver", ".\\executables\\msedgedriver.exe");
		WebDriver edriver = new EdgeDriver();
		
		edriver.get("https://www.amazon.in/");
		edriver.manage().window().maximize();
		
		String title = edriver.getTitle();
		System.out.println("Title of webpage is: "+title);
		System.out.println("length of title of webpage is: "+edriver.getTitle().length());
		System.out.println("Verify the Title of webpage: "+edriver.getTitle().equals(title));
		
		System.out.println(edriver.findElement(By.cssSelector("li[aria-setsize='8']")).getSize());
		System.out.println();
		edriver.findElement(By.linkText("Amazon Pay")).click();
		System.out.println("current url is: "+edriver.getCurrentUrl());
		
	}

}
