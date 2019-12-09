package operations;

import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import excelReaderWriter.ReadExcelFile;

public class ReadObjectRepository 
{
	public String getObjectRepository_Excel(String name) throws IOException
	{
		String objectName,objectValue="";
		ReadExcelFile ref=new ReadExcelFile();
		// Read Object Repository Sheet from Excel File 
		Sheet sh=ref.readExcel(System.getProperty("user.dir")+"\\src\\objects\\","Repository.xlsx" , "Sheet1");
		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
		for (int i = 1; i < rowCount+1; i++) 
		{
			Row row = sh.getRow(i);	
			objectName=row.getCell(0).toString();
			//Select the Object Value from the appropriate Object Name in the Repository
			if(objectName.equalsIgnoreCase(name))
			{ 
				objectValue=row.getCell(1).toString();
			}
		}
		return objectValue;
	}
}
