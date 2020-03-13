package findelemnets;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findelmnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		bo.get("https://www.instagram.com/");
		//bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		List<WebElement> nl=bo.findElements(By.tagName("a"));

		System.out.println(nl.size());
         bo.close();
		
	}

}
