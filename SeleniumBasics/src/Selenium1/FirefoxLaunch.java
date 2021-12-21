package Selenium1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {

//		System.setProperty("webdriver.gecko.driver", "G:\\SETUP\\workspace\\SeleniumBasics\\executables\\geckodriver.exe");
//		// or
//		System.setProperty("webdriver.gecko.driver", "G:/SETUP/workspace/SeleniumBasics/executables/geckodriver.exe");
//		// or
//		System.setProperty("webdriver.gecko.driver", "./executables/geckodriver.exe");
//		// or
		String geckoDriverPath = System.getProperty("user.dir") + "\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
		FirefoxDriver fdriver = new FirefoxDriver();

	}

}
