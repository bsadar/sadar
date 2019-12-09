package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodExampleofWD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("http://apps.qaplanet.in/qahrm/login.php");
		
		
		WebElement el=dd.findElement(By.xpath("//input[@name='txtUserName']"));
		 el.clear();
		 el.sendKeys("sasdar");
		
		
		dd.findElement(By.xpath("//input[@name='txtUserName']")).clear();
		dd.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");

		
		
		
	}

}
