package autoit;

import java.io.IOException;

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
	     bo.manage().window().maximize();
	     Actions acr=new Actions(bo);
	     
		bo.get( "http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	   bo.findElement(By.name("Submit")).click();
	   acr.moveToElement(bo.findElement(By.xpath("/html[1]/body[1]/div[4]/ul[1]/li[2]/a[1]/span[1]"))).perform();
	   Thread.sleep(3000);
  acr.moveToElement(bo.findElement(By.xpath("/html[1]/body[1]/div[4]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"))).perform();
//	acr.moveToElement(bo.findElement(By.xpath("/html[1]/body[1]/div[4]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"))).perform();;

  bo.findElement(By.xpath("/html[1]/body[1]/div[4]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]")).click();
 Thread.sleep(6000);
  bo.switchTo().frame("rightMenu");
  Thread.sleep(2000);
  bo.findElement(By.xpath("//input[@id='photofile']")).click();	
		
  Runtime.getRuntime().exec("C:\\Users\\qaplanet\\Desktop\\uplfilesasdarnew.exe");
	}

}
