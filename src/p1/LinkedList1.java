package p1;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> x = new LinkedList<>();
		x.add(10);
		x.add(20);
		x.add(30);
		x.addFirst(100);
		x.addLast(200);
		x.addFirst(500);
		x.addFirst(250);
		x.addLast(5000);
		x.add(700);
		
		System.out.println(x);
		
	}
}
