package edu.home.composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		Employee ceo = new Employee("John", "CEO", 30000);
		Employee headSales = new Employee("Robert", "Head Sales", 20000);
		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
		ceo.add(headSales);
		ceo.add(headMarketing);
		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		// print all employees of the organization
		System.out.println(ceo);
		for (Employee headEmployee : ceo.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}

	}

}
