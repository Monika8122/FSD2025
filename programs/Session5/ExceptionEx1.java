package Session5;

public class ExceptionEx1 {
	
	String str1 = "123";
	
	public void name() {
		try {
			int i = Integer.parseInt(str1);
			System.out.println("The value of converted String: "+str1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExceptionEx1 e = new ExceptionEx1();
		e.name();
	}

}
 