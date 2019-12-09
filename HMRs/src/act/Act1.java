package act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Act1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
	    bo.get("https://www.hdfcbank.com/");
		
        Actions acr=new Actions(bo);
	
		acr.moveToElement(bo.findElement(By.xpath("/html[1]/body[1]/d1]/a[1]"))).perform();
		Thread.sleep(4000);
		acr.moveToElement(bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/dli[3]/a[1]"))).perform();
		Thread.sleep(4000);
		acr.moveToElement(bo.findElement(By.xpath("/html/ul[1][1]/li[3]/a[1]"))).perform();
		Thread.sleep(4000);
		bo.findElement(By.xpath("//a[contains(text(),'Debit Cards')]")).click();
		
		
		

		
		
		
		
		
		
		
		
		
		//Thread.sleep(6000);
		//acr.moveToElement(bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/div[2]/div[2]/div[1]/ul[1]/li[6]"))).perform();
		//Thread.sleep(6000);
		//acr.moveToElement(bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/div[2]/div[2]/div[2]/div[6]/div[1]/ul[1]/li[5]/a[1]"))).perform();
	
	//	acr.click(bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/div[2]/div[2]/div[2]/div[6]/div[1]/ul[1]/li[5]/a[1]"))).perform();;
		
		//bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/div[2]/div[2]/div[2]/div[6]/div[1]/ul[1]/li[5]/a[1]")).click();
		//acr.moveToElement(dd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]"))).perform();
		
		//dd.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[1]/a")).click();
	
	}

}
