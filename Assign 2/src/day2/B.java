package day2;

public class B {
	int employeeExperience;

	public B(int employeeId, String employeeName, int employeAge) {
		super(employeeId, employeeName, employeAge);
		// TODO Auto-generated constructor stub
		this.employeeExperience =employeeExperience;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("employee ID is:"+super.employeeId);
		System.out.println("employee Name is:"+super.employeeName);
		System.out.println("employee Age is:"+super.employeeAge);
		System.out.println("employee Experience is:"+employeeExperience);
		
		
	}


}
