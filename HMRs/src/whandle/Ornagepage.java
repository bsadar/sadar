package whandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ornagepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver  bo= new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
		bo.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		//String parentWinHandle = bo.getWindowHandle();
	}

}
