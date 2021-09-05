package MainPackage;

public class CompanyEmpWage {
	public final String company;
	public final int wagePerHour;
	public final int noOfWorkingDaysPerMonth;
	public final int noOfWorkingHoursPerMonth;
	private int totalWage;
	
	CompanyEmpWage(String company, int wagePerHour, int noOfWorkingDaysPerMonth, int noOfWorkingHoursPerMonth){
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.noOfWorkingDaysPerMonth = noOfWorkingDaysPerMonth;
		this.noOfWorkingHoursPerMonth = noOfWorkingHoursPerMonth;
	}
	
	public void setTotalEmpWage(int totalWage) {
		this.totalWage = totalWage;
	}

	@Override
	public String toString() {
		return "Total wage of the company "+this.company+" is "+this.totalWage+"\n";
	}
	
}
