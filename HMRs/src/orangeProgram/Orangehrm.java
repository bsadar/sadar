package orangeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver Driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(Driver,30);
		//login page
		Driver.get("http://apps.qaplanet.in/hrm/login.php");
		Driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		Driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		Driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		//add employee
		Actions acr=new Actions(Driver);
		 acr.moveToElement(Driver.findElement(By.xpath("//span[@class='drop current']"))).perform();
		 Driver.findElement(By.linkText("Add Employee")).click(); 
		 Driver.switchTo().frame("rightMenu");
		 Thread.sleep(3000);	 
		Driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("chandu");
		Driver.findElement(By.name("txtEmpFirstName")).sendKeys("ramu");
		Driver.findElement(By.name("txtEmpMiddleName")).sendKeys("madhu");
		Driver.findElement(By.name("txtEmpNickName")).sendKeys("sagar");
		Driver.findElement(By.id("btnEdit")).click();
		Driver.findElement(By.xpath("//input[@class='resetbutton']")).click();
		
		//leaves
		Driver.switchTo().parentFrame();
		Thread.sleep(3000);	
		acr.moveToElement(Driver.findElement(By.xpath("//span[@class='drop'][contains(text(),'Leave')]"))).perform();
		acr.moveToElement(Driver.findElement(By.xpath("//span[contains(text(),'Assign Leave')]"))).perform();	
		Driver.findElement(By.xpath("//span[contains(text(),'Assign Leave')]")).click();
		//Assign leaves
		Driver.switchTo().frame("rightMenu");	
		Thread.sleep(3000);
		Select sel=new Select(Driver.findElement(By.name("sltLeaveType")));
		sel.selectByVisibleText("Medical");
		Driver.findElement(By.name("txtLeaveFromDate")).sendKeys("2019-12-12");
		Driver.findElement(By.name("txtLeaveToDate")).sendKeys("2018-10-15");
		Driver.findElement(By.id("saveBtn")).click();
		
		//time
		Driver.switchTo().parentFrame();
		Thread.sleep(3000);
		acr.moveToElement(Driver.findElement(By.xpath("//span[@class='drop'][contains(text(),'Time')]"))).perform();
		acr.moveToElement(Driver.findElement(By.xpath("//span[contains(text(),'Project Reports')]"))).perform();
Driver.findElement(By.xpath("//span[contains(text(),'Project Reports')]")).click();
//Project Report
Driver.switchTo().frame("rightMenu");
Thread.sleep(3000);
//Driver.findElement(By.name("cmbProject")).click();
Driver.findElement(By.xpath("//input[@id='cbxDeleted']")).click();
Driver.findElement(By.xpath("//input[@id='txtFromDate']")).sendKeys("2019-12-05");
Driver.findElement(By.name("txtToDate")).sendKeys("2019-02-16");
Driver.findElement(By.id("viewBtn")).click();
Driver.switchTo().alert().equals("Encountered the following problems\nInvalid date or zero or negative range specified");
Driver.switchTo().alert().accept();

//benefits
Driver.switchTo().parentFrame();
acr.moveToElement(Driver.findElement(By.xpath("//span[contains(text(),'Benefits')]"))).perform();
acr.moveToElement(Driver.findElement(By.xpath("//span[contains(text(),'Payroll schedule')]"))).perform();
Thread.sleep(3000);
//payroll schedule and add pay period
Driver.findElement(By.xpath("//span[contains(text(),'Add Pay Period')]")).click();
Driver.switchTo().frame("rightMenu");
Thread.sleep(3000);
Driver.findElement(By.name("txtPayPeriodFromDate")).sendKeys("2019-11-01");
Driver.findElement(By.name("txtPayPeriodCloseDate")).sendKeys("2019-11-31");
Driver.findElement(By.name("txtPayPeriodTimesheetDueDate")).sendKeys("2019-10-31");
Driver.findElement(By.name("txtPayPeriodCheckDate")).sendKeys("2019-11-05");
Driver.findElement(By.name("txtPayPeriodToDate")).sendKeys("2018-11-15");
Driver.findElement(By.xpath("//input[@id='saveBtn']")).click();
Driver.switchTo().alert().equals("Please correct the following\n\nSelect A Valid Pay Period\nSelect a valid timesheet aproval due date\n");
Driver.switchTo().alert().accept();

//recruitment
Driver.switchTo().parentFrame();
acr.moveToElement(Driver.findElement(By.xpath("/html[1]/body[1]/div[4]/ul[1]/li[6]/a[1]/span[1]"))).perform();
Thread.sleep(3000);
//job vacancies
Driver.findElement(By.xpath("//span[contains(text(),'Job Vacancies')]")).click();
Driver.switchTo().frame("rightMenu");
Thread.sleep(2000);
Select sel1=new Select(Driver.findElement(By.id("loc_code")));
sel1.selectByVisibleText("Vacancy ID");
//application
Driver.switchTo().parentFrame();
acr.moveToElement(Driver.findElement(By.xpath("/html[1]/body[1]/div[4]/ul[1]/li[6]/a[1]/span[1]"))).perform();
Thread.sleep(3000);
Driver.findElement(By.xpath("//span[contains(text(),'Applicants')]")).click();
Thread.sleep(3000);

//Reports
Driver.switchTo().parentFrame();
acr.moveToElement(Driver.findElement(By.xpath("//li[@id='report']//a[@class='l1_link']"))).perform();
Thread.sleep(3000);
//view Reports
Driver.findElement(By.xpath("//span[contains(text(),'View Reports')]")).click();
Driver.switchTo().frame("rightMenu");
Thread.sleep(3000);
Select sel2=new Select(Driver.findElement(By.id("loc_code")));
sel2.selectByVisibleText("Name");
//DEfine Reports
Driver.switchTo().parentFrame();
acr.moveToElement(Driver.findElement(By.xpath("//span[@class='drop current']"))).perform();
Thread.sleep(3000);
Driver.findElement(By.xpath("//span[contains(text(),'Define Reports')]")).click();

//Bug Tracker
Driver.switchTo().parentFrame();
Thread.sleep(3000);
acr.moveToElement(Driver.findElement(By.xpath("//span[contains(text(),'Bug Tracker')]"))).perform();
Driver.findElement(By.xpath("//span[contains(text(),'Bug Tracker')]")).click();
Driver.switchTo().frame("rightMenu");
Thread.sleep(3000);
Select sel3=new Select(Driver.findElement(By.name("category_id")));
sel3.selectByVisibleText("Interface");
Select sel4=new Select(Driver.findElement(By.name("cmbModule")));
sel4.selectByVisibleText("Recruitment");
Select sel5=new Select(Driver.findElement(By.name("priority")));
sel5.selectByVisibleText("2");
Driver.findElement(By.name("summary")).sendKeys("bugreport page");
Driver.findElement(By.name("txtEmail")).sendKeys("123@gmail.com");
Driver.findElement(By.name("txtDescription")).sendKeys("page ok");
Driver.findElement(By.id("saveBtn")).click();
Driver.findElement(By.xpath("//input[@class='clearbutton']")).click();

	}
	}

	


