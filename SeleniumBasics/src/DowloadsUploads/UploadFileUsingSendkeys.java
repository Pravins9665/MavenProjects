package DowloadsUploads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Seleniumreusecodes.reusables;

/*
 * In html code of file upload option, If type attribute having file as value
 * then SendKeys method will work to upload file
 */
public class UploadFileUsingSendkeys extends reusables {
	static WebDriver driver;

	@Test
	public void uploadfile1() {
		driver = setUp("Chrome", "https://demoqa.com/upload-download");
		WebElement upload = driver.findElement(By.id("uploadFile"));
		upload.sendKeys("C:\\Users\\admin\\Desktop\\New folder\\AppData.xlsx");
	}

	@Test
	public void uploadfile2() {
		driver = setUp("chrome", "https://omayo.blogspot.com/");
		WebElement upload = driver.findElement(By.id("uploadfile"));
		upload.sendKeys("C:\\Users\\admin\\Desktop\\New folder\\AppData.xlsx");
	}

	@AfterMethod
	public void close() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

}
