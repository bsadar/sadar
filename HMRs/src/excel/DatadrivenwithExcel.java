package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatadrivenwithExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	       //get excel file from folder
			//	FileInputStream file= new FileInputStream ("D:\\datadriventestingData.xlsx");
		FileInputStream file= new FileInputStream (System.getProperty("user.dir")+"/src/excel/datadriventestingData.xlsx");
		      
		       //create work book
				XSSFWorkbook wb=new XSSFWorkbook(file); 
				//get sheet from workbook
				XSSFSheet sh = wb.getSheet("inputdata");
				//count number of active rows in sheet
				int rc=sh.getLastRowNum()-sh.getFirstRowNum();
				//print no of rows
				System.out.println(rc);
			// loop for getting rows	
		  for(int i=1;i<=rc;i++)
		    {
			        // get row in sheet
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
			
			  //test case scripting for datadriven testing 
			  
			 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chorme107\\chromedriver.exe");
			 //creating browser object
			 WebDriver bo=new ChromeDriver();
			  //Enter URL in browser address
				bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
			  //Enter user id in userid text field
				bo.findElement(By.xpath("//input[@name='id']")).sendKeys(uds);
			  //Enter password in password text field
		      bo.findElement(By.xpath("//input[@name='pass']")).sendKeys(pds);
		      //click on login button
		      bo.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
			  
			//compare expected and actual result  
		     if(bo.getTitle().equals("MainHMR")){
		  	   System.out.println("passs");
		     }
		     else{
		  	   System.out.println("fail");
		     }
		     bo.close();
		
		    } 	
	  
	  
	  
	  
	  
	  
    
  }
	}


