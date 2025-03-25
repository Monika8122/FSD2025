package Session5;

public class AccessPerson {
	
	public static void main(String[] args) {
		
		//Original Person Object
		Person originalPerson = new Person("Keerthi", 18);
		
		Person copiedPerson = new Person(originalPerson); //Object dependency
		
		System.out.println("Original Person:");
		originalPerson.displayInfo();
		
		System.out.println("Copied Person:");
		copiedPerson.displayInfo();
	}

}
