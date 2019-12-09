package polly;

public class Over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj=new A();
		
		obj.dis();
		A obj1=new  B();
		obj1.dis();
	}

}

class A{
void 	dis(){
		System.out.println("a");
	}
}
class B extends A{
	
	void pr(){
		super.dis();
	}
}