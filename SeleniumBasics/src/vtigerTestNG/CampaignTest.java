package vtigerTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;

public class CampaignTest extends reusables {
	static WebDriver driver;

	@Test(priority = 0)
	public void browserandURL() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String acttitle = driver.getTitle();
		Assert.assertEquals(acttitle, "Dashboard");
	}

	@Test(priority = 1)
	public void addCampaignTest() {
		driver.findElement(By.xpath("//div[@id='appnavigator']/div")).click();
		WebElement marketing = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		WebElement Campaigns = driver.findElement(By.xpath("((//div[@dir='ltr'])[1]/li/a)[1]"));
		mousehover("childtarget", marketing, Campaigns, null, null);
		driver.findElement(By.cssSelector(".addButton")).click();
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("pravin");
		driver.findElement(By.xpath("//input[@name='closingdate']")).click();
		calendar("January", "2022", "(//th[@class='datepicker-switch'])[1]", "(//th[@class='next'])[1]");
		pickdate("15", driver.findElements(By.xpath("//table[@class=' table-condensed']//tbody//tr/td")));
		driver.findElement(By.cssSelector(".saveButton")).click();
		driver.findElement(By.xpath("//a[text()='  All  ']")).click();
		WebElement newCampaigns = driver.findElement(By.xpath("//a[text()='pravin']"));
		String acttext = newCampaigns.getText();
		System.out.println("new created campaign name is  :" + acttext);
		String exptext = "pravin";
		if (acttext.equals(exptext)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
//		Assert.assertEquals(acttext, exptext);
	}

	@Test(priority = 2)
	public void editCampaignTest() {
		driver.findElement(By.xpath("//span[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//*[@id=\"page\"]/ul[3]/li[2]/a")).click();
		driver.findElement(By.xpath("(//tr/td[@class='fieldValue']/div/a)[2]")).click();
		driver.findElement(By.xpath("//ul[@class='select2-results']//li[3]")).click();
		driver.findElement(By.cssSelector(".saveButton")).click();
		WebElement edited = driver.findElement(By.xpath("//span[contains(text(),'Active')]"));
		String acttext = edited.getText();
		System.out.println("edited text after edit :" + acttext);
		String exptext = "Active";
		if (acttext.equals(exptext)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
//		Assert.assertEquals(acttext, exptext);

	}

	@Test(priority = 3)
	public void deleteCampaignTest() {
		driver.findElement(By.xpath("//span[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//body/div[@id='page']/ul[3]/li[3]/a[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Yes')]")).click();

		WebElement emptycamp = driver.findElement(By.xpath("//div[@class='emptyRecordsContent']"));
		String acttext = emptycamp.getText();
		System.out.println("after deleting check the presence of camp:" + acttext);
		String exptext = "No Campaigns found. Create Campaign";
		if (acttext.equals(exptext)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
//		Assert.assertEquals(acttext, exptext);

	}

}
