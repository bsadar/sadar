package sadarpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Pomrun {
	
	@Test
	void tc222(){
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bro=new FirefoxDriver();
		bro.get("http://apps.qaplanet.in/qahrm/login.php");
		
		
		Loginpm log=new Loginpm(bro);
	
	    log.ue_txt("qaplanet1");
	
		
	
	}
}
