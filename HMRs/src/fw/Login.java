package fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

          WebDriver bo;
		  String   bpath;
		
		void tc2_1(){
			System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		     bo=new FirefoxDriver();
		     bo.get( bpath);
		     
		      }


		Login(String bp){
			this.bpath=bp;
		}
       
}

