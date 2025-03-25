package Session4;

public class ConstructorOverloading {
	
	private String empname;
	private int empid;
	private String location;
	
	public ConstructorOverloading(String empname, int empid, String location) {
		this.empname = empname;
		this.empid = empid;
		this.location = location;
	}
	
	public void displayInfo() {
		System.out.println("EmpName: "+this.empname);
		System.out.println("EmpId: "+this.empid);
		System.out.println("Emp Location: "+this.location);
	}
	
	
	
	
	public static void main(String[] args) {
		ConstructorOverloading cox = new ConstructorOverloading("Keerthi", 232225,"Cbe");
		cox.displayInfo();
		
	}

}
