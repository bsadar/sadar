package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("https://www.redbus.in");
	      System.out.println(dd.getTitle());
	      //dd.getCurrentUrl()
	      System.out.println(dd.getCurrentUrl());
	      System.out.println(dd.getPageSource());
	 System.out.println(dd.getTitle()); 
	}

}
