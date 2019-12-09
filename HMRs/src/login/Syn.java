package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Syn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		
		WebDriver dd=new FirefoxDriver();
		Thread.sleep(100);
		dd.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		dd.get("http://apps.qaplanet.in/qahrm/login.php");;
		dd.findElement(By.xpath("//td[2]/input")).sendKeys("sadar");
		Thread.sleep(100000);
        dd.findElement(By.name("txtPassword")).sendKeys("sadar");
	}
	

}
