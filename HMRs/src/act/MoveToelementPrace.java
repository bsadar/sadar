package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToelementPrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chorme107\\chromedriver.exe");
		WebDriver br=new ChromeDriver();
		//enter url
		br.get("https://www.redbus.in/");
		//Action object to use action commands 
		Actions act=new Actions(br);
		//Webelement
		WebElement tt=br.findElement(By.xpath("//div[@class='img_new_wrap']"));
		//keep cursor on webelement 
		act.moveToElement(tt).perform();
	}

}
