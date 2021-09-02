package MainPackage;

public class Employee {
	//private final double regularFullDayWorkingHours=8;
	//private final double partTimeFullDayWorkingHours=4;
	private final double monthlyWorkingDays=20;
	private final int FULL_TIME = 1;
	private final int PART_TIME = 2;
	private final double wagePerHour = 20;
	private int empWorkingHours;
	private int emp_type;
	private double dailyWage;
	private int total_Days_worked = 0;
	private int total_hours_worked = 0;

	public void isPresent() {
		double emp_val=Math.floor(Math.random()*10)%3;
		if(emp_val == 1) {
			emp_type = FULL_TIME;
			empWorkingHours = 8;
			System.out.println("Full time employee is present");
		}else if(emp_val == 2 ) {
			emp_type = PART_TIME;
			empWorkingHours = 4;
			System.out.println("Part time employee is present");
		}else {
			empWorkingHours = 0;
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
	
	public void daysAndHoursConditionWage(int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {
		if(!(emp_type==0)) {
			while(total_Days_worked<workingDaysPerMonth && total_hours_worked<workingHoursPerMonth){
				int randomHours = (int)Math.floor(Math.random()*((8-4)+1)+4);
				total_Days_worked++;
				System.out.println("\nDay no: "+total_Days_worked);
				System.out.println("Hours worked today : "+randomHours);
				total_hours_worked+=randomHours;
				System.out.println(total_hours_worked);
			}
			System.out.println("\nTotal hours worked: "+total_hours_worked);
			System.out.println("Total days worked: "+total_Days_worked);
			System.out.println("Total wages earned by employee: "+this.calculateWagePerHour(wagePerHour,total_hours_worked));
		}
		
	}
	

}
