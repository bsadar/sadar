package frameworkSequnetial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	WebDriver 	bo=new FirefoxDriver();
	bo.get("http://apps.qaplanet.in/qahrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.name("txtPassword")).sendKeys("lab1");
		bo.findElement(By.name("Submit")).click();
        
       if(bo.getTitle().equals("OrangeHRM"))
    	   System.out.println("pass_tc_2_1");
       else
    	   
    	   System.out.println("fail_tc_2_1");
           	bo.close(); 
	}

}
