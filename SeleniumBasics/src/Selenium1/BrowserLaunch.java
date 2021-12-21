package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		String chromeDriverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver cdriver = new ChromeDriver();

		String geckoDriverPath = System.getProperty("user.dir") + "\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
		WebDriver fdriver = new FirefoxDriver();
		
		String msedgeDriverPath = System.getProperty("user.dir") + "\\executables\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", msedgeDriverPath);
		WebDriver edriver = new EdgeDriver();
		
		
	
	}

}
