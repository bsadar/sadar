package whandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HDFC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver  bo= new FirefoxDriver();
		bo.get("https://www.hdfcbank.com/");
		String parentWinHandle = bo.getWindowHandle();
		//click on login button
		bo.findElement(By.xpath("//a[@id='loginsubmit']")).click();
//finding no of windows		
Set<String>   nw=bo.getWindowHandles();
System.out.println(nw.size());
System.out.println(nw);

for(String handle:nw){
	
  System.out.print(bo.switchTo().window(handle));  
    
  
    }
				
		
	
	}

}
