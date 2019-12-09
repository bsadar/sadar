package b7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
        dd.get("http://apps.qaplanet.in/qahrm/login.php");
        dd.findElement(By.xpath("//tr[2]/td[2]/input")).sendKeys("qaplanet1");
	     dd.findElement(By.xpath("//tr[3]/td[2]/input")).sendKeys("lab1");
	     dd.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input")).click();
	
	
	}

}
