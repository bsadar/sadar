import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login  obj=new Login();
		  obj.tc1();
	}

}
class Login{
	
	 static String bpath="http://apps.qaplanet.in/qahrm/login.php";
     static WebDriver bo;
	
     static void tc1() {
    	 System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
  	      bo=new FirefoxDriver();
    	 bo.get(bpath);
  		bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
       bo.findElement(By.name("txtPassword")).sendKeys("lab1");
       bo.findElement(By.name("Submit")).click();
       
      if( bo.getTitle().equals("OrangeHRM"))
   	   System.out.println("pass_tc_2_1");
      else
   	   
   	   System.out.println("fail_tc_2_1");
       bo.close();
  	}
	
	
	
}