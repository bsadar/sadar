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
		
		//get excel file from folder
		FileInputStream file= new FileInputStream ("C:\\Users\\qaplanet\\Desktop\\TestCase.xlsx");
		//create workbook object
		XSSFWorkbook wb=new XSSFWorkbook(file); 
		//get sheet in workbook
		XSSFSheet sh = wb.getSheet("Sheet2");
                //get row in sheet
		XSSFRow rw=sh.getRow(4); 
		//get cell in row
		XSSFCell cel=rw.getCell(2); 
		//print value cell vallue
	   System.out.println(cel);
     
  
	}

}
