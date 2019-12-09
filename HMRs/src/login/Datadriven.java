package login;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

 class Datadriven {
	
  @Test(dataProvider = "input")
  public void TC2_1(String ud, String pd) {
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("http://apps.qaplanet.in/qahrm/login.php");
		dd.findElement(By.xpath("//td[2]/input")).sendKeys(ud);
      dd.findElement(By.name("txtPassword")).sendKeys(pd);
      dd.findElement(By.name("Submit")).click();
      
      Assert.assertEquals(dd.getTitle(),"OrangeHRM");
      dd.close();
   }

  @DataProvider
  public Object[][] input() {
    
	  Object[][] cr=new  Object[2][2];
	 cr[0][0] ="qaplanet1";
	  cr[0][1]="lab2";
		cr[1][0] ="qaplanet1";
		  cr[1][1]="lab1";
		return cr;
					  
  }
}
