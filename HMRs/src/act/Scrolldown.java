package act;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site");
		//java
	     JavascriptExecutor js = (JavascriptExecutor) bo;
		 js.executeScript("window.scrollBy(0,500)");
		 
		/* //action
         Actions acr=new Actions(bo);
			Thread.sleep(6000);
			acr.sendKeys(Keys.PAGE_DOWN).build().perform();
			 Thread.sleep(3000);
			 acr.sendKeys(Keys.PAGE_UP).build().perform();
	
			
			 acr.sendKeys(Keys.PAGE_UP).build().perform(); */
		 
	}

}
