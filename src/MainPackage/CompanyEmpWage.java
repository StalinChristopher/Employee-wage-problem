package MainPackage;
import java.util.*;	

/**
 * @author Stalin Christopher
 *
 */
public class CompanyEmpWage {
	public final String company;
	public final int wagePerHour;
	public final int noOfWorkingDaysPerMonth;
	public final int noOfWorkingHoursPerMonth;
	private int totalWage;
	private List<Integer> dailyWages = new ArrayList<>();
	
	CompanyEmpWage(String company, int wagePerHour, int noOfWorkingDaysPerMonth, int noOfWorkingHoursPerMonth){
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.noOfWorkingDaysPerMonth = noOfWorkingDaysPerMonth;
		this.noOfWorkingHoursPerMonth = noOfWorkingHoursPerMonth;
	}
	
	public void setDailyWages(List<Integer> dailyWages) {
		this.dailyWages = dailyWages;
	}
	
	public int getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public String getCompany() {
		return company;
	}

	public int getWagePerHour() {
		return wagePerHour;
	}

	public int getNoOfWorkingDaysPerMonth() {
		return noOfWorkingDaysPerMonth;
	}

	public int getNoOfWorkingHoursPerMonth() {
		return noOfWorkingHoursPerMonth;
	}

	public List<Integer> getDailyWages() {
		return dailyWages;
	}

	public void setTotalEmpWage(int totalWage) {
		this.totalWage = totalWage;
	}

	@Override
	public String toString() {
		return "Total wage of the company "+this.company+" is "+this.totalWage+"\n";
	}
	
}
