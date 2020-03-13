package autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Uplad {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		 WebDriver bo=new FirefoxDriver();  
	     bo.manage().window().maximize();
	     
		bo.get( "file:///C:/Users/qaplanet/Desktop/upp.html");
		bo.findElement(By.name("photofile")).click();
		//bo.get("http://dmlogics.in/build1/ProfileUpdate.html");
		//choose file button
		//Thread.sleep(3000);
		//bo.findElement(By.xpath("//input[@id='profession-1']")).click();
		//bo.findElement(By.id("photofile")).click();
		//bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[5]/p[2]/input[1]")).click();
		//bo.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Actions obj=new Actions(bo);
		//Thread.sleep(3000);
	  // obj.moveToElement(bo.findElement(By.id("1"))).perform(); 
	   //Thread.sleep(3000);
	  // obj.doubleClick(bo.findElement(By.id("1")));
  // bo.findElement(By.xpath("//*[@id='photofile']")).click();
	/*Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\qaplanet\\Desktop\\Ait\\uplfile.exe");
		Thread.sleep(3000);
		ControlFocus ( "Open", "", "Edit1")
		ControlSetText ("Open", "", "Edit1","C:\Users\qaplanet\Desktop\keyword.docx")
		ControlClick ( "Open", "", "Button1"  )*/
	}

}
