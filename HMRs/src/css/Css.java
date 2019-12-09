package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
	//	bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
		bo.findElement(By.cssSelector("input[type=text]")).sendKeys("sadarsadar");
	//	bo.findElement(By.cssSelector("input[name=txtUserName]")).sendKeys("sADAR");
	//	bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	}

}
