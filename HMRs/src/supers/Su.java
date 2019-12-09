package supers;

public class Su {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jn17 rw1=new Jn17();
		rw1.ok();
		rw1.supuse();

	}

}
class Jn16{
	int i=5;
	void ok(){
		 System.out.print("this is in 16");
	}
}
class Jn17 extends Jn16{
	
	int i=10;
	void ok(){
		 System.out.println(this.i);
	}
	void supuse(){
		 super.ok();
		 this.ok();
	}
}
