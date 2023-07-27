package testnagframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testngvalidtestcase {
  @Test
  public void validtestcase() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chorme107\\chromedriver.exe");
		//Open chrome browser 
		WebDriver br=new ChromeDriver();
		//Enter URL in browser address
		 br.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		 //maximize browser
		 br.manage().window().maximize();
		//Enter valid value in 'UserID' text field 
		br.findElement(By.xpath("//input[contains(@name,'id')]")).sendKeys("sadar");
		Thread.sleep(3000);
		//Enter valid value in 'Password' text field 
		br.findElement(By.xpath("//input[@name='pass']")).sendKeys("sadar");
		Thread.sleep(3000);
		//Click on 'Login' button
		br.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		Thread.sleep(3000);
		//pick the title of the page as actual result
		String actualResult=br.getTitle();
		//giving expected result
		String expectedResult="MainHMRr";
		//matching expected result and actual result
		Assert.assertEquals(actualResult,expectedResult);
		//closing browser
		br.quit();
  }
}
