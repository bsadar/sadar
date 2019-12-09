import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pack2.Pom1;

public class Mpom {
	@Test
	void tc1(){
	System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	WebDriver dr2=new FirefoxDriver();
	dr2.get("http://apps.qaplanet.in/qahrm/login.php");
	Pom1  lg=new Pom1(dr2);
	      lg.un_txt();;
	}

}
