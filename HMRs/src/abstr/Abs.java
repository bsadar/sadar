package abstr;

public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI obj=new SBI();
		

          obj.ok();
  
          SBI obj2=new SBI();
          
	
	 RBI obj1=new ICICI();	     
	}

}
 abstract class RBI{
abstract void ok();

 //abstract	void add();
}

class SBI extends RBI {
	void ok(){
		System.out.println("SBI abstaexample");
		}
void	add(){
		System.out.print("sadar");
	}
}
class ICICI  extends RBI {
	void ok(){
		System.out.println("xicice emple");
	}
	
	
}