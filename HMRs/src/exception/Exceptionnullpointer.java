package exception;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exceptionnullpointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String bpath;
		System.setProperty("webdriver.gecko.driver","D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver Driver=new FirefoxDriver();
		
		//login page
		Driver.get(bpath);
	}

}
