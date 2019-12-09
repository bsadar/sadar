package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties obj = new Properties(); 
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/src/propertyfile/tt.properties");
		obj.load(objfile);
		 String bpaths=   obj.getProperty("bpath");
		String uids= obj.getProperty("uid");
       
		
		       
		        
		
		           
	      System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
			WebDriver bo=new FirefoxDriver();
			bo.get(bpaths);
			bo.findElement(By.xpath(uids)).sendKeys("sadar");
			bo.navigate().refresh();
			
	}

}
