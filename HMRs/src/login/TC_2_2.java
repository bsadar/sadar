package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("");
		Thread.sleep(6000);
        bo.findElement(By.name("txtPassword")).sendKeys("");
        Thread.sleep(6000);
        bo.findElement(By.name("Submit")).click();
        if(bo.switchTo().alert().getText().equals("User Name not given!"))
        	 System.out.println("pass_tc_2_2");
        else
     	   
     	   System.out.println("fail_tc_2_2");
        bo.switchTo().alert().accept();
        bo.close();
        
	}

}
