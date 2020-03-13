package act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActOrange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		 Actions acr=new Actions(bo);
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
        bo.findElement(By.name("txtPassword")).sendKeys("lab1");
        bo.findElement(By.name("Submit")).click();
       acr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
      Thread.sleep(3000);
       acr.moveToElement(bo.findElement(By.xpath("/html[1]/body[1]/div[4]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]"))).perform();
	}

}
