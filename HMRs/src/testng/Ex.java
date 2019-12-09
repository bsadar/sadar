package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex {
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("http://apps.qaplanet.in/qahrm/login.php");
		dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
        dd.findElement(By.name("txtPassword")).sendKeys("lab1");
       dd.findElement(By.name("Submit")).click();
    try{
       Thread.sleep(5000);
        }
  catch(Exception e){
  	System.out.print("time is not enoguh");
  }
Assert.assertEquals(dd.getTitle(), "OrangeHRM");

dd.close();
  }
}
