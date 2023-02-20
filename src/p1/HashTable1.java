package p1;

import java.util.Hashtable;

//Hashtable will store key,value pair 
//Hashtable it is synchrozied.
public class HashTable1 {
	public static void main(String[] args) {
		
		Hashtable<Integer,String> hashTable =new Hashtable<>();
		hashTable.put(100,"OM");
		hashTable.put(200,"POWER");
		hashTable.put(300,"PANDA");
		System.out.println(hashTable);
		System.out.println(hashTable.get(100));
		System.out.println(hashTable.values());
		System.out.println(hashTable.keySet());
	}
}
