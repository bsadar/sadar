package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class CrossbrowserTestt {
	WebDriver bo;
  @Test
  public void TC1() {
  }
  
  @BeforeMethod

  @Parameters("browser")
  public void CrB(String ibr) {
	if (ibr.equalsIgnoreCase("ff")){
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
        bo=new FirefoxDriver();
        System.out.println("running with FF");
	}
	else if(ibr.equalsIgnoreCase("gg"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SelWD\\Drvers\\chromedriver.exe");
		bo=new ChromeDriver();
		System.out.println("running with chrome");
	}
	
	bo.get("http://apps.qaplanet.in/qahrm/login.php");
	
	

  }

  @AfterMethod
  public void afterMethod() {
	  bo.close();
  }

}
