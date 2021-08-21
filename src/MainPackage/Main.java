package MainPackage;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee wage computation program");
		Employee em1=new Employee(20);
		//UC1
		if(em1.isPresent())
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
		
		//UC2
		System.out.println("Daily wage of the regular employee is "+ em1.calculatedailyWage());
		
		
		//UC3
		System.out.println("Daily wage of the part time employee is " +em1.calculatePartTimeDailyWage());
	}

}
