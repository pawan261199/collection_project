package p1;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1 {
	public static void main(String[] args) {
		 
		ArrayList<Integer> x = new ArrayList<>();
		x.add(100);
		x.add(20);
		x.add(30);
		System.out.println(x);
		
		//inserting between the array
		x.add(1, 500);
		System.out.println("add(int index,element) = "+ x);
		
		//  addAll
		ArrayList<Integer> y =  new ArrayList<>();
		y.add(10);
		y.add(20);
		x.addAll(1, y);
		System.out.println("addAll(int index,Collection Name) = "+x);
		
		//contains
		if(x.contains(500)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		//remove
		x.remove(2);
		System.out.println("remove(index) = "+x);
		
		//get()
		x.get(1);
		System.out.println("get(int index) = "+x); 
		
		//itereator concept read the data of the array
		Iterator itr = x.iterator();
		while(itr.hasNext()) {
			System.out.println("value of x = "+itr.next());
		}
	}
}
