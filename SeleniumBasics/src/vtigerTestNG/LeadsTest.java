package vtigerTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;

public class LeadsTest extends reusables {

	static WebDriver driver;

	@Test(priority = 0)
	public void browserandURL() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String acttitle = driver.getTitle();
		Assert.assertEquals(acttitle, "Dashboard");
	}

	@Test(priority = 1)
	public void LeadsTest() {
		driver.findElement(By.xpath("//div[@id='appnavigator']/div")).click();
		WebElement marketing = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		WebElement Leads = driver.findElement(By.xpath("((//div[@dir='ltr'])[1]/li/a)[2]"));
		mousehover("childtarget", marketing, Leads, null, null);
		driver.findElement(By.xpath("//button[@id='Leads_listView_basicAction_LBL_ADD_RECORD']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shinde");
		driver.findElement(By.cssSelector(".saveButton")).click();
		driver.findElement(By.xpath("//a[text()='  All  ']")).click();
		WebElement newLeads = driver.findElement(By.xpath("//a[text()='Shinde']"));
		String acttext = newLeads.getText();
		System.out.println("new created leads name is  :" + acttext);
		String exptext = "Shinde";
		
		if (acttext.equals(exptext)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
//		Assert.assertEquals(acttext, exptext);
	}

	@Test(priority = 2)
	public void editLeadsTest() {
		driver.findElement(By.xpath("//span[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//*[@id=\"page\"]/ul[3]/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("google");
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("https://www.google.com");
		driver.findElement(By.cssSelector(".saveButton")).click();
		WebElement edited = driver.findElement(By.xpath("//span[contains(text(),'google')]"));
		String acttext = edited.getText();
		String exptext = "google";
		if (acttext.equals(exptext)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
//		Assert.assertEquals(acttext, exptext);
	}

	@Test(priority = 3)
	public void deleteLeadsTest() {
		driver.findElement(By.xpath("//span[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//body/div[@id='page']/ul[3]/li[3]/a[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Yes')]")).click();
		driver.findElement(By.xpath("//a[text()='  All  ']")).click();
		driver.findElement(By.xpath("//div/span/input[@type='checkbox']")).click();
		WebElement selectedleads = driver.findElement(By.xpath("//span[@id='totalRecordsCount']"));
		String actvalue = selectedleads.getAttribute("value");
		System.out.println("selected leads: " + actvalue);

		if (actvalue.equals(null)) {
			Assert.assertTrue(false);
		} else {
			Assert.assertTrue(true);
		}

	}
}
