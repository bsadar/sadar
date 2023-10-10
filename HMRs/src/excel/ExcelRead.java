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
		FileInputStream file= new FileInputStream ("C:\\Users\\qaplanet\\Desktop\\datadriventestingData.xlsx");
		//create workbook object
		XSSFWorkbook wb=new XSSFWorkbook(file); 
		//get sheet in workbook
		XSSFSheet sh = wb.getSheet("inputdata");
                //get row in sheet
		XSSFRow rw=sh.getRow(2); 
		//get cell in row
		XSSFCell cel=rw.getCell(1); 
		//print value cell vallue
	   System.out.println(cel);
     
  
	}

}
