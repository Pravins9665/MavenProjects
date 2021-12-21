package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writeexcel {

	@Test
	public void write() throws Exception {
		FileInputStream fis = new FileInputStream(".\\datafile\\AppData.xlsx");
		
		Workbook excel = new XSSFWorkbook(fis);
		
		Sheet sheet = excel.getSheet("LoginDetails");
		
		int rowcount = sheet.getLastRowNum();
		
		for(int r = 1; r<=rowcount;r++) {
			Row row = sheet.getRow(r);
			int cellcount =  row.getLastCellNum();
			row.createCell(cellcount).setCellValue("ok");
		}
		FileOutputStream fos = new FileOutputStream(".\\datafile\\AppData.xlsx");
		
		excel.write(fos);
		
		fos.flush();
		fos.close();
		
		
		}

}
