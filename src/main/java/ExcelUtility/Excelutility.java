
	package ExcelUtility;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Excelutility {
		public  String excel_username(int a) throws IOException {
			  
			  FileInputStream fil = new FileInputStream(new File("C:\\Users\\Mahesh\\Desktop\\DemoBlazeProject-master\\src\\test\\resources\\Testdata\\ExcelInputs.xlsx"));
			  XSSFWorkbook workbook = new XSSFWorkbook(fil);
			  XSSFSheet sheet=workbook.getSheet("Sheet1");
				  String un=sheet.getRow(a).getCell(0).getStringCellValue();
				  
	            
			return un;
	}
		public  String excel_password(int b) throws IOException {
			  
			  FileInputStream fil = new FileInputStream(new File("C:\\Users\\Mahesh\\Desktop\\DemoBlazeProject-master\\src\\test\\resources\\Testdata\\ExcelInputs.xlsx"));
			  XSSFWorkbook workbook = new XSSFWorkbook(fil);
			  XSSFSheet sheet=workbook.getSheet("Sheet1");
			  String pwd=sheet.getRow(b).getCell(1).getStringCellValue();
			  
	return pwd;
	}
	}



