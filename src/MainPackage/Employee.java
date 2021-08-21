package MainPackage;

public class Employee {
	final double regularFullDayWorkingHours=8;
	final double partTimeFullDayWorkingHours=8;
	final double monthlyWorkingDays=20;
	
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
		case 1: dailyWage=regularFullDayWorkingHours*wagePerHour;
				break;
		case 2: dailyWage=partTimeFullDayWorkingHours*wagePerHour;
				break;
		}
		return dailyWage;
	}
	
	double calculateMonthlyWage() {
		return monthlyWorkingDays*calculateDailyWageSwitch();
	}

}
