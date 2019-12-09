package polly;

public class OR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JN35 obj=new JN35();
             obj.display();
           //
        //     obj.display();
             //over riding

     JN34 obj1=new JN35();
     obj1.add();
     
	}

}
class JN34{
	
	int i=20;
void 	add(){
		
		int t;
		int a;
		int b;
		a=2;
		b=3;
		t=a+b;
		System.out.println(t);
		
	}
	
	}
class JN35 extends JN34{
	int i=30;
void 	add(){
		
		int t;
		int a;
		int b;
		a=7;
		b=8;
		t=a+b;
		System.out.println(t);
		
	}
void display(){
	super.add();
	this.add();
}

	
	}