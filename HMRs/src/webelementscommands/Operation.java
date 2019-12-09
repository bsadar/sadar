package webelementscommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		System.out.print(bo.findElement(By.xpath("//div[@id='dropdowns']")).getTagName());
		
		System.out.println(bo.findElement(By.xpath("//strong[contains(text(),'I have:')]")).getText());
	}

}
