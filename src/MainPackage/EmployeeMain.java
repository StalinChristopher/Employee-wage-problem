package MainPackage;

public class EmployeeMain {

	public static void main(String[] args) {
		//setting values for reg and part time employees to be used during obj creation
		int total_hours_worked=0;
		int total_Days_worked=0;
		System.out.println("Welcome to the Employee wage computation program");
		
		//Creating a regular employee who has an wage per hour of 20
		Employee em1=new Employee();
		
		em1.isPresent();
		
		System.out.println("Daily wages of employee "+em1.calculateDailyWageSwitch());
		System.out.println("Monthly wage of employee "+em1.calculateMonthlyWage());
		
		em1.daysAndHoursConditionWage();
	}

}
