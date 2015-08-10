package employee.info.system;

public abstract class EmployeeCommonFeature {
	private String name;
	private String address;
	private double salary;
	private int number;

	public EmployeeCommonFeature(String name) {
		this.name = name;
	}
	
	public EmployeeCommonFeature(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public EmployeeCommonFeature(String name, int number2, double salary) {
		this.name = name;
		this.salary = salary;
		this.number = number2;
	}

	public double computePay() {
		return 0.0;
	}

	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " " + this.salary);
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