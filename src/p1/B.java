package p1;

import java.util.LinkedList;

public class B {
	public static void main(String[] args) {
		
		Employee roj = new Employee("Roj","Singh", 100);
		Employee ekta = new Employee("ekta", "Singh", 10);
		Employee purvi = new Employee("Purvi", "Thaukur", 50);
		
		LinkedList<Employee> empDetails = new LinkedList<>();
		empDetails.add(roj);
		empDetails.add(ekta);
		empDetails.add(purvi);
		System.out.println(empDetails);
		
		for (Employee e : empDetails) {
			System.out.println(e.getFirstName());
			System.out.println(e.getLastName());
			System.out.println(e.getId());
			
			
		}
		
	}
}
