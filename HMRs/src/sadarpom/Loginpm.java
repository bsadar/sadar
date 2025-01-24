package sadarpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpm{
	
   WebDriver bo;
    //sadar 22/8/2019
  
   //shareef 23/7/2017
   By unamelocator=By.xpath("//td[2]/input");
   //method of uuid text field
   public void ue_txt(String unamevalue) {
	   bo.findElement(unamelocator).sendKeys(unamevalue);
	 	
	 }
	//passing value from constrctor to this class variable
   Loginpm(WebDriver bro){
	 this.bo=bro;
   }

   
   
}




