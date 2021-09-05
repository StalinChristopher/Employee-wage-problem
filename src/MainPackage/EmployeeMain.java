package MainPackage;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee wage computation program");
		
		//Creating a employee object
		Employee employee=new Employee();
		

		employee.addCompanyEmpWage("Dmart", 60, 20, 80);
		employee.addCompanyEmpWage("Infosys", 200, 18, 85);
		employee.computeWage();
				

	}
}

