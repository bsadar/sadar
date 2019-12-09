package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class List {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("http://apps.qaplanet.in/qahrm/login.php");
		dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
        dd.findElement(By.name("txtPassword")).sendKeys("lab1");
        dd.findElement(By.name("Submit")).click();
        Thread.sleep(6000);
		
		
		Select obj=new Select(dd.findElement(By.id("loc_code")));
	   
		obj.selectByIndex(3);
		 Thread.sleep(6000);
	}

}
