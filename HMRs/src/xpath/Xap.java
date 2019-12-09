package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		//dd.manage().window().wait();
		dd.get("http://apps.qaplanet.in/qahrm/login.php");
		 dd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//dd.findElement(By.name("txtUserName")).sendKeys("sasdar");
		 // Thread.sleep(3000);
		 
		 
		dd.findElement(By.xpath("//input[text()='txtUserName']")).sendKeys("sadardfdfdf");
		Thread.sleep(3000);
		//dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
       // dd.findElement(By.name("txtPassword")).sendKeys("lab1");
       // dd.findElement(By.name("Submit")).click();
		dd.close();
	}

}
