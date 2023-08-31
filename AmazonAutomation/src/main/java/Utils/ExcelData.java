package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	 
	public static void main(String[] args) throws IOException {
		
		 getExcelsheetdata("Sheet1", 0, 0);	
	  
	}  
	  
		public static String getExcelsheetdata(String sheet, int row ,int column) throws IOException {
	  File src=new File("src\\\\main\\\\resources\\\\data\\\\Book1.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheet("Sheet1");
	  
	  try {
	  String data0=sheet1.getRow(1).getCell(0).getStringCellValue();
	
	  System.out.println("Data from Excel is "+data0);
	  
	  }
	  catch(java.lang.IllegalStateException e) {
	  
	  
	   double data=sheet1.getRow(2).getCell(1).getNumericCellValue();
	   String value = String.valueOf(data);
	  System.out.println("Data from Excel is "+value);
			     
	  }
	return sheet;
	
	
	}  
}

