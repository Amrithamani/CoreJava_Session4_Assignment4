package session4;

public class Manager extends Employee {

	// calling Constructor for Manager child class

	Manager(String name) {

		super(name);// calling parent constructor

	}

	// declaring method for Salary bonus

	public int bonusSalary() {

		// initialize travel allowance variable

		int travelAllowance = getSalary() * 15 / 100;

		// calculating bonusSalary by adding travelAllowance and salary

		int bonusSalary = travelAllowance + getSalary();

		return bonusSalary;// getting bonusSalary

	}

}
