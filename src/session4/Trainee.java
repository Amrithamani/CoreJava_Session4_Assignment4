package session4;

public class Trainee extends Employee {

	// calling Constructor for Trainee child class
	Trainee(String name) {

		super(name);// calling parent constructor

	}

	// declaring method for Salary bonus

	public int bonusSalary() {

		// initialize travel allowance variable

		int travelAllowance = getSalary() * 10 / 100;

		// calculating bonusSalary by adding travelAllowance and salary

		int bonusSalary = travelAllowance + getSalary();

		return bonusSalary;// getting bonusSalary

	}

}
