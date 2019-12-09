package excelReaderWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile 
{
	public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException
	{	
		//Create a object of File class to open the file (xlsx or xls)
		File file =	new File(filePath+"\\"+fileName);
		
		//Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wb = null;

		//Find the file extension by splitting file name in substring and getting only extension name
		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		//Check condition if the file is xlsx file or xls file
		if(fileExtensionName.equals(".xlsx"))
		{
			wb = new XSSFWorkbook(inputStream);
		
		}
		else if(fileExtensionName.equals(".xls"))
		{
			wb = new HSSFWorkbook(inputStream);
		}
		
		//Read sheet inside the workbook by its name
		Sheet  sh = wb.getSheet(sheetName);
		return sh;	
	}
}
