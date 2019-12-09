package sadarpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpm {
	
   WebDriver bo;
    //sadar 22/8/2019
  
   //shareef 23/7/2017
   By uname=By.xpath("//td[2]/input");
   
   void ue_txt(String ss){
	   bo.findElement(uname).sendKeys(ss);
	
   }
   
   
   Loginpm(WebDriver bro){
	 this.bo=bro;
   }
   
   
   
}




