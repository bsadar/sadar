package whandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertmsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		 
			
		WebDriver bo=new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("");
	    bo.findElement(By.name("txtPassword")).sendKeys("");
	    bo.findElement(By.name("Submit")).click();
	    if(bo.switchTo().alert().getText().equals("User Name not given!"))
	    	System.out.println("pass");
	    else 
	    	System.out.println("fail");
	    bo.switchTo().alert().accept();
	    bo.close();
	    
	}

}
