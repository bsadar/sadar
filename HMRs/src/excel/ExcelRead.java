package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream ("C:\\Users\\qaplanet\\Desktop\\TestCase.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(file); 
		XSSFSheet sh = wb.getSheet("Sheet2");
		
   
    	  XSSFRow rw=sh.getRow(5); 
		XSSFCell cel=rw.getCell(5); 
		
		
		      
		System.out.println(cel);
     
  
	}

}
