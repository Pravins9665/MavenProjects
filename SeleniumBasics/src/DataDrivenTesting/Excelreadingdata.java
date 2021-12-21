package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreadingdata {

	public static void main(String[] args) throws IOException {

		String filepath = ".\\datafile\\AppData.xlsx";

		FileInputStream file = new FileInputStream(filepath);

		XSSFWorkbook excel = new XSSFWorkbook(file);

		// 1. getSheet() --> it will return sheet from excel
		XSSFSheet sheet1 = excel.getSheet("LoginDetails");
		// or
		// XSSFSheet sheet1 = excel.getSheetAt(0);

		// 2. getActiveSheetIndex() --> it will return active sheet index
		System.out.println("active sheet index: " + excel.getActiveSheetIndex());

		// 3. getNumberOfSheets() --> it will return number of sheets in excel
		int sheets = excel.getNumberOfSheets();
		System.out.println("number of sheets are: " + sheets);

		// 4. getSheetName() --> it will return names of sheets
		for (int s = 0; s < sheets; s++) {
			System.out.println(excel.getSheetName(s));
		}

		// 5. getRow() --> it will return specific row from sheet
		XSSFRow row1 = sheet1.getRow(1);

		// 6. getLastRowNum() --> it will return number of rows present in sheet
		int rows = sheet1.getLastRowNum();
		System.out.println("numbers of rows are : " + rows);

		// 7. getLastCellNum() --> it will return number of cells in a row
		int cellcount = row1.getLastCellNum();
		System.out.println("numbers of cells in a row are: " + cellcount);
		
		// To read a data from a excel

		// 1. Using For Loop

		for (int r = 0; r <= rows; r++) {
			XSSFRow row = sheet1.getRow(r);

			for (int c = 0; c < cellcount; c++) {
				XSSFCell cell = row.getCell(c);
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case BLANK:
					break;
					default:
						throw new RuntimeException("no supported type of cell");
				}
				System.out.print(" | ");
			}
			System.out.println();

		}

		FileOutputStream fos = new FileOutputStream(filepath);
		
		fos.flush();
		fos.close();
	}

}