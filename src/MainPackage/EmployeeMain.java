package MainPackage;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee wage computation program");
		
		//Creating a employee object
		Employee em1=new Employee();
		
		//To check if employee is present or absent
		em1.isPresent();
		
		Employee.computeWage("Dmart",20, 15, 40);
		Employee.computeWage("Infosys", 300, 25, 100);
				

	}
}

