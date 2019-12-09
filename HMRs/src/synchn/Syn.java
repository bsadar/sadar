package synchn;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Syn {

	private static TimeUnit SECONDS;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		bo.get("http://apps.qaplanet.in/qahrm/login.php");
		
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
		Thread.sleep(6000);
		
		 bo.findElement(By.name("txtPassword")).sendKeys("lab1");
		  Thread.sleep(6000);
	      bo.findElement(By.name("Submit")).click();
	         @SuppressWarnings({ "deprecation", "unchecked" })
		 	Wait wait = new FluentWait(bo)    
	                 .withTimeout(30, SECONDS)    
	                 .pollingEvery(5, SECONDS)   
	                 .ignoring(NoSuchElementException.class);

	        
	 


	              
	         
	         
	             

	}

}
