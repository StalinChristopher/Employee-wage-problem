package MainPackage;

public class EmployeeMain {

	public static void main(String[] args) {
		//setting values for reg and part time employees to be used during obj creation
		final int REG_EMP=1;
		final int PART_TIME=2; 
		int total_hours_worked=0;
		int total_Days_worked=0;
		System.out.println("Welcome to the Employee wage computation program");
		
		//Creating a regular employee who has an wage per hour of 20
		Employee em1=new Employee(20,REG_EMP);
		
		if(em1.isPresent())
			System.out.println("Employee em1 is present");
		else
			System.out.println("Employee em1 is absent");
		
		System.out.println("Daily wages of employee em1 of type regular is "+em1.calculateDailyWageSwitch());
		System.out.println("Monthly wage of employee em1 of type regular is "+em1.calculateMonthlyWage());
		
		
		
		while(total_Days_worked<20 && total_hours_worked<100) {
			int randomHours = (int)Math.floor(Math.random()*((8-4)+1)+4);
			System.out.println("Hours worked today : "+randomHours);
			total_Days_worked++;
			System.out.println("Day no: "+total_Days_worked);
			total_hours_worked+=randomHours;
		}
		System.out.println("Total hours worked: "+total_hours_worked);
		System.out.println("Total days worked: "+total_Days_worked);
		System.out.println("Total wages earned by em1 : "+em1.calculateWagePerHour(total_hours_worked));
	}

}
