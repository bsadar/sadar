package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BuildTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	//Reading property file
        FileInputStream propertyfile = new FileInputStream("C:\\Users\\lenovo\\git\\rrr\\sadarclass\\src\\propertyfile\\locatorvalues.properties");
          //Or
        //FileInputStream propertyfile = new FileInputStream(System.getProperty("user.dir")+"/src/propertyfile/locatorvalues.properties");

	//creating property object  for property class & loading property file
         Properties propertyobject = new Properties(); 
         propertyobject.load(propertyfile);

      //opening Chrome browser
       System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chorme107\\chromedriver.exe"); 
        WebDriver bo=new ChromeDriver();

     //calling variables from property (locatorvalues.properties) file 
       String burl=propertyobject.getProperty("bpath");
       String udlocator=propertyobject.getProperty("uidl");
       String udvalue=propertyobject.getProperty("uidv");
 
    //scripting to enter URL
       bo.get(burl);
    //scripting for user id text field 
       bo.findElement(By.xpath(udlocator)).sendKeys(udvalue);
		
	}

}
