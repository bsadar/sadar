package act;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrolldownbyAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("https://www.hdfcbank.com/");
		Actions acr=new Actions(bo);
		Thread.sleep(6000);
		acr.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(3000);
		 acr.sendKeys(Keys.PAGE_UP).build().perform();
	}

}
