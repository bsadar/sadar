package cross;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SelWD\\Drvers\\chromedriver.exe");
		
		WebDriver dd=new ChromeDriver();
		System.out.println("running with chrome");
	}

}
