package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BuildExecution {
	public  WebDriver bo;
	public   String   bpath ="http://apps.qaplanet.in/qahrm/login.php";
	  
	public WebDriver  buildexecution(){
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	     bo=new FirefoxDriver();
	     
		return bo;
	  }
}
