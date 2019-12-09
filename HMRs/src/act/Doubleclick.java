package act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("https://www.hdfcbank.com/");
		Actions acr=new Actions(bo);
		//double click on login button
       acr.doubleClick(bo.findElement(By.xpath("//a[@id='loginsubmit']"))).perform();
		
		//acr.doubleClick(bo.findElement(By.xpath("//li[@class='productWrap']//div[@class='menutext']"))).perform();
	}

}
