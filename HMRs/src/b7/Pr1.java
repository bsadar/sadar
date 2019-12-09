package b7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


;

public class Pr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.manage().window().maximize();
		dd.manage().window().maximize();
		dd.get("http://qaplanet.in/");
		System.out.print(dd.getTitle());
		   System.out.print(dd.getTitle());

	}

}
