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
		FileInputStream propertyfile = new FileInputStream(System.getProperty("user.dir")+"/src/property/locatorvalues.properties");
		
		//oject  for property class and loading prperty file
		Properties obj = new Properties(); 
		obj.load(propertyfile);
		
		//scripting
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chorme107\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get(obj.getProperty("bpath"));
		bo.findElement(By.xpath(obj.getProperty("uidl"))).sendKeys("sadar");
	}

}
