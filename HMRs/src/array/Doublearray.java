package array;

public class Doublearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] b= new int[2][2];
		  b[0][0]=2;
		  b[0][1]=3;
		  
		  b[1][0]=10;
		  b[1][1]=20;
		  
		  
		/* System.out.println(b[0][0]);
		  System.out.println( b[0][1]);
		  
		  System.out.println(b[1][0]);
		  System.out.println( b[1][1]);*/
		  
		  
			for (int i=0;i<=1;i++)
			{
				for (int j=0;j<=1;j++){
				System.out.println(b[i][j]);	
				}
			}
	}

}
