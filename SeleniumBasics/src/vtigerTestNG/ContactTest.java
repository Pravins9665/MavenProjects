package vtigerTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;

public class ContactTest extends reusables {

	static WebDriver driver;

	@Test(priority = 0)
	public void browserandURL() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String acttitle = driver.getTitle();
		Assert.assertEquals(acttitle, "Dashboard");
	}

	@Test(priority = 1)
	public void addContactTest() {
		driver.findElement(By.xpath("//div[@id='appnavigator']/div")).click();
		WebElement marketing = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		WebElement Contact = driver.findElement(By.xpath("((//div[@dir='ltr'])[1]/li/a)[3]"));
		mousehover("childtarget", marketing, Contact, null, null);
		driver.findElement(By.xpath("//button[contains(text(), 'Add Contact')]")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("smith");
		driver.findElement(By.cssSelector(".saveButton")).click();
		driver.findElement(By.xpath("//a[text()='  All  ']")).click();
		WebElement newContact = driver.findElement(By.xpath("//a[text()='smith']"));
		String acttext = newContact.getText();
		System.out.println("new created contact lastname is  :" + acttext);
		String exptext = "smith";
		if (acttext.equals(exptext)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
//		Assert.assertEquals(acttext, exptext);
	}

	@Test(priority = 2)
	public void editContactTest() {
		driver.findElement(By.xpath("//span[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//*[@id=\"page\"]/ul[3]/li[2]/a")).click();
//		driver.findElement(By.xpath("(//span[text()='Atlas Jeniffer'])[1]")).click();
//		driver.findElement(By.xpath("//input[@class = 'select2-input']")).sendKeys("mar", Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("MRF");
		driver.findElement(By.cssSelector(".saveButton")).click();
		WebElement edited = driver.findElement(By.xpath("//span[text()='MRF']"));
		String acttext = edited.getText();
		System.out.println("edited text after edit :" + acttext);
		String exptext = "ABC";
		if (acttext.equals(exptext)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
//		Assert.assertEquals(acttext, exptext);

	}

	@Test(priority = 3)
	public void deleteContactTest() {
		driver.findElement(By.xpath("//span[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//body/div[@id='page']/ul[3]/li[3]/a[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Yes')]")).click();

		WebElement emptycamp = driver.findElement(By.xpath("//div[@class='emptyRecordsContent']"));
		String acttext = emptycamp.getText();
		System.out.println("after deleting check the presence of contact:" + acttext);
		String exptext = "No Contacts found. Create or Import Contacts";
		if (acttext.equals(exptext)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
//		Assert.assertEquals(acttext, exptext);

	}

}
