package orangeProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		FirefoxDriver Driver=new FirefoxDriver();
		//TO maximize browser
		Driver.manage().window().maximize();
		//Explicit wait object
		WebDriverWait wait=new WebDriverWait(Driver, 60);
		//Action class
		Actions Act=new Actions(Driver);
		//--------------------------------------------
		//Open application
		Driver.get("http://apps.qaplanet.in/qahrm/login.php");
		//Verify home page
		if(wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management")))
		{
			System.out.println("Home Page displayed");
		}
		else
		{
			System.out.println("Failed to opne home page");
			return;
		}
		//Create Webelements for user name,password,login and clear
		WebElement objUN=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
		WebElement objPWD=Driver.findElement(By.name("txtPassword"));
		WebElement objLogin=Driver.findElement(By.name("Submit"));
		WebElement objClear=Driver.findElement(By.name("clear"));
		//--------------------------------------------------------
		//Verify UN
		if(objUN.isDisplayed())
		{
			System.out.println("User name displayed");
		}
		//Verify pwd
		if(objPWD.isDisplayed())
		{
			System.out.println("Password displayed");
		}
		//Verify login and clear
		if(objLogin.isDisplayed() && objClear.isDisplayed())
		{
			System.out.println("Login and clear fields are displayed");
		}
		//---------------------------------------------------------------------
		String sUN="qaplanet1";
		String sPWD="lab1";
		//--------------------------------------------------------------------
		objUN.clear();
		objUN.sendKeys(sUN);
		objPWD.clear();
		objPWD.sendKeys(sPWD);
		objLogin.click();
		//-------------------------------------------------------------------
		//Verify home page
		if(wait.until(ExpectedConditions.titleIs("OrangeHRM")))
		{
			System.out.println("OrangeHRM Page displayed");
		}
		else
		{
			System.out.println("Failed to login OrangeHRM page");
			return;
		}	
		//----------------------------------------------------------------------
		//Get welcome text
		String WelText=Driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
		//Verify welcome text
		if(WelText.equals("Welcome "+sUN))
		{
			System.out.println("Welcome "+sUN+" displayed");
		}
		//Verify only user name
		String[] Arr=WelText.split(" ");
		if(Arr[1].equals(sUN))
		{
			System.out.println(sUN+" displayed");
		}
		//--------------------------------------------------------------------------
		//Verify chnage password and logout
		WebElement objCP=Driver.findElement(By.linkText("Change Password"));
		WebElement objLogout=Driver.findElement(By.linkText("Logout"));
		if(objCP.isDisplayed() && objLogout.isDisplayed())
		{
			System.out.println("Change password and logout are displayed");
		}
		//------------------------------------------------------------------------
		//Create object for PIM
		WebElement objPIM=Driver.findElement(By.id("pim"));
		//Mouse over
		Act.moveToElement(objPIM).perform();
		//---------------------------------------------------------------------------
		//Click on add employee
		Driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(2000);
		//wait for frame and switch to it
		Driver.switchTo().frame("rightMenu");
		//--------------------------------------------------------------------
		//Verify PIM : Add Employee
		if(Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("PIM : Add Employee"))
		{
			System.out.println("PIM : Add Employee displayed");
		}
		//---------------------------------------------------------------------------
		//Get employee code
		String sEmpID=Driver.findElement(By.id("txtEmployeeId")).getAttribute("value");
		//Last name and first name
		String sLN="M";
		String sFN="Sreedhar";
		//---------------------------------------------------------------------------
		//Create object for save
		WebElement objSave=Driver.findElement(By.id("btnEdit"));
		//Click on save
		objSave.click();
		//wait for alert present
		Alert A=wait.until(ExpectedConditions.alertIsPresent());
		//Verify alert message 
		if(A.getText().equals("Last Name Empty!"))
		{
			System.out.println("Last Name Empty! displayed");
			A.accept();
		}
		//Enter last name
		Driver.findElement(By.name("txtEmpLastName")).sendKeys(sLN);
		//--------------------------------------------------------------
		//Click on save
		objSave.click();
		//wait for alert present
		Alert A1=wait.until(ExpectedConditions.alertIsPresent());
		//Verify alert message 
		if(A1.getText().equals("First Name Empty!"))
		{
			System.out.println("First Name Empty! displayed");
			A1.accept();
		}	
		Driver.findElement(By.name("txtEmpFirstName")).sendKeys(sFN);
		//Click on save
		objSave.click();
		//-------------------------------------------------------------------
		//wait for Personal Details text
		if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='mainHeading']/h2"), "Personal Details")))
		{
			System.out.println("Personal Details text displayed");
		}
		//Switch to parent frame
		Driver.switchTo().parentFrame();
		//-------------------------------------------------------------------------
		//Mouse over
		Act.moveToElement(objPIM).perform();
		//---------------------------------------------------------------------------
		//Click on Employee List
		Driver.findElement(By.linkText("Employee List")).click();
		//wait for frame and switch to it
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));	
		//Verify Employee Information
		if(Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Employee Information"))
		{
			System.out.println("Employee Information displayed");
		}		
		//---------------------------------------------------------------------------
		//Get row count
		int rc=Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
		for(int i=1;i<=rc;i++)
		{
			//Get second column data
			String sEmpCode=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[2]")).getText();
			//Get third column data
			String sEmpName=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
			if(sEmpCode.equals(sEmpID) && sEmpName.equals(sFN+" "+sLN))
			{
				System.out.println(sEmpName+" , "+sEmpCode+" displayed at: "+i);
				break;
			}
		}
		//-------------------------------------------------------------------------
		//Way 2: 
		String sEmpName=Driver.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text(),'"+sEmpID+"')]/following-sibling::td/a")).getText();
		if(sEmpName.equals(sFN+" "+sLN))
		{
			System.out.println(sEmpName+" displayed");
		}
		//switch to default content
		Driver.switchTo().defaultContent();
		//----------------------------------------------------------------------------
		//Click on logout
		objLogout.click();
		//wait 2 sec
		Thread.sleep(2000);
		//Verify home page
		if(Driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Sign off sucessfull & Home Page displayed");
		}
		else
		{
			System.out.println("Failed to Sign off");
			return;
		}
		//----------------------------------
		Driver.close();
		Driver.quit();
				
		
	}

}
