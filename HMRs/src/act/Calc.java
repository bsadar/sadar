package act;

import java.io.File;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;



public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  File file = new File("D:\\SelWD\\AIT\\jacob-1.19\\jacob-1.19-x64.dll");
	        //path to the jacob dll
	        System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

	        AutoItX x = new AutoItX();
	       
	        x.run("calc.exe");
	        x.winWaitActive("Calculator");
	        if (x.winExists("Calculator"))
	        {
	        	System.out.println("Calculator displayed");
	        }
	        //click on 5 button
	        x.controlClick("Calculator", "", "Button10");
	        //click on 6 button
	        x.controlClick("Calculator", "", "Button15");
	        //click on * button
	        x.controlClick("Calculator", "", "Button21");
	        //click on 5 button
	        x.controlClick("Calculator", "", "Button10");
	        //click  on = button
	        x.controlClick("Calculator", "", "Button28");
	        x.sleep(4000);
	        x.winClose("Calculator");
		
		
	}
	

}
