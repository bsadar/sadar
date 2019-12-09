package practNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;



public class Prgtng {
  @Test
  public void TC1() {
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("http://apps.qaplanet.in/qahrm/login.php");
		dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
      dd.findElement(By.name("txtPassword")).sendKeys("lab1");
      dd.findElement(By.name("Submit")).click();
assert.assertEquals(dd.getTitle(), ""OrangeHRM"");
dd.close();
  }


}
