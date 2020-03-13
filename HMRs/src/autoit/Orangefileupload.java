package autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Orangefileupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		 WebDriver bo=new FirefoxDriver(); 
		 bo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     bo.manage().window().maximize();
	     Actions acr=new Actions(bo);
	     
		bo.get( "http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	   bo.findElement(By.name("Submit")).click();
	  
	 Thread.sleep(2000);
	   acr.moveToElement(bo.findElement(By.xpath("//li[@id='pim']//a[@class='l1_link']"))).perform();
	   Thread.sleep(2000);
	   acr.moveToElement(bo.findElement(By.xpath("/html[1]/body[1]/div[4]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"))).perform();
	   Thread.sleep(3000);
	   bo.findElement(By.xpath("/html[1]/body[1]/div[4]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]")).click();
	   //Switching to save button
	       bo.switchTo().frame("rightMenu");

	        bo.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("sadar");
	        bo.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("singh");
	        bo.findElement(By.xpath("//input[@id='txtEmpMiddleName']")).sendKeys("bhukya");
	        bo.findElement(By.xpath("//input[@id='txtEmpNickName']")).sendKeys("sadi");
	        //browsing the photo
	        
	   acr.moveToElement(bo.findElement(By.xpath("//input[@id='photofile']"))).click().perform();
     
	   Runtime.getRuntime().exec("D:\\Dust\\AutoIT\\photouploadOrange.exe");
	   Thread.sleep(2000);
	}

}
