package employee.info.system;

public class EmployeeInfo implements Employee {

	/*
	 * This class can be implemented from Employee interface then add additional
	 * methods in EmployeeInfo class. Also, Employee interface can be
	 * implemented into an abstract class.So create an Abstract class then
	 * inherit that abstract class into EmployeeInfo class.Once you done with
	 * designing EmployeeInfo class, go to CnnEmployee class to apply all the
	 * fields and attributes.
	 * 
	 * Important: YOU MUST USE the OOP(abstraction,Encapsulation, Inheritance
	 * and Polymorphism) concepts in every level possible. Use all kind of
	 * keywords(super,this,static,final........)
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	private String companyName;
	private String department;
	private String benefit;
	private String name;
	private String address;
	private int employeeID;

	//default constructor
	public EmployeeInfo() {

	}
	//constructor to get employee basic information
	public EmployeeInfo(String name, String address, int employeeID) {
		this.name = name;
		this.address = address;
		this.employeeID = employeeID;
	}

	public EmployeeInfo(String name, int employeeId) {
		this.name = name;
		this.employeeID = employeeId;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	public String getAddress() {
		return address;
	}

	@Override
	public int employeeId() {
		// TODO Auto-generated method stub
		return employeeID;
	}

	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	@Override
	public String employeeName() {
		return name;
	}

	@Override
	public void assignDepartment() {
		// TODO Auto-generated method stub
		System.out.println (department);
	}

	@Override
	public int calculateSalary() {
		return 0;
	}

	@Override
	public void benefitLayout() {
		System.out.println( benefit);
	}
	@Override
	public String toString() {
		return "EmployeeInfo [department=" + department + ", benefit=" + benefit
				+ ", name=" + name + ", address=" + address + ", employeeID=" + employeeID + "]";
	}
}
