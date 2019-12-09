 package testBase;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import excelReaderWriter.ReadExcelFile;
import operations.ReadObjectRepository;
import operations.UIOperation;
import excelReaderWriter.WriteExcelFile;
import browserDriver.SelectBrowser;

public class ExecuteTests 
{   
  String filepath=System.getProperty("user.dir")+"\\src\\screenShots\\";	
  //String filepath1=System.getProperty("user.dir")+"\\src\\screenShots\\Fail\\";
  //String filepath2=System.getProperty("user.dir")+"\\src\\screenShots\\Pass\\";	  
  WebDriver driver;
  @Test 
  public void login() throws Exception 
  {
	  ReadExcelFile ref=new ReadExcelFile();
	  WriteExcelFile wef=new WriteExcelFile();
	  ReadObjectRepository ror=new ReadObjectRepository();
	  SelectBrowser browser=new SelectBrowser(driver);

	  // Select the browser from the set of browsers
	  driver=browser.getBrowser();
	  UIOperation ope=new UIOperation(driver);
	  Sheet sh=ref.readExcel(System.getProperty("user.dir")+"\\src\\testData\\","TestCase.xlsx" , "Sheet2");
	  int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
	  //Create a loop over all the rows of excel file to read it
  	  for (int i = 1; i < rowCount+1; i++) 
  	  {
  		//Loop over all the rows
  		Row row = sh.getRow(i);
  		//Check if the first cell contain a value, if yes, That means it is the new testcase name
  		if(row.getCell(0).toString().length()==0)
  		{	
  		 if(row.getCell(1).toString().length()==0)
  		 {
  			Thread.sleep(1000);
  			//Print testcase detail on console
  			System.out.println(row.getCell(1).toString()+"----"+ row.getCell(2).toString()+"----"+
  			row.getCell(3).toString()+"----"+ row.getCell(4).toString());
  			//Call perform function to perform operation on UI
            try 
            {
            	ope.perform(ror, row.getCell(2).toString(), row.getCell(3).toString(),row.getCell(4).toString(), row.getCell(5).toString());
                wef.writeExel(System.getProperty("user.dir")+"\\src\\testData\\","TestCase.xlsx" , "Sheet2",row.getRowNum(),"Pass");
    //            takeScreenshot("ScreenShot_"+row.getRowNum(),filepath2);
            }
            catch(Exception e)
            {
            	e.printStackTrace();
            	wef.writeExel(System.getProperty("user.dir")+"\\src\\testData\\","TestCase.xlsx" , "Sheet2",row.getRowNum(),"Fail - "+e.getMessage());
      //      	takeScreenshot("ScreenShot_"+row.getRowNum(),filepath1);
            	takeScreenshot("ScreenShot_"+row.getRowNum());	
            }
  	    }
  		else
  		{
  			//Print the new  testcase name when it started
  			System.out.println("New Testcase->"+row.getCell(0).toString() +" Started");
  			wef.writeExel(System.getProperty("user.dir")+"\\src\\testData\\","TestCase.xlsx" , "Sheet2",row.getRowNum(),"New TC Started");
  		}
  	   }
  	   else
  	   {
 			wef.writeExel(System.getProperty("user.dir")+"\\src\\testData\\","TestCase.xlsx" , "Sheet2",row.getRowNum(),"New Module Started");			  
  	   }
  	  }
   }
   public void takeScreenshot(String name)
   {
	   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //The below method will save the screen shot in d drive with test method name 
       try 
       {
    	           
				FileUtils.copyFile(scrFile, new File(filepath+name+".png"));
				System.out.println("***Placed screen shot in "+filepath+" ***");
       } 
       catch (IOException e) 
       {
				e.printStackTrace();
       }
	}
}		