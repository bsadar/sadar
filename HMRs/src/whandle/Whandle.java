package whandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Whandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver  bo= new FirefoxDriver();
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site");
        // Get current window handle
         String parentWinHandle = bo.getWindowHandle();
         System.out.println("Parent window handle: " + parentWinHandle);
        // Thread.sleep(6000);
        // Locate 'Click to open a new browser window!' button using id
       WebElement newWindowBtn = bo.findElement(By.id("win1"));
        // Click the button to open a new window
     Thread.sleep(6000);
        newWindowBtn.click();
        // Get the window handles of all open windows
        Set<String> winHandles = bo.getWindowHandles();
        System.out.println(winHandles.size());
        // Loop through all handles
        for(String handle: winHandles){
            if(!handle.equals(parentWinHandle)){
            bo.switchTo().window(handle);
            System.out.println(handle);
            Thread.sleep(1000);
            bo.get("https://www.redbus.in/");
         
            bo.findElement(By.xpath("//a[@id='redBus Bus Hire']")).click();
            System.out.println("Title of the new window: " + bo.getTitle());
            System.out.println("Closing the new window...");
            Thread.sleep(3000);
            bo.close();
            }
        }
	}

        }
