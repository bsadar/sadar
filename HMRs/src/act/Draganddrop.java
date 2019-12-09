package act;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		
		WebDriver bo= new FirefoxDriver();
		//bo.get("https://www.facebook.com/");
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site");
		WebElement element = bo.findElement(By.id("click"));
		Actions act = new Actions(bo);
		 act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		 act.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(6000);
		act.dragAndDropBy(element, 50, 100);
		Thread.sleep(6000);
		act.perform();
		Thread.sleep(6000);
		act.release();
		
		
		
	}

}
