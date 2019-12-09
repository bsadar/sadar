package formsubmit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Formsub {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
	




		
				System.setProperty("webdriver.chrome.Driver", "D:\\hai\\");
				WebDriver Driver=new ChromeDriver();
				Driver.manage().window().maximize();
				Driver.get("http://apps.qaplanet.in/hrm/login.php");
				WebElement US=Driver.findElement(By.name("txtUserName"));
				US.sendKeys("qaplanet1");
				WebElement PWD=Driver.findElement(By.name("txtPassword"));
				PWD.sendKeys("lab1");
				WebElement Login=Driver.findElement(By.name("Submit"));
				Login.click();
				Thread.sleep(3000);
				//WebElement Logout=Driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
				//Logout.click();
				Actions Act=new Actions(Driver);
				WebElement objPIM=Driver.findElement(By.xpath("//li[@id='pim']"));
				Act.moveToElement(objPIM).perform();
				//driver.findElement(By.linkText("Employee List")).click();
				Driver.findElement(By.linkText("Add Employee")).click();
				Driver.switchTo().frame("rightMenu");
				if(Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("PIM : Add Employee"));
				{
					System.out.println("PIM : Add Employee displayed");
				}
				{
					System.out.println("Failed to display PIM : Add Employee");
				}

				//----------------------------------------------------
				String sFN="who";
				String sLN="are you";
				//----------------------------------------------------
				//Get employee code
				String strEmpCode=Driver.findElement(By.name("txtEmployeeId")).getAttribute("value");
				//create webelement for save
				WebElement objSave=Driver.findElement(By.id("btnEdit"));
				//Keep all fields as blank and click on save
				objSave.click();
				//wait for alert
				WebDriverWait wait=new WebDriverWait(Driver, 60);
				Alert A=wait.until(ExpectedConditions.alertIsPresent());
				//Verify alert message
				if(A.getText().equals("Last Name Empty!"))
				{
					System.out.println("Last Name Empty! displayed");
					A.accept();
				}
				//Enter last name
				Driver.findElement(By.name("txtEmpLastName")).sendKeys(sLN);
				//Click on save
				objSave.click();
				//wait for alert
				Alert A1=wait.until(ExpectedConditions.alertIsPresent());
				//Verify alert message
				if(A1.getText().equals("First Name Empty!"))
				{
					System.out.println("First Name Empty! displayed");
					A1.accept();
				}	
				//Enter employee first name
				Driver.findElement(By.name("txtEmpFirstName")).sendKeys(sFN);
				//---------------------------------------------------
			    //Click on save
				//click on photofile
						Act.click(Driver.findElement(By.name("photofile")));
						Act.moveToElement(Driver.findElement(By.name("photofile"))).perform();
						//*********
						//create object for robot class
						Robot rt=new Robot();
						StringSelection ss=new StringSelection("D:\\hai\\Sample Pictures\\Jellyfish.jpg");
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
						rt.delay(1000);
						//rt.keyboard(keycode);
						rt.keyPress(KeyEvent.VK_CONTROL);
						rt.keyPress(KeyEvent.VK_V);
						rt.keyRelease(KeyEvent.VK_V);
						rt.keyRelease(KeyEvent.VK_CONTROL);
						rt.delay(1000);
						//----------------------------
						/*rt.keyPress(KeyEvent.VK_TAB);
						rt.keyRelease(KeyEvent.VK_TAB);
						rt.delay(1000);
						rt.keyPress(KeyEvent.VK_TAB);
						rt.keyRelease(KeyEvent.VK_TAB);*/
						//-------------------------------------
						rt.delay(1000);
						rt.keyPress(KeyEvent.VK_ENTER);
						rt.delay(500);
						rt.keyRelease(KeyEvent.VK_ENTER);
						rt.delay(600);
						objSave.click();
						{
							System.out.println("picture displayed");
						}	
				//wait for Personal Details text
				if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='mainHeading']/h2"), "Personal Details")))
				{
					System.out.println("Personal Details displayed");
				}
				//-------------------------------------------------------
				Driver.findElement(By.xpath("//input[@id='btnEditPers']")).click();
				WebElement Middlename=Driver.findElement(By.xpath("//input[@name='txtEmpMiddleName']"));
				Middlename.sendKeys("LoK");
				Middlename.sendKeys(Keys.CLEAR);
				Middlename.sendKeys(Keys.ADD);
				Middlename.sendKeys("Esh");
				Middlename.sendKeys(Keys.CONTROL,"a");
				Middlename.sendKeys(Keys.DELETE);
				Middlename.sendKeys("k");
				WebElement 	Nickname=Driver.findElement(By.xpath("//input[@id='txtEmpNickName']"));
				Nickname.sendKeys("LOKI");
				Nickname.sendKeys(Keys.CLEAR);
				Nickname.sendKeys(Keys.ADD);
				Nickname.sendKeys("LooS");
				Nickname.sendKeys(Keys.CONTROL,"a");
				Nickname.sendKeys(Keys.DELETE);
				Nickname.sendKeys("LoKeSh");
				Nickname.sendKeys(Keys.TAB);
				WebElement SSNNo=Driver.findElement(By.xpath("//input[@id='txtNICNo']"));
				SSNNo.sendKeys("123");
				SSNNo.sendKeys(Keys.TAB);
			    Select sel1=new Select(Driver.findElement(By.xpath("//select[@name='cmbMarital']")));
			    sel1.selectByVisibleText("Unmarried");
			    Thread.sleep(1000);
			    sel1.selectByVisibleText("Married");
			    Thread.sleep(1000);
			    sel1.selectByVisibleText("Divorced");
			    Thread.sleep(1000);
			    sel1.selectByVisibleText("Unmarried");
				{
					System.out.println("Unmarried");
				}
			   // sel1.sendKeys(Keys.TAB);
				WebElement GenderFemale=Driver.findElement(By.xpath("//input[@id='gender2']"));
				GenderFemale.click();
				Thread.sleep(2000);
				WebElement GenderMale=Driver.findElement(By.xpath("//input[@id='gender1']"));
				GenderMale.click();
				{
					System.out.println("gender1");
				} 
				WebElement objsave=Driver.findElement(By.id("btnEditPers"));
				objsave.click();
				WebElement Back=Driver.findElement(By.xpath("//input[@class='backbutton']"));
				Back.click();
				{
					System.out.println("Employee Information Displayed");
				} 
			/*	WebElement Eid=Driver.findElement(By.xpath("//input[@value='1556']"));
				Eid.click();
				WebElement Eid2=Driver.findElement(By.xpath("//input[@value='1558']"));
				Eid.click();*/
				WebElement Eid3=Driver.findElement(By.xpath("//input[@value='1672']"));
				Eid3.click();
				WebElement Delete=Driver.findElement(By.xpath("//input[@onclick='returnDelete();']"));
				Delete.click();
			
			   //switch to parent frame
				Driver.switchTo().parentFrame();
				
				//-------------------------------------------
				//Mouse ove ron PIM
				/*Act.moveToElement(objPIM).perform();
				//Click on Employee List
			    Driver.findElement(By.linkText("Employee List")).click();
				//wait 2 sec
				Thread.sleep(2000);
				//switch to frame
				Driver.switchTo().frame("rightMenu");
				//Verify Employee Information
				if(Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Employee Information"))
				{
					System.out.println("Employee Information displayed");
				}
				else
				{
					System.out.println("Failed to display Employee Information");
				}	*/
				//-------------------------------------------
				//Get row count
				/*int rc=Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
				int i;
				for(i=1;i<=rc;i++)
				{
					//Get emp id from second column
					String sEmpID=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[2]")).getText();
					//Get emp name from third column
					String sEmpName=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
					if(sEmpID.equals(strEmpCode) && sEmpName.equals(sFN+" "+sLN))
					{
						System.out.println(sEmpName+", "+sEmpID+", "+"displayed at: "+i);
						break;
					}
				}
				//switch to default page
				Driver.switchTo().defaultContent();
				//--------------------------------------------
				//Click on Logout
				Driver.findElement(By.linkText("Logout")).click();
				//wait 2 sec
				Thread.sleep(2000);
				//Verify home page displayed or not
				if(Driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
				{
					System.out.println("Signoff sucessfull & Home Page Displayed");
				}
				else
				{
					System.out.println("Failed to Signoff");
					return;
				}		
				//----------------------------------------------
				//Close browser
				Driver.close();
				//Quit object
				Driver.quit();*/
				WebElement Logout=Driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
				Logout.click();
				
			}



			

			}




	
