package employee.info.system;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * 
	 **/
	public static void main(String[] args) {
		
		
		EmployeeInfo empOne = new EmployeeInfo("Peter Parker","New York",1);
		empOne.setBenefit("Healt Insurance");
		empOne.setDepartment("Photography");
		empOne.toString();
		
		Salary peterSalary = new Salary("Peter Parker",  1, 3600.00);
	    System.out.println("Call mailCheck using Salary reference --");
	    peterSalary.mailCheck();
	    peterSalary.setBonus(.10);
	    peterSalary.setYearOfEmployeement(10);
	    peterSalary.getBonus();
	    peterSalary.toString();
	    

	}

}
