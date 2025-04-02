package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chorme107\\chromedriver.exe");
		//open chrome browser
		ChromeDriver  bo=new ChromeDriver();	
	    bo.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	   // enter url
	    bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
	     // wait object
	    WebDriverWait wait=new WebDriverWait(bo,Duration.ofMillis(3000));
	    
	    // verify title of page
	    if(wait.until(ExpectedConditions.titleIs("HMR"))) {
	    	System.out.println("page is displayed:pass");
	    	
	    }
	    else {
	    	System.out.println("page is not displayed:fail");
	    }
	    
	    // 1.verify user id text field
	    
	    WebElement ud=   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='id']")));
	    if(ud.isDisplayed()) {
	    	System.out.println("ud displayed :pass");
	    }
	    else {
	    	System.out.println("ud not displayed :fail");
	    }
           //2. after verify ,enter userid value
	    ud.sendKeys("sadar");
	    
	    
	    
}
}
