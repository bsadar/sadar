package cross;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cr {
	
	WebDriver dd;
  @Test
  @Parameters("browser")
  public void CrB(String ibr) {
	if (ibr.equalsIgnoreCase("ff")){
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
        dd=new FirefoxDriver();
        System.out.println("running with FF");
	}
	else if(ibr.equalsIgnoreCase("gg"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SelWD\\Drvers\\chromedriver.exe");
		dd=new ChromeDriver();
		System.out.println("running with chrome");
	}
	
	dd.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	dd.get("http://apps.qaplanet.in/qahrm/login.php");
	dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
    dd.findElement(By.name("txtPassword")).sendKeys("lab1");
    dd.findElement(By.name("Submit")).click();
    
 
    
    Assert.assertEquals(dd.getTitle(), "OrangeHRM");
    
    
  
	dd.close();
  }
}
