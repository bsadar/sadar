package inherit;

public class Exin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Jntu19 rw119_1=new Jntu19();
 
       rw119_1.stdname="sdar";
       rw119_1.hno=23;
       rw119_1.ok();
       
       
       Jntu20 rw120_1=new Jntu20();
       rw120_1.branch="hyd";
       rw120_1.success();
       
       rw120_1.hno=89;
       rw120_1.stdname="v";
       rw120_1.ok();
             
      }

}

class Jntu19{
String	stdname;
	int hno;
	void ok(){
		System.out.println("it is k of 19");
	}
	
}

class Jntu20 extends Jntu19{
	String  branch;
	    void success(){
	    	System.out.println("it is success of 20");
	    }
	
}


