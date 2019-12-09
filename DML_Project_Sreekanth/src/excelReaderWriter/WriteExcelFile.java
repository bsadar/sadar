package excelReaderWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile 
{
	public void writeExel(String filePath,String fileName,String sheetName,int rowNum,String message) throws IOException
	{
		File file =	new File(filePath+"\\"+fileName);
		//Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wb = null;
		//Find the file extension by splitting file name in substring and getting only extension name
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		//Check condition if the file is xlsx file
		if(fileExtensionName.equals(".xlsx"))
		{
			//If it is xlsx file then create object of XSSFWorkbook class
			wb = new XSSFWorkbook(inputStream);
		}
		//Check condition if the file is xls file
		else if(fileExtensionName.equals(".xls"))
		{
			//If it is xls file then create object of XSSFWorkbook class
			wb = new HSSFWorkbook(inputStream);
		}
		Sheet sh=wb.getSheet(sheetName);
		sh.getRow(rowNum).getCell(6).setCellValue(message);
		wb.write(new FileOutputStream(file));
		wb.close();
	}
}
