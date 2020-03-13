package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

FileInputStream file= new FileInputStream ("C:\\Users\\qaplanet\\Desktop\\ss.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(file); 
XSSFSheet sh = wb.getSheet("Sheet1");
XSSFRow rw=sh.getRow(5);

XSSFCell cel =rw.getCell(3);
cel.setCellType(CellType.STRING);
cel.setCellValue("qaplanet inst sadar sihhhhhh**ng writes nothing  ");
System.out.print("it is k");
FileOutputStream fos = new FileOutputStream("C:\\Users\\qaplanet\\Desktop\\kk\\xyz.xlsx");
wb.write(fos);
fos.close();
System.out.println("Plz check ur excelsheetL");



	}

}
