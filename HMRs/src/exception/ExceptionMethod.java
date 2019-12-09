package exception;

public class ExceptionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			add();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void add() throws Exception{
	int i;
		int j;
		int t;
		i=90;
		 j=9;
		 try{
		 t=i/j;
		 System.out.println(t);
		 }
		 catch(Exception e)
		 {
			 System.out.print(e);
		 }
	}

}
