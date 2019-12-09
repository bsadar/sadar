package dependency;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {

	
	 
	 @Test(groups ={"login"})
	 public void test1(){
		 System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
			WebDriver dd=new FirefoxDriver();
			dd.get("http://apps.qaplanet.in/qahrm/login.php");
			dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	      dd.findElement(By.name("txtPassword")).sendKeys("lab1");
	      dd.findElement(By.name("Submit")).click();
	      System.out.println("1");
	    
	dd.close();
	 }
	 @Test(groups ={"admin"})
	 public void test2(){
		 System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
			WebDriver dd=new FirefoxDriver();
			dd.get("http://apps.qaplanet.in/qahrm/login.php");
			dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	      dd.findElement(By.name("txtPassword")).sendKeys("lab1");
	      dd.findElement(By.name("Submit")).click();
	      System.out.println("2");
	      dd.close();

	 }
	 @Test(groups ={"login"})
	 public void test3(){
		 System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
			WebDriver dd=new FirefoxDriver();
			dd.get("http://apps.qaplanet.in/qahrm/login.php");
			dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	      dd.findElement(By.name("txtPassword")).sendKeys("lab1");
	      dd.findElement(By.name("Submit")).click();
	      System.out.println("3");
	      dd.close();

	 }	  
	 
}
