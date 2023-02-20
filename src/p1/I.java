package p1;

import java.util.Comparator;

public class I implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
		
	}
		public static void main(String[] args) {
			
			I i1 = new I();
			int val = i1.compare(new Student (100,"abc"),(new Student (200,"xyz")));
			System.out.println(val);
			
		}
	
}
