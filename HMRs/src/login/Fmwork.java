package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fmwork {
   static String bpath;
            static WebDriver dd;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tc1();

	}
 static void tc1() {
	    be();
		dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
     dd.findElement(By.name("txtPassword")).sendKeys("lab1");
     dd.findElement(By.name("Submit")).click();
     
    if( dd.getTitle().equals("OrangjjjeHRM"))
 	   System.out.println("pass_tc_2_1");
    else
 	   
 	   System.out.println("fail_tc_2_1");
    
     dd.close();
	}
 

  static void be(){
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		dd=new FirefoxDriver();
		dd.get(bpath);
  }
  
}
