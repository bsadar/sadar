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
		FileInputStream file= new FileInputStream ("D:\\datadriventesting data.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(file); 
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rc=sh.getLastRowNum()-sh.getFirstRowNum();
		System.out.println(rc);
		
  for(int i=0;i<=rc;i++)
    {
		XSSFRow rw=sh.getRow(2); 
		String uid=rw.getCell(0).toString(); 
		String pd=rw.getCell(1).toString();
		             
		       
		 System.out.println(i);
	   System.out.println(uid);
	  System.out.print(pd);
	
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("http://dmlogics.in/build1/Loging.html");
		dd.findElement(By.xpath("//input[@name='id']")).sendKeys(uid);
      dd.findElement(By.xpath("//input[@name='pass']")).sendKeys(pd);
      
      dd.findElement(By.xpath("//td[1]//center[1]//input[1]")).click();
     if(dd.getTitle().equals(dd.getTitle()))
  	   System.out.print("p");
     else
  	   System.out.print("f");
     dd.close();
		
        
	  
	  
	  
	  
	  
	  
    }
  }
	}


