package p1;

import java.util.LinkedList;

public class A {
	public static void main(String[] args) {
		
		Employee arun = new Employee("Arun", "Kumar", 100);
		Employee shiv = new Employee("Shiv","Singh",200);
		Employee om = new Employee("Om","YAdav",300);
		
		LinkedList<Employee> empDetails = new LinkedList<Employee>();
		empDetails.add(arun);
		empDetails.add(shiv);
		empDetails.add(om);
		System.out.println(empDetails);
		
		for (Employee e : empDetails) {
			System.out.println(e.getFirstName());
			System.out.println(e.getLastName());
			System.out.println(e.getId());
			System.out.println(e.hashCode());
			
			
		}
	}
}
