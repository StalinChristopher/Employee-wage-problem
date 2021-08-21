package MainPackage;

public class Employee {
	final double regularFullDayWorkingHours=8;
	final double partTimeFullDayWorkingHours=8;
	
	double wagePerHour;
	Employee(int wagePerHour){
		this.wagePerHour=wagePerHour;
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

}
