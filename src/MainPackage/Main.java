package MainPackage;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee wage computation program");
		Employee em1=new Employee();
		//UC1
		if(em1.isPresent())
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
			
	}

}
