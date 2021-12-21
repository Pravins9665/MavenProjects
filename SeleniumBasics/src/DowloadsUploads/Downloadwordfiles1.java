package DowloadsUploads;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import Seleniumreusecodes.reusables;

public class Downloadwordfiles1 extends reusables {
	static WebDriver driver;

	@Test(priority = 0)
	public void browserURL() {
		driver = setUp("Chrome", "http://demo.automationtesting.in/FileDownload.html");
	}

	@Test(priority = 1, description = "Download Word File")
	public void wordfile() {
		WebElement inputtext = driver.findElement(By.xpath("//textarea[@id='textbox']"));
		inputtext.sendKeys("Hello, Welcome to Selenium World!");

		WebElement createword = driver.findElement(By.xpath("(//button[text()='Generate File'])[1]"));
		if (createword.isEnabled()) {
			createword.click();
		}
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
	}

	@Test(priority = 2, description = "Download pdf File")
	public void pdffile() {
		driver.findElement(By.id("pdfbox")).sendKeys("Hello, Welcome to Selenium World!");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
	}

}
