package loginTest;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Script {
	WebDriver bo;

@Given("^Enter build path$")
public void enter_build_path() {
	System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe"); 
	bo=new FirefoxDriver();
	 
	 bo.get("http://apps.qaplanet.in/qahrm/login.php");
  
}

@When("^valid userid and passwrd$")
public void valid_userid_and_passwrd()  {
	
	bo.get("http://apps.qaplanet.in/qahrm/login.php");
	bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
   bo.findElement(By.name("Submit")).click();

}

@Then("^home page disapleyd$")
public void home_page_disapleyd() {
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	bo.close();
}
}
