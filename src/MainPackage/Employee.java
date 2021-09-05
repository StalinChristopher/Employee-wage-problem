package MainPackage;

public class Employee {
	//private final double regularFullDayWorkingHours=8;
	//private final double partTimeFullDayWorkingHours=4;
	private final double monthlyWorkingDays=20;
	private final static int FULL_TIME = 1;
	private final static int PART_TIME = 2;
	private final double wagePerHour = 20;
	private int empWorkingHours;
	private int emp_type;
	private double dailyWage;
	private static int totalWage;
	
	public void isPresent() {
		double emp_val=Math.floor(Math.random()*10)%3;
		if(emp_val == 1) {
			emp_type = FULL_TIME;
			System.out.println("Full time employee is present");
		}else if(emp_val == 2 ) {
			emp_type = PART_TIME;
			System.out.println("Part time employee is present");
		}else {
			System.out.println("Employee is absent");
		}

	}
	
	public double calculatedailyWage() {
		return empWorkingHours*wagePerHour;
		
	}
	
	
	public double calculatePartTimeDailyWage() {
		return empWorkingHours*wagePerHour;
	}
	
	public double calculateDailyWageSwitch() {
		switch(emp_type) {
		case FULL_TIME: dailyWage=empWorkingHours*wagePerHour;
				break;
		case PART_TIME: dailyWage=empWorkingHours*wagePerHour;
				break;
		}
		return dailyWage;
	}
	
	public double calculateMonthlyWage() {
		return monthlyWorkingDays*calculateDailyWageSwitch();
	}
	
	public double calculateWagePerHour(int wagePerHour,int hours) {
		return hours*wagePerHour;
	}
	
	public static void computeWage(String company,int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {
		int total_Days_worked=0, total_hours_worked = 0, empWorkingHours = 0;
		while(total_Days_worked<workingDaysPerMonth && total_hours_worked<workingHoursPerMonth){
				int empCheck = (int) Math.floor(Math.random()*10)%3;
				switch(empCheck) {
				case FULL_TIME:
					empWorkingHours = 8;
					break;
				case PART_TIME:
					empWorkingHours = 4;
					break;
				default:
					empWorkingHours = 0;
				}
				total_Days_worked++;
				System.out.println("\nDay no: "+total_Days_worked);
				System.out.println("Hours worked today : "+empWorkingHours);
				total_hours_worked+=empWorkingHours;
				System.out.println(total_hours_worked);
			}
			System.out.println("\nTotal hours worked: "+total_hours_worked);
			System.out.println("Total days worked: "+total_Days_worked);
			totalWage = total_hours_worked * wagePerHour;
			System.out.println("Total wages of "+company+" is "+totalWage);
	}
	

}
