package p1;
///hashmap use internally hashtabl
//injecting the data from hashing into hashtable
//hash map store key,value pair
//hashMap is not synchronized
import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		
		HashMap<Integer, String> StudentInfo = new HashMap<>();

		StudentInfo.put(100,"Pankaj");
		StudentInfo.put(500, "Om");
		StudentInfo.put(200, "MOMos");
		
		System.out.println(StudentInfo);
		System.out.println(StudentInfo.get(500));
		System.out.println(StudentInfo.values());
		System.out.println(StudentInfo.keySet());
		
		
		
}}
