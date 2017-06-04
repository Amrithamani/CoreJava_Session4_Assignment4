package session4;

public class Employee {

	// initialize private name variable
	private String name;

	// initialize private salary variable
	private int salary = 30000;

	// calling Constructor for name
	Employee(String name) {

		this.name = name;// setting name value

	}

	// declaring public method to get name

	public String getName() {

		return name;// getting name value

	}

	// declaring method to get salary

	public int getSalary() {

		return salary;// getting Salary value

	}

}
