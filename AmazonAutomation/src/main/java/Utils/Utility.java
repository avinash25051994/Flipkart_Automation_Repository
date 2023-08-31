package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	 static String sheet1;
	static String data;
		public static void main(String[] args) throws IOException {
			 
			getExceldata(sheet1, 0, 0);
			
				
		
		}	

	 //screen shot code
	 public static void captureScreen(WebDriver driver, String testID) throws IOException {  
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			String datetime = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File dest = new File ("test-output\\FailedTestScreenshots"+testID+datetime+".jpeg");
				 FileHandler.copy(src,dest);
	}   
	
	
	//Excel Sheet code 
	 
//	public static String getExceldata(String sheet,int row ,int column) throws IOException {
//		
//		 File src=new File("src\\\\main\\\\resources\\\\data\\\\Book1.xlsx");
//		  FileInputStream fis=new FileInputStream(src);
//		  XSSFWorkbook wb=new XSSFWorkbook(fis);
//		  XSSFSheet sheet1=wb.getSheet("Sheet1");
//		  
//		  try {
//		  String data0=sheet1.getRow(1).getCell(0).getStringCellValue();
//		   System.out.println(data0);
//		  //System.out.println("Data from Excel is "+data0);
//		  }
//		  catch(java.lang.IllegalStateException e) {
//		  
//		  
//		   double data=sheet1.getRow(2).getCell(1).getNumericCellValue();
//		   String value = String.valueOf(data);
//		  System.out.println("Data from Excel is "+value);
	
			public static String getExceldata(String sheet,int row ,int column) throws IOException {
	
	    String path = "src\\\\\\\\main\\\\\\\\resources\\\\\\\\data\\\\\\\\Book1.xlsx";
	
        FileInputStream file = new FileInputStream(path);
	
         Workbook book = WorkbookFactory.create(file);

	   Sheet sheet1 = book.getSheet("Sheet1");
	   Row row1 = sheet1.getRow(1);
	   Cell cell = row1.getCell(0);
	   
	
	   String data=cell.getStringCellValue();
//	   double data=cell.getNumericCellValue();
//	   String value = String.valueOf(data);
	   System.out.println(data);
	return data;
	
	
	
			
		
		
		 
			
}
	 
}  
	
	
			
			


 

	
	
	

	     

 
 



 
    			 
	  
   	  
	  
 	  

















	
	




	
	
	
	






	
	
	
	
	
	
	

