package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arralist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList obj=new ArrayList();
		obj.add("sadar");
		obj.add(234);
		obj.add('m');
		obj.add("sadar");

				
	//System.out.println(obj);
		
	int size=obj.size();
	  for (int i=0;i<size;i++){
		  System.out.println(obj.get(i));
	  }

	  
	  
	/*for (Object el:obj){
		 System.out.println(el);
	}
	  
	Iterator it=obj.iterator();
	while(it.hasNext()){
		Object el=it.next();
		System.out.println(el);
	}
	*/
	
			
		}
	
}


