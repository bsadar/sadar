package whandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ornagepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver  bo= new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		String parentWinHandle = bo.getWindowHandle();
        System.out.println("Parent window handle: " + parentWinHandle);
        //click on orangehrmlink
		bo.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		
       Thread.sleep(3000);
       Set<String> winHandles = bo.getWindowHandles();
       System.out.println(winHandles.size());
       // Loop through all handles
       for(String handle: winHandles){
           if(!handle.equals(parentWinHandle)){
           bo.switchTo().window(handle);
           Thread.sleep(3000);
           bo.findElement(By.xpath("//a[contains(@class,'btn-orange contact-ohrm')]")).click();
          
           System.out.println(handle);
           Thread.sleep(1000);
           System.out.println("Title of the new window: " + bo.getTitle());
          
           System.out.println("Closing the new window...");
           bo.close();
	}

}
	}
}
