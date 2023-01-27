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
				FileInputStream propertyfile = new FileInputStream(System.getProperty("user.dir")+"/src/propertyfile/locatorvalues.properties");
				
				//creating propertyoject  for property class & loading prperty file
				Properties propertyoject = new Properties(); 
				propertyoject.load(propertyfile);
				
				//scripting with property file variable
				System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chorme107\\chromedriver.exe");
				WebDriver bo=new ChromeDriver();
				bo.get(propertyoject.getProperty("bpath"));
				bo.findElement(By.xpath(propertyoject.getProperty("uidl"))).sendKeys(propertyoject.getProperty("uidv"));
	}

}
