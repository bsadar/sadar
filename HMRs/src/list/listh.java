package list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class listh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		//bo.get("file:///C:/Users/qaplanet/Desktop/QAP/DemoListfield.html");
	    bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		Select lf= new Select(bo.findElement(By.name("languages")));
		//Thread.sleep(3000);
		lf.selectByIndex(1);
		//Thread.sleep(3000);
		//lf.selectByIndex(2);
		//lf.selectByValue("saab");
		//lf.selectByVisibleText("JavaScript");
		//Slf.selectByIndex(3);
		//lf.selectByValue("audi");

		
		
	
	/*//	Multilist
		Select ml= new Select(bo.findElement(By.name("selenium_suite")));
		
		//ml.selectByIndex(3);
		ml.selectByVisibleText("Selenium RC");
		Thread.sleep(3000);
		ml.selectByIndex(2);
		ml.selectByIndex(1);
		Thread.sleep(3000);
		//ml.selectByIndex(3);
		ml.deselectByIndex(2);
		//ml.deselectByIndex(3);
		*/
		
	
		
		
		
		
	}

}
