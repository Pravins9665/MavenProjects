package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Seleniumreusecodes.reusables;

public class example extends reusables {

	String appUrl, userName, password, expectedTitle;
	WebDriver driver;

	public String readTestData(String fileName, String sheetName, int rowNum, int cellNum) throws IOException {
		// 1. File location
		FileInputStream fis = new FileInputStream(fileName);
		// 2. Create an instance of required workbook
		Workbook workbook = new XSSFWorkbook(fis);
		// 3. get sheet
		Sheet sheet = workbook.getSheet(sheetName);
		// 4. get row
		Row row = sheet.getRow(rowNum);
		// 5. cell operation
		return row.getCell(cellNum).getStringCellValue();
	}

	@BeforeTest
	public void getAppData() throws IOException {
		appUrl = readTestData(".\\datafile\\AppData.xlsx", "Sheet2", 1, 0);
		userName = readTestData(".\\datafile\\AppData.xlsx", "Sheet2", 1, 1);
		password = readTestData(".\\datafile\\AppData.xlsx", "Sheet2", 1, 2);
		expectedTitle = readTestData(".\\datafile\\AppData.xlsx", "Sheet2", 1, 3);
	}

	@BeforeMethod
	public void setUp() {
		driver = setUp("chrome", appUrl);
	}

	@Test
	public void loginIntoActitimeApp() throws InterruptedException {
		driver.switchTo().activeElement().sendKeys(userName, Keys.TAB);
		driver.switchTo().activeElement().sendKeys(password, Keys.ENTER);
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle().trim(), expectedTitle.trim(),
				"Either Actitime home page title got changed or page is not loaded properly");
	}

	@Test
	public void testPosition() {
		WebElement urName = driver.findElement(By.name("username"));
		Point unPoint = urName.getLocation();
		int unY = unPoint.getY();
		int unX = unPoint.getX();
		System.out.println("username x and y cords: " + unX + " " + unY);

		WebElement pwd = driver.findElement(By.name("pwd"));
		int pwdY = pwd.getLocation().getY();
		int pwdX = pwd.getLocation().getX();
		System.out.println("password x and y cords: " + pwdX + " " + pwdY);
		System.out.println(unY < pwdY);
	}

	@AfterMethod
	public void cleanUp() {
		driver.close();
	}
}
