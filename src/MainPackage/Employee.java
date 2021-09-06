package MainPackage;
import java.util.*;

/**
 * @author Stalin Christopher
 *
 */
public class Employee implements ComputeEmpWage{
	private final static int FULL_TIME = 1;
	private final static int PART_TIME = 2;
	private List<CompanyEmpWage> companyEmpWageList;
	private Map<String, CompanyEmpWage> companyEmpWageMap;

	Employee() {
		companyEmpWageList = new ArrayList<>();
		companyEmpWageMap = new HashMap<>();
	}

	public void isPresent() {
		double emp_val = Math.floor(Math.random() * 10) % 3;
		if (emp_val == 1) {
			System.out.println("Full time employee is present");
		} else if (emp_val == 2) {
			System.out.println("Part time employee is present");
		} else {
			System.out.println("Employee is absent");
		}

	}

	@Override
	public void addCompanyEmpWage(String company, int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, wagePerHour, workingDaysPerMonth,workingHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyEmpWageMap.put(company, companyEmpWage);
	}

	private int computeWage(CompanyEmpWage companyEmpWage) {
		int total_Days_worked = 0, total_hours_worked = 0, empWorkingHours = 0;
		List<Integer> dailyWages = new ArrayList<>();
		while (total_Days_worked < companyEmpWage.noOfWorkingDaysPerMonth
				&& total_hours_worked < companyEmpWage.noOfWorkingHoursPerMonth) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
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
			System.out.print("Day no: " + total_Days_worked);
			System.out.println("     Hours worked today : " + empWorkingHours);
			dailyWages.add(empWorkingHours*companyEmpWage.getWagePerHour());
			total_hours_worked += empWorkingHours;
		}
		companyEmpWage.setDailyWages(dailyWages);
		System.out.println("Total hours worked: " + total_hours_worked);
		System.out.println("Total days worked: " + total_Days_worked + "\n");
		return (total_hours_worked * companyEmpWage.wagePerHour);

	}

	@Override
	public void computeWage() {		
		for(CompanyEmpWage companyEmpWage: companyEmpWageList) {
			companyEmpWage.setTotalEmpWage(computeWage(companyEmpWage));
			System.out.println(companyEmpWage);
			System.out.println("Daily wages of the company "+companyEmpWage.getCompany()+" : ");
			System.out.println(companyEmpWage.getDailyWages());
			System.out.println();
		}
	}

	@Override
	public int getTotalWage(String name) {
		return companyEmpWageMap.get(name).getTotalWage();
	}

}
