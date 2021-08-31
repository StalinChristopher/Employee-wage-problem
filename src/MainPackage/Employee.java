package MainPackage;

public class Employee {
	private final double regularFullDayWorkingHours=8;
	private final double partTimeFullDayWorkingHours=4;
	private final double monthlyWorkingDays=20;
	private final int FULL_TIME = 1;
	private final int PART_TIME = 2;
	
	double wagePerHour;
	int emp_type;
	double dailyWage;
	Employee(int wagePerHour,int emp_type){
		this.wagePerHour=wagePerHour;
		this.emp_type=emp_type;
	}
	boolean isPresent() {
		double emp_val=Math.floor(Math.random()*10)%2;
		if(emp_val==1)
			return true;
		else
			return false;
	}
	
	double calculatedailyWage() {
		return regularFullDayWorkingHours*wagePerHour;
		
	}
	
	
	double calculatePartTimeDailyWage() {
		return partTimeFullDayWorkingHours*wagePerHour;
	}
	
	double calculateDailyWageSwitch() {
		switch(emp_type) {
		case FULL_TIME: dailyWage=regularFullDayWorkingHours*wagePerHour;
				break;
		case PART_TIME: dailyWage=partTimeFullDayWorkingHours*wagePerHour;
				break;
		}
		return dailyWage;
	}
	
	double calculateMonthlyWage() {
		return monthlyWorkingDays*calculateDailyWageSwitch();
	}
	
	double calculateWagePerHour(int hours) {
		return hours*wagePerHour;
	}

}
