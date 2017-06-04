package session4;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating instance object for Manager child class

		Manager boss = new Manager("Amritha Mani");

		// creating instance object for Trainee child class

		Trainee staff = new Trainee("Tanaya");

		System.out.println("Salary before Calculating Travel Allowance for Manager and Trainee : 30000 ");
		// prints "Salary before Calculating Travel Allowance for Manager and
		// Trainee : 30000"

		System.out.println("Bonus Salary after Calculating Travel Allowance for Manager : " + boss.bonusSalary());
		// prints "Bonus Salary after Calculating Travel Allowance for Manager :
		// 34500"

		System.out.println("Bonus Salary after Calculating Travel Allowance for Trainee : " + staff.bonusSalary());
		// prints "Bonus Salary after Calculating Travel Allowance for Trainee :
		// 33000"

	}

}
