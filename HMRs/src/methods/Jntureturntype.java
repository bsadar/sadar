package methods;

import net.bytebuddy.asm.Advice.Return;

public class Jntureturntype {

	
	 int add(){
		 int a;
		 int b;
		 int t;
		 a=2;
		 b=3;
		 t=a+b;
		 return t;
	 }
	 
	 int add(int a,int b){
		 int t;
		 t=a+b;
		return t;
	 }


}
