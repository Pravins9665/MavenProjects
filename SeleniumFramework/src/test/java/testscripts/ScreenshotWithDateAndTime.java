package testscripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotWithDateAndTime {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		TakesScreenshot ss = ((TakesScreenshot) driver);
		File cpFile = ss.getScreenshotAs(OutputType.FILE);

		// take current date and time
		SimpleDateFormat f = new SimpleDateFormat("ddMMyyy HHmmss");
		Date date = new Date();
		System.out.println(date);
		System.out.println(f.format(date));
		String abc = f.format(date).replace("/", " ");
		String exactpathfilename = abc.replace(" ", " ").replace(":", " ");
		System.out.println(exactpathfilename);

		String capturepath = "D:\\Selenium Software\\screenshots\\" + exactpathfilename + ".png";

		try {
			// save the ss in destination path
			FileUtils.copyFile(cpFile, new File(capturepath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();

	}
}
