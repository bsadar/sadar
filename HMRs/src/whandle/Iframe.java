package whandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver dd=new FirefoxDriver();
		dd.get("http://apps.qaplanet.in/qahrm/login.php");
		dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
        dd.findElement(By.name("txtPassword")).sendKeys("lab1");
        dd.findElement(By.name("Submit")).click();
        //change password
      dd.findElement(By.xpath("/html[1]/body[1]/div[3]/ul[1]/li[2]/a[1]")).click();
      /*  dd.switchTo().frame("rightMenu");
		dd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/form[1]/div[1]/input[1]")).click();*/
		

	}

}
