package employee.info.system;

public abstract class EmployeeCommonFeature {
	private String name;
	private double salary;
	private int number;

	public EmployeeCommonFeature(String name, int number2, double salary) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.salary = salary;
		this.number = number2;
	}

	public double computePay() {
		System.out.println("Inside Employee computePay");
		return 0.0;
	}

	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " " + this.salary);
	}

	public String toString() {
		return name + " " + salary + " " + number;
	}

	public String getName() {
		return name;
	}

	
	public int getNumber() {
		return number;
	}

	// ployMorphism
	public abstract double monthlySalary();
}