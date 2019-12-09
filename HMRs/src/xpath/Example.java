package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		//dd.manage().window().wait();
	    bo.get("http://apps.qaplanet.in/qahrm/login.php");
		bo.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//dd.findElement(By.name("txtUserName")).sendKeys("sasdar");
		  Thread.sleep(3000);
		  
		 // bo.findElement(By.xpath("//input[starts-with(@name,'txtUser')]")).sendKeys("sadar");
		  bo.findElement(By.xpath("//input[contains(@name,'txtUserName')]")).sendKeys("sadar");
		 // bo.findElement(By.xpath("//*[text()='txtUserName']")).sendKeys("sadar");
		  Thread.sleep(6000);
		 // bo.close();
		  

	}

}
