package employee.info.system;

public class Salary extends EmployeeCommonFeature {
	
	private static double yearOfEmployeement =0;
	private static double salary; // Annual salary
	private static double bonus;
	
	static EmployeeInfo empInfo = new EmployeeInfo();
	
	public Salary(String name, int number, double salary) {
		super(name,  number,salary );
		// TODO Auto-generated constructor stub
	}
	
	public double getYearOfEmployeement() {
		return yearOfEmployeement;
	}
	

	public void setYearOfEmployeement(int yearOfEmployeement) {
		this.yearOfEmployeement = yearOfEmployeement;
	}
	

	public double getBonus() {
		return bonus;
	}
	

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void mailCheck() {
		System.out.println("Mailing check to " + " with salary " + salary);
	}

	public static double getSalary() {
		return salary;
	}

	public void setSalary(double newSalary) {
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}

	
	/*
	 * This methods should calculate Employee bonus based on salary and
	 * performance. Then it will return the total yearly bonus. So you need to
	 * implement the logic. Hints: 10% of the salary for best performance, 8% of
	 * the salary for average performance and so on. You can set arbitrary
	 * number for performance. So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployeBonus() {
		return getSalary() * bonus;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and
	 * numbers of years with the company. Then it will return the total pension.
	 * So you need to implement the logic. Hints: pension will be 5% of the
	 * salary for 1 year, 10% for 2 years with the company and so on. So you
	 * probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployePension() {
		double total = 0;
		if(yearOfEmployeement > 50){
			total =  (yearOfEmployeement * getSalary())*0.10;//employee the get 10% of there salary as pension 
		}else{
			System.out.println("You are not eligible for Bonus");
		}
		return total;
	}

	@Override
	public double monthlySalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	@Override
	public String toString() {
		return "Salary [yearOfEmployeement=" + yearOfEmployeement + ", bonus=" + bonus + ", salary=" + salary + "]";
	}

}