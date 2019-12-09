package findelemnets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		//bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		List<WebElement> nl=bo.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.print(nl.size());

	}

}
