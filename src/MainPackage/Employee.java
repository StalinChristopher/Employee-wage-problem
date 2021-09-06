package MainPackage;

public class Employee implements ComputeEmpWage{
	private final static int FULL_TIME = 1;
	private final static int PART_TIME = 2;
	private int empType;
	private int noOfCompanies = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	Employee() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	public void isPresent() {
		double emp_val = Math.floor(Math.random() * 10) % 3;
		if (emp_val == 1) {
			empType = FULL_TIME;
			System.out.println("Full time employee is present");
		} else if (emp_val == 2) {
			empType = PART_TIME;
			System.out.println("Part time employee is present");
		} else {
			System.out.println("Employee is absent");
		}

	}

	@Override
	public void addCompanyEmpWage(String company, int wagePerHour, int workingDaysPerMonth, int workingHoursPerMonth) {
		companyEmpWageArray[noOfCompanies] = new CompanyEmpWage(company, wagePerHour, workingDaysPerMonth,
				workingHoursPerMonth);
		noOfCompanies++;
	}

	private int computeWage(CompanyEmpWage companyEmpWage) {
		int total_Days_worked = 0, total_hours_worked = 0, empWorkingHours = 0;
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
			System.out.println("Day no: " + total_Days_worked);
			System.out.println("Hours worked today : " + empWorkingHours);
			total_hours_worked += empWorkingHours;
		}
		System.out.println("Total hours worked: " + total_hours_worked);
		System.out.println("Total days worked: " + total_Days_worked + "\n");
		return (total_hours_worked * companyEmpWage.wagePerHour);

	}

	@Override
	public void computeWage() {
		for (int i = 0; i < noOfCompanies; i++) {
			companyEmpWageArray[i].setTotalEmpWage(computeWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

}
