package javaExamplesMethod;

public class EMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jntu obj=new Jntu();
		       obj.add();

		      obj.add1(45, 55);
		      
		      int p;
		     p= obj.add2();
		     System.out.println(p);
		     
		     int s;
		     s= obj.add4(56,789);
		     System.out.println(s);
	}

}

















class Jntu{
	void add(){
		int a;
		int b;
		int t;
			a=2;
	        b=3;
	        t=a+b;
	       System.out.println(t);
					
	}
void add1(int a, int b){
		
		int t;
			
	        t=a+b;
	        System.out.println(t);
					
	}

	 int add2(){
		int a;
		int b;
		int t;
			a=2;
	        b=3;
	        t=a+b;
	      return t;
					
	}
	 int add4(int a,int b){
	
		int t;
			
	        t=a+b;
	      return t;
					
	}
	
	
}
	
	

