package MainPackage;

/**
 * @author Stalin Christopher
 *
 */
public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee wage computation program");
		
		ComputeEmpWage builder = new Employee();
		

		builder.addCompanyEmpWage("Dmart", 60, 20, 80);
		builder.addCompanyEmpWage("Infosys", 200, 18, 85);
		builder.computeWage();
				

	}
}

