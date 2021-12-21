package XpathLocator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();

		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		cdriver.get("https://demo.vtiger.com/vtigercrm/index.php");

		WebElement username = cdriver.findElement(By.id("username"));
//		String un = username.getAttribute("value");
//		System.out.println(un);

		WebElement signin = cdriver.findElement(By.xpath("//button[text()='Sign in']"));
		System.out.println("text in sign in element: "+signin.getText());
		signin.click();
		
		WebElement idlogo = cdriver.findElement(By.xpath("//a[@class=\"userName dropdown-toggle pull-right\"]"));
		idlogo.click();
		
//		WebElement logout = cdriver.findElement(By.xpath("//a[text()='Sign Out']"));
//		logout.click();
	}

}
