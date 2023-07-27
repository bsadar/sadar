package testnagframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestngRegressionSuite {
	//variable declaration
	WebDriver br;
	String url="https://bsadar.github.io/hmrbuild1/Loging.html";
 
	//opening browser and enter url
  @BeforeMethod
  public void buildOpen() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chorme107\\chromedriver.exe");
	  //Open chrome browser 
	  br=new ChromeDriver();
	  //Enter URL in browser address
	  br.get(url);
	  //maximize browser
	  br.manage().window().maximize();
  }
 
  //closing browser
  @AfterMethod
  public void buildClose() {
	  br.quit();
  }
  
  //test cases scripts
  @Test(enabled=true,priority=1,groups="login")
  public void Testcase1() {
	  
  }

}
