package interfacenew;

public class Interfacepract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     //-------------------
          int1  obji1=new JN20();
         
   
          
          
          JN20   objdr=new JN20();
      
          
          int1  obji2=new JN21();
          obji2.add();
          
          
          
	}

}
interface int1{
	int i=20;
	void add();
}
class JN20 implements int1{
 public void	add(){
	 int a;
	 int b;
	 int t;
	 a=2;
	 b=3;
	 t=a+b;
	 System.out.println(t);
	 System.out.println(t+i);
	}
 public void	sub(){
	 int a;
	 int b;
	 int t;
	 a=20;
	 b=10;
	 t=a-b;
	 System.out.println(t);
	 System.out.println(t+i);
	}
	
}
class JN21 implements int1{
	 public void	add(){
		  
		 System.out.println(i);
		}
	 public void	add1(){
		  
		 System.out.println(i+20);
		}
		
	}