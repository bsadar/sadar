package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Read {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream ("C:\\Users\\qaplanet\\Desktop\\TestCase.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(file); 
		XSSFSheet sh = wb.getSheet("Sheet2");
		int rc=sh.getLastRowNum()-sh.getFirstRowNum();
		System.out.println(rc);
		
  for(int i=0;i<=rc;i++)
    {
		XSSFRow rw=sh.getRow(i); 
	
		XSSFCell cel=rw.getCell(6);
		
		
	   System.out.println(cel);
  }
	}

}
