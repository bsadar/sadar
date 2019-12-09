package whandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Printwindownames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site");
        // Get current window handle
		driver.findElement(By.id("win1")).click();
        Set<String> winHandles = driver.getWindowHandles();
        System.out.println(winHandles.size());
        // Loop through all handles
        for(String handle: winHandles){
            {
            driver.switchTo().window(handle);
            System.out.println("window:name " +handle);
            //Thread.sleep(1000);
            //System.out.println("Title of the new window: " + driver.getTitle());
            //System.out.println("Closing the new window...");
          //  driver.close();
	        }

        }
	}
}
