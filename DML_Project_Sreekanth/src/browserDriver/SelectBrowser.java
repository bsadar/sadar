package browserDriver;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import operations.ReadObjectRepository;

public class SelectBrowser 
{
	WebDriver driver;
	public SelectBrowser(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebDriver getBrowser() throws IOException
	{
		ReadObjectRepository ror=new ReadObjectRepository();
		
		// Select the browser type from objectRepository
		String select_browser=ror.getObjectRepository_Excel("browser_type");
    	
		// browser type is chrome or firefox or ie
		if(select_browser.equalsIgnoreCase("chrome"))
		{
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/browserDriver/chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
		}
		else if(select_browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/browserDriver/geckodriver.exe");
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
		}
		else if(select_browser.equalsIgnoreCase("ie"))
		{
			
				 System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"/src/browserDriver/IEDriverServer.exe");
				 
				 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				 capabilities.setCapability("requireWindowFocus", true);
				 capabilities.setCapability("nativeEvents", true);    
				 capabilities.setCapability("unexpectedAlertBehaviour", "accept");
				 capabilities.setCapability("ignoreProtectedModeSettings", true);
				 capabilities.setCapability("disable-popup-blocking", true);
				 capabilities.setCapability("enablePersistentHover", true);
				 driver = new InternetExplorerDriver(capabilities);
				 
		}
		return driver;
	}

}
