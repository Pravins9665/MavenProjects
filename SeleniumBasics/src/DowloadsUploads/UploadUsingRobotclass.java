package DowloadsUploads;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;

public class UploadUsingRobotclass extends reusables {

	static WebDriver driver;

	@Test(enabled = false)
	public void uploadfile1() throws AWTException {
		driver = setUp("Chrome", "https://demoqa.com/upload-download");
		WebElement upload = driver.findElement(By.id("uploadFile"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", upload);
		Robot robot = new Robot();
		robot.delay(2000);
		
		// this will copy the file path which we are uploading
		StringSelection ss = new StringSelection("C:\\Users\\admin\\Desktop\\New folder\\AppData.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//Paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		// press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@Test
	public void uploadfile2() throws AWTException {
		driver = setUp("chrome", "https://omayo.blogspot.com/");
		WebElement upload = driver.findElement(By.id("uploadfile"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", upload);
		Robot robot = new Robot();
		robot.delay(2000);
		
		// this will copy the file path which we are uploading
		StringSelection ss = new StringSelection("C:\\Users\\admin\\Desktop\\New folder\\AppData.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//Paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		// press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@AfterMethod
	public void close() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
}
