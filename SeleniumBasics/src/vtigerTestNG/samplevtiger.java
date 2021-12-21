package vtigerTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;

public class samplevtiger extends reusables {

	WebDriver driver;

	@Test(priority = 1)
	public void OpenBrowserAndURL() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.xpath("//button[@class=\'button buttonBlue\']")).click();

	}

	@Test(priority = 2)
	public void Contact() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class=\'app-icon fa fa-bars\']")).click();
		Thread.sleep(2000);
		WebElement MarketingField = driver
				.findElement(By.xpath("//div[@class=\"menu-items-wrapper app-menu-items-wrapper\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(MarketingField).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\'index.php?module=Contacts&view=List&app=MARKETING\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\'Contacts_listView_basicAction_LBL_ADD_RECORD\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\'Contacts_editView_fieldName_firstname\']")).sendKeys("Abhijeet");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\'Contacts_editView_fieldName_lastname\']")).sendKeys("Londhe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\'btn btn-success saveButton\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\'Contacts_detailView_basicAction_LBL_EDIT\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\'Contacts_editView_fieldName_title\']")).sendKeys("Tester");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\'btn btn-default dropdown-toggle\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Delete Contact']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn confirm-box-ok confirm-box-btn-pad btn-primary\"]")).click();
		Thread.sleep(2000);
		driver.close();

	}
}
