package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("http://apps.qaplanet.in/qahrm/login.php");
		dd.findElement(By.xpath("//td[2]/input")).sendKeys("qap");
        dd.findElement(By.name("txtPassword")).sendKeys("lab1");
        dd.findElement(By.name("Submit")).click();
   if (dd.findElement(By.xpath("//font[@color='Red']")).getText().equals("Invalid Login"))
	System.out.println("pass_tc_2_4");
      else
    	  System.out.println("fail_tc_2_4");
      dd.close();
    	  
	}

}
