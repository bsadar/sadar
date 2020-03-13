package whandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleWin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo= new FirefoxDriver();
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site");
        // Get current window handle
		bo.findElement(By.id("win1")).click();
		Thread.sleep(3000);
		///html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]
		String wn=bo.getWindowHandle();
		System.out.println(wn);
		
		bo.switchTo().window(wn);
		//bo.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();	
      Thread.sleep(4000);
		bo.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
	}
	}


