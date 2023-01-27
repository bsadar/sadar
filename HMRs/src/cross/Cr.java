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

	WebDriver br;
  
	
   //open browser firefox and Chrome as of xml vraible values	
   @Parameters({"browser","url"})
   @BeforeMethod
  public void be(String ibr,String bp) {
	  
	  if (ibr.equalsIgnoreCase("firfox")){
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\git\\rrr\\sadarclass\\src\\brosers\\geckodriver.exe");
	        br=new FirefoxDriver();
	        
	        System.out.println("running with firfox");
	        br.get(bp);
	      
		}
		else if(ibr.equalsIgnoreCase("googlechrome"))
		{
			 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chorme107\\chromedriver.exe");
			br=new ChromeDriver();
			System.out.println("running with chrome");
			br.get(bp);
			
		}
	  
	  
  }
//browser close
  @AfterMethod
  public void bc() {
	  br.quit();
  }
  
  //testcases scripts
  @Test(enabled=true,priority=1,groups="login")
  public void testcase1() throws InterruptedException {
	    br.findElement(By.xpath("//input[contains(@name,'id')]")).sendKeys("sadar");
		br.findElement(By.xpath("//input[@name='pass']")).sendKeys("sadar");
		   Thread.sleep(3000);
		br.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		String ar=br.getTitle();
		String er="MainHMR";
		Assert.assertEquals(er,ar);
	  
  }
  
}
