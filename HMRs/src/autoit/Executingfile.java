package autoit;

import java.io.IOException;

public class Executingfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//executing exe file from desktop or from disc
Runtime.getRuntime().exec("C:\\Users\\qaplanet\\Desktop\\Calc50.exe");
	
   //exe file existing within project of any package
  Runtime.getRuntime().exec(System.getProperty("user.dir")+"/src/autoit/Calc50.exe");

  }

}