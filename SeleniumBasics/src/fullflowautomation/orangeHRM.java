package fullflowautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Reusablecodesofselenium.Utils;

public class orangeHRM {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Utils.setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		Thread.sleep(2000);
		WebElement jobs = driver.findElement(By.xpath("//a[text()='Job']"));
		WebElement jobtitle = driver.findElement(By.xpath("(//a[@class=\"arrow\"])[2]//following::ul[1]/li[1]"));
		Utils.mousehover(driver, "childtarget", jobs, jobtitle, null, null);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"btnAdd\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='jobTitle_jobTitle']")).sendKeys("API testers");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Thread.sleep(2000);
		List<WebElement> listofjobs = driver.findElements(By.xpath("//tbody/tr//td"));
		Thread.sleep(2000);
		Utils.Checkbox(driver, listofjobs, "API testers");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
		driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
		Thread.sleep(2000);
	}

}
