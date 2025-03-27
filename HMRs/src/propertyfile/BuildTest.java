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
		
		                //reading property file
		                FileInputStream propertyfile = new FileInputStream("C:\\Users\\lenovo\\git\\rrr\\sadarclass\\src\\propertyfile\\locatorvalues.properties");
				//Or
                                //FileInputStream propertyfile = new FileInputStream(System.getProperty("user.dir")+"/src/propertyfile/locatorvalues.properties");
				
		        	//creating propertyobject  for property class & loading prperty file
				Properties propertyobject = new Properties(); 
				propertyobject.load(propertyfile);
				
				//opening chrome browser
				System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chorme107\\chromedriver.exe"); 
				WebDriver bo=new ChromeDriver();
		
		                //scripting with property file variable reading
				bo.get(propertyobject.getProperty("bpath"));
		                //entering userid text field 
				bo.findElement(By.xpath(propertyobject.getProperty("uidl"))).sendKeys(propertyoject.getProperty("uidv"));
	}

}
