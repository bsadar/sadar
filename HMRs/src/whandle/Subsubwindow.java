package whandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Subsubwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver  bo= new FirefoxDriver();
		bo.get("https://www.hdfcbank.com/");
		String parentWinHandle = bo.getWindowHandle();
		bo.findElement(By.xpath("//a[@id='loginsubmit']")).click();
	
		//System.out.print(wn.size());
		//bo.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/a[1]")).click();
		
        // Get current windows handle
		 Set<String> winHandles = bo.getWindowHandles();
	        System.out.println(winHandles.size());
	        // Loop through all handles
	        for(String handle: winHandles){
	        	if(!handle.equals(parentWinHandle)){
	           bo.switchTo().window(handle);
	           String subname=bo.getWindowHandle();
	            System.out.println("window:name " +handle);
	            Thread.sleep(4000);
	            bo.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/a[1]")).click();
	            Thread.sleep(4000);
	            Set<String> winHandless = bo.getWindowHandles();
	            for(String handlesub: winHandless){
	          if(!handlesub.equals(subname)){
	          	  Thread.sleep(6000);
	        	  bo.switchTo().window(handlesub);
	        	  Thread.sleep(6000);
	           bo.findElement(By.xpath("/html[1]/body[1]/form[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[2]/table[1]/tbody[1]/tr[2]/td[2]/span[1]/input[1]")).sendKeys("sdfdsf");
	            }
	            }
	            }
	        }
	}
}
