package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("http://apps.qaplanet.in/qahrm/login.php");
		dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
        dd.findElement(By.name("txtPassword")).sendKeys("sadar");
        dd.findElement(By.name("Submit")).click();
        if(dd.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td[2]/strong/font")).getText().equals("Invalid Login"))
        	 System.out.println("pass_tc_2_3");
        else
     	   
     	   System.out.println("fail_tc_2_3");
        dd.close();
	}

}
