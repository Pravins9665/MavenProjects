package Seleniumreusecodes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XLUtility {

	public FileInputStream fis;
	public FileOutputStream fos;
	public XSSFWorkbook excel;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String path = null;
	WebDriver driver;

	public XLUtility(String path) {
		this.path = path;
	}

	public WebDriver setUp(String browsername, String URL) {

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;

	}
	public int getrowcount(String sheetname) throws IOException {
		fis = new FileInputStream(path);
		excel = new XSSFWorkbook(fis);
		sheet = excel.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		excel.close();
		fis.close();
		return rowcount;
	}

	public int getcellcount(String sheetname, int rownum) throws IOException {
		fis = new FileInputStream(path);
		excel = new XSSFWorkbook(fis);
		sheet = excel.getSheet(sheetname);
		row = sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		excel.close();
		fis.close();
		return cellcount;
	}

	public String getcelldata(String sheetname, int rownum, int colnum) throws IOException {
		fis = new FileInputStream(path);
		excel = new XSSFWorkbook(fis);
		sheet = excel.getSheet(sheetname);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);

		DataFormatter formatter = new DataFormatter();
		String data;
		try {
			data = formatter.formatCellValue(cell);
		} catch (Exception e) {
			data = "";
		}
		excel.close();
		fis.close();
		return data;

	}

	public void setcelldata(String sheetname, int rownum, int colnum, String data) throws IOException {
		fis = new FileInputStream(path);
		excel = new XSSFWorkbook(fis);
		sheet = excel.getSheet(sheetname);
		row = sheet.getRow(rownum);
		cell = row.createCell(colnum);
		cell.setCellValue(data);

		fos = new FileOutputStream(path);
		excel.write(fos);
		excel.close();
		fis.close();
		fos.close();
	}

}
