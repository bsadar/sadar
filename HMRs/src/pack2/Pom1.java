package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom1 {
WebDriver dr2;
	
	By un=By.name("txtPassword");
	
	public Pom1(WebDriver dr2){
		this.dr2=dr2;
	}
	


public void un_txt(){
		dr2.findElement(un).sendKeys("lab1");
	}

}
