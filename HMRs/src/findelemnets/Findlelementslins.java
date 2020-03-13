package findelemnets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findlelementslins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("https://www.redbus.in/");
		//dd.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		List<WebElement> nl=dd.findElements(By.tagName("a"));
		System.out.print(nl.size());
		for(int i=0; i<=nl.size();i++ ) 
				{
			
			System.out.println(nl.get(i).getText());
			}
	}

}
