import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream ("C:\\Users\\admin\\Desktop\\DML\\HMR_TC.xls");

		@SuppressWarnings("resource") 
		HSSFWorkbook wb=new HSSFWorkbook(file); 
		HSSFSheet sh = wb.getSheetAt(0);

		HSSFRow rw=sh.getRow(3); 
		HSSFCell cel=rw.getCell(6); 
		System.out.print(cel);


	}

}
