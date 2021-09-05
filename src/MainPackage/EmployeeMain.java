package MainPackage;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee wage computation program");
		
		//Creating a employee object
		Employee em1=new Employee();
		
		//To randomly select the employee type and assign working hours based on type of employee
		em1.isPresent();
		
		/*
		System.out.println("Daily wages of employee "+em1.calculateDailyWageSwitch());
		System.out.println("Monthly wage of employee "+em1.calculateMonthlyWage());
		*/
		
		em1.computeWage(20, 15, 40);
				

	}
}

