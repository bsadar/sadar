package fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bp="http://apps.qaplanet.in/qahrm/login.php";
    Login lg=new Login(bp);
          lg.tc2_1();
		
		
		
	}

}
