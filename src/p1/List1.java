package p1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List1 {
	
	public static void main(String[] args) {
		
		List<Integer> x = new LinkedList<>();
		x.add(10);
		x.add(20);
		x.add(30);
		System.out.println(x);
		
		//inserting between the array
		x.add(1, 500);
		System.out.println("add(int index,integer) = "+x);
		
		//addAll
		List<Integer> y = new LinkedList<>();
		y.add(10);
		y.add(20);
		System.out.println("addAll(Int index,integer value) = "+x);
		
		//contains-- like a searching
		if (x.contains(500)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		
		//remove
		x.remove(1);
		System.out.println("Remove(integer value ) = "+ x);
		
		//get()--it will read the data based on index no.
		x.get(1);
		System.out.println("get(int index) = "+x);
		
		//iterator concept is used to Read the data from the array
		
		Iterator itr = x.iterator();
		while(itr.hasNext()) {
			System.out.println("value of x = "+itr.next());
		}
		
	}
}


