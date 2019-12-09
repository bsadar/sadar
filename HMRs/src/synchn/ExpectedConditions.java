package synchn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		FirefoxDriver Driver=new FirefoxDriver();
		//TO maximize browser
		Driver.manage().window().maximize();
		//Explicit wait object
		WebDriverWait wait=new WebDriverWait(Driver, 60);
		//Action class
		Actions Act=new Actions(Driver);
		//--------------------------------------------
		//Open application
		Driver.get("http://apps.qaplanet.in/qahrm/login.php");
		//Verify home page
		if(wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management")))
		{
			System.out.println("Home Page displayed");
		}
		else
		{
			System.out.println("Failed to opne home page");
			
		}
	}

}
