package MainPackage;

public class Employee {
	boolean isPresent() {
		double emp_val=Math.floor(Math.random()*10)%2;
		if(emp_val==1)
			return true;
		else
			return false;
	}

}
