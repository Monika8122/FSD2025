package Session5;

public class Overloading {
	
	int c;
	
	public void add(int a, int b){
		c = a+b;
		System.out.println("The value og integer c: "+c);
	}
	public void add(float a, int b) {
		float c = a+b;
		System.out.println("The value of float c: "+c);
	}
	public void add(float a, double b) {
		double c = a+b;
		System.out.println("The value of double c: "+c);
	}
	
	public static void main(String[] args) {
		Overloading ole = new Overloading();
		ole.add(25, 10);
		ole.add(32.5f, 10);
		ole.add(10.54f, 12.25478);
	}

}
