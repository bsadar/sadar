package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> setobject=new HashSet<String>();  
		setobject.add("Ravi");  
		setobject.add("Vijay");  
		setobject.add("Ravi");  
		setobject.add("Ajay");  
		setobject.add("Ajay"); 
		//Traversing elements  
		Iterator<String> itr=setobject.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
	                       }

}
}
