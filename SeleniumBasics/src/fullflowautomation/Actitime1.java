package fullflowautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Reusablecodesofselenium.Utils;

public class Actitime1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Utils.setUp("chrome", "https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dropdownContainer addNewMenu']/div[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]")).click();
		driver.findElement(By.xpath("//div[@class=\"searchItemList\"]//div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='dropdownButton'])[16]")).click();
		driver.findElement(By.cssSelector("tr.selectProjectRow div.searchItemList>div:nth-of-type(5)")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys("TestNG");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='delete button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		Thread.sleep(1000);

	}
}
