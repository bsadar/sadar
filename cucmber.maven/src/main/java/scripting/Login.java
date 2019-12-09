package scripting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login {
	WebDriver bo;
	
	@Given("^Enter build path$")
	public void enter_build_path() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		 bo=new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
	}

	
	@When("^valid userid and passwrd$")
	public void valid_userid_and_passwrd() throws Throwable {
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
		Thread.sleep(6000);
        bo.findElement(By.name("txtPassword")).sendKeys("lab1");
        Thread.sleep(6000);
        bo.findElement(By.name("Submit")).click();
        Thread.sleep(6000);
	 
	}

	
	@Then("^home page disapleyd$")
	public void home_page_disapleyd() throws Throwable {
		bo.close();
	  
	}

	
}
