package sshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
            String bpath="https://chandanachaitanya.github.io/selenium-practice-site/";
		
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get(bpath);
		
		File SrcFile=((TakesScreenshot)bo).getScreenshotAs(OutputType.FILE);
		
	    FileUtils.copyFile(SrcFile, new File("D:\\Testsadar.png"));
	

	}

}
