package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		 WebDriver bo=new FirefoxDriver();  
	     bo.manage().window().maximize();
	     
		bo.get( "file:///C:/Users/qaplanet/Desktop/upp.html");
	
		bo.findElement(By.id("input")).click();
		Runtime.getRuntime().exec("C:\\Users\\qaplanet\\Desktop\\uplfilesasdarnew.exe");
	}

}
