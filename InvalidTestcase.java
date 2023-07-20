package login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidTestcase {

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
		//Enter in-valid value in 'Password' text field 
		br.findElement(By.xpath("//input[@name='pass']")).sendKeys("sada");
		Thread.sleep(3000);
		//Click on 'Login' button
		br.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		Thread.sleep(3000);
		//switching to popup window 
		Alert popupwindow= br.switchTo().alert();
		//Get message from popup window  as ctualResult
		String actualResult=popupwindow.getText();
		//Expected result giving as of requirement
		String expectedResult="Invalid Password";
		//Matching expectedResult and actualResult by using if statement
		if(actualResult.equals(expectedResult)) {
			System.out.println("testcase pass");
			
		}
		else{
			System.out.println("testcase fail");
		}
		//popupwindow close
		popupwindow.accept();
		Thread.sleep(3000);
		//browser quit
		br.quit();
	}

}
