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
	    
	    WebElement ud=   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
	    if(ud.isDisplayed()) {
	    	System.out.println("ud displayed :pass");
	    }
	    else {
	    	System.out.println("ud not displayed :fail");
	    }
           //2. after verify ,enter userid value
	    ud.sendKeys("sadar");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    if(wait.until(ExpectedConditions.titleIs("HMR"))) {
	    	System.out.println("page is displayed:pass");
	    	
	    }
	    else {
	    	System.out.println("page is not displayed:fail");
	    }
		//fields
	    
	    WebElement uid=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]")));
	    WebElement pd=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[3]/td[2]/input[1]")));
	    WebElement lgb=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[4]/td[1]/center[1]/input[1]")));
	    WebElement reb=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[4]/td[2]/center[1]/input[1]")));
	    
	    if(uid.isDisplayed()) {
	    	System.out.println("uid is displayed:pass");
	    }
	    else {
	    	System.out.println("uid is not displayed:fail");
	    }
	    //enter uid 
	    uid.sendKeys("sadar");
}
}
