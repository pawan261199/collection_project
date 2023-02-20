package p1;
//maintain insertion order
//It store null elements
//It is Stores  only unique value elements
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
public static void main(String[] args) {

	LinkedHashSet<Integer> hashset = new LinkedHashSet<>();
	hashset.add(10);
	hashset.add(20);
	hashset.add(30);
	hashset.add(30);
	hashset.add(null);
	hashset.add(300);
	System.out.println(hashset );
	
	
}
}
