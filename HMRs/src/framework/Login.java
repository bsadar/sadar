package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	WebDriver brw;
	 String buildexe;
	public void tc2_1(){
		
		       BuildExecution bro=new   BuildExecution();
		        brw=bro.buildexecution();
		        //brw.get("http://apps.qaplanet.in/qahrm/login.php");
		        buildexe= bro.bpath;
		        brw.get(buildexe);
				brw.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
		        brw.findElement(By.name("txtPassword")).sendKeys("lab1");
		        brw.findElement(By.name("Submit")).click();
		        
		       if( brw.getTitle().equals("OrangeHRM"))
		    	   System.out.println("pass_tc_2_1");
		       else
		    	   
		    	   System.out.println("fail_tc_2_1");
		        brw.close();  
		
		
		
	      }
	public void tc2_2(){
		
	       BuildExecution bro=new   BuildExecution();
	        brw=bro.buildexecution();
	        //brw.get("http://apps.qaplanet.in/qahrm/login.php");
	        buildexe= bro.bpath;
	        brw.get(buildexe);
			brw.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	        brw.findElement(By.name("txtPassword")).sendKeys("lab1");
	        brw.findElement(By.name("Submit")).click();
	        
	       if( brw.getTitle().equals("OrangeHRM"))
	    	   System.out.println("pass_tc_2_2");
	       else
	    	   
	    	   System.out.println("fail_tc_2_2");
	        brw.close();  
	
	
	
   }
}
