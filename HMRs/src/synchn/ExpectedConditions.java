package synchn;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExpectedConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open google chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chorme107\\chromedriver.exe");
		ChromeDriver  bo=new ChromeDriver();	
		//To maximize browser
		bo.manage().window().maximize();
		//Explicit wait object
		WebDriverWait wait=new WebDriverWait(bo,Duration.ofMillis(6000));
		
		//enter url in browser addrress
		bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		//Verify home page
		if(wait.until(ExpectedConditions.titleIs("HMR")))
		{
			System.out.println("HMR home Page displayed");
		}
		else
		{
			System.out.println("Failed to opne HMR home page");
			return;
		}
		//-------------------declaring webelements for fields on page ----
		//Create Webelements for user name ,password text fields and login button
		WebElement uidtext=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='id']")));
		WebElement pwdtext=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='pass']")));
		WebElement lgnbutton=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Login']")));
	
		//-------------------Verify fields on page ----------------------
		//Verify user name text field
		if(uidtext.isDisplayed())
		{
			System.out.println("User name displayed");
		}
		//Verify Verify password text field
		if(pwdtext.isDisplayed())
		{
			System.out.println("Password displayed");
		}
		//Verify login button
		if(lgnbutton.isDisplayed())
		{
			System.out.println("Login button is displayed");
		}
		//----------------declaring variables and assigning values ------
		// declaring user and password values
		String uidvalue="sadar";
		String pwdvalue="sadar";
		//-----------------operation on fields-----------------------------
		// clear user id text field and enter value
		uidtext.clear();
		uidtext.sendKeys(uidvalue);
		// clear password text field and enter value
		pwdtext.clear();
		pwdtext.sendKeys(pwdvalue);
		// clear password text field and enter value
		lgnbutton.click();
		//-------------------------------------------------------------------
		//Verify home page
		if(wait.until(ExpectedConditions.titleIs("MainHMR")))
		{
			System.out.println("OrangeHRM Page displayed");
		}
		else
		{
			System.out.println("Failed to login OrangeHRM page");
			return;
		}	

		
	}

}
