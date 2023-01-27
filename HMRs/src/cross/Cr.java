package cross;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Cr {

		WebDriver bo;
  
	
 // getting vraible values from xml file	
  @Parameters({"boowser","url"})	
  @BeforeMethod
  public void be(String ibo,String bp) {
	  
	  if (ibo.equalsIgnoreCase("firefox")){
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\git\\rrr\\sadarclass\\src\\boosers\\geckodriver.exe");
	        bo=new FirefoxDriver();
	        
	        System.out.println("running with firfox");
	        bo.get(bp);
	      
		}
		else if(ibo.equalsIgnoreCase("googlechrome"))
		{
			 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\boowserexe\\chorme107\\chromedriver.exe");
			bo=new ChromeDriver();
			System.out.println("running with chrome");
			bo.get(bp);
			
		}
	  
	  
  }
//browser close
  @AfterMethod
  public void bc() {
	  bo.quit();
  }
	
  //testcase scripts
  @Test(enabled=true,priority=1,groups="login")
  public void testcase1() throws InterruptedException {
	    bo.findElement(By.xpath("//input[contains(@name,'id')]")).sendKeys("sadar");
		bo.findElement(By.xpath("//input[@name='pass']")).sendKeys("sadar");
		   Thread.sleep(3000);
		bo.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		String ar=bo.getTitle();
		String er="MainHMR";
		Assert.assertEquals(er,ar);
	  
  }
  
}
