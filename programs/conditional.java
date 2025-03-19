package programs;
import java.util.Scanner;
public class conditional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the age: ");
		int age = s.nextInt();
		
		if(age>18)
		{
			System.out.println("eligble for voting");
		}
	}
}
