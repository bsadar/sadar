package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidTestcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		//actualResult by getting page title
		String actualResult=br.getTitle();
		//Expected result giving as of requirement
		String expectedResult="MainHMR";
		//Matching expectedResult and actualResult by using if statement
		if(actualResult.equals(expectedResult)) {
			System.out.println("testcase pass");
			
		}
		else{
			System.out.println("testcase fail");
		}
		Thread.sleep(3000);
		//browser quit
		br.quit();
	}

}
