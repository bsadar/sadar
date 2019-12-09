package whandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HDFC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver  bo= new FirefoxDriver();
		bo.get("https://www.hdfcbank.com/");
		String parentWinHandle = bo.getWindowHandle();
		bo.findElement(By.xpath("//a[@id='loginsubmit']")).click();
	
		//System.out.print(wn.size());
		//bo.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/a[1]")).click();
		
        // Get current window handle
		 Set<String> winHandles = bo.getWindowHandles();
	        System.out.println(winHandles.size());
	        // Loop through all handles
	        for(String handle: winHandles){
	        	if(!handle.equals(parentWinHandle)){
	        		Thread.sleep(4000);
	            bo.switchTo().window(handle);
	            System.out.println("window:name " +handle);
	            Thread.sleep(4000);
	            bo.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/a[1]")).click();
	            Thread.sleep(4000);
		        }
	        }
	}

}
