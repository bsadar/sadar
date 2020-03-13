package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc1New {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties obj = new Properties(); 
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/src/propertyfile/hmr.properties");
		obj.load(objfile);
		// String bp = obj.getProperty("bpath");
		        
	      System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
			WebDriver bo=new FirefoxDriver();
			bo.get(obj.getProperty("bpath"));
			bo.findElement(By.xpath(obj.getProperty("uidl"))).sendKeys("qaplanet1");
	}

}
