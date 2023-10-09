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
		FileInputStream file= new FileInputStream ("C:\\Users\\qaplanet\\Desktop\\datadriventestingData.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(file); 
		XSSFSheet sh = wb.getSheet("inputdata");
		int rc=sh.getLastRowNum()-sh.getFirstRowNum();
		System.out.println(rc);
		
  for(int i=1;i<=rc;i++)
    {
	        //accessing row
		XSSFRow rw=sh.getRow(i); 

	    //getting 2and column value
		XSSFCell ud=rw.getCell(1);
	        System.out.println(ud);
	   
	    //getting 3rd column value
	       XSSFCell pd=rw.getCell(2);
	       System.out.println(pd);
	   
	    //converting into string format to use in test case
	    String uds=ud.toString();
	    String pds=pd.toString();
		
	 
  }
	}

}
