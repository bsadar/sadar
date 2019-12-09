package testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
			WebDriver dd=new FirefoxDriver();
			dd.get("http://apps.qaplanet.in/qahrm/login.php");
			dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	    dd.findElement(By.name("txtPassword")).sendKeys("lab1");
	    dd.findElement(By.name("Submit")).click();
	  
	

	dd.close();
	}
	}


