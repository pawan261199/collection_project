package p1;

import java.util.HashMap;
import java.util.Map;

//HAshMap used hashtable internally
//hashMap stores key,value pair
//Hashmap is not synchronized
//injecting the data into hashtable form hashing
public class W {

	public static void main(String[] args) {
		
	Map<Integer,String> EmployeeId = new HashMap<Integer,String>();
	EmployeeId.put(100,"Om");
	EmployeeId.put(200, "LOIN");
	EmployeeId.put(300,"POND");
	
	System.out.println(EmployeeId);
	System.out.println(EmployeeId.get(100));
	System.out.println(EmployeeId.get(300));
	System.out.println(EmployeeId.values());
	System.out.println(EmployeeId.keySet());
	
	
	}
}