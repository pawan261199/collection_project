package p1;

import java.util.TreeSet;

//It will sort data in ascending order
//it is only unique elements
//it doesn't contain null value


public class TreeSet1 {
	public static void main(String[] args) {
		
		TreeSet<Integer> hashSet = new TreeSet<>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(75);
		hashSet.add(20);
		hashSet.add(25);
		System.out.println(hashSet);
	}
}
