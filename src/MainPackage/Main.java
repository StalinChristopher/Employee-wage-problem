package MainPackage;

public class Main {

	public static void main(String[] args) {
		//setting values for reg and part time employees to be used during obj creation
		final int REG_EMP=1;
		final int PART_TIME=2; 
		System.out.println("Welcome to the Employee wage computation program");
		
		//Creating a regular employee who has an wage per hour of 20
		Employee em1=new Employee(20,REG_EMP);
		
		if(em1.isPresent())
			System.out.println("Employee em1 is present");
		else
			System.out.println("Employee em1 is absent");
		
		System.out.println("Daily wages of employee em1 of type regular is "+em1.calculateDailyWageSwitch());
		System.out.println("Monthly wage of employee em2 of type regular is "+em1.calculateMonthlyWage());
		
		
		//Creating a part time employee who has an wage per hour of 10
		Employee em2=new Employee(10,PART_TIME);
		if(em2.isPresent())
			System.out.println("Employee em2 is present");
		else
			System.out.println("Employee em2 is absent");
		
		System.out.println("Daily wages of employee em2 of type part time is "+em2.calculateDailyWageSwitch());
		System.out.println("Daily wages of employee em2 of type part time is "+em2.calculateMonthlyWage());
	}

}
