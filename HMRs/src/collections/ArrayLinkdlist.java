package collections;

import java.util.Iterator;
import java.util.LinkedList;



public class ArrayLinkdlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay"); 
		//al.add(1);
		System.out.println(al.size());
		
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
	}

	}
}
