package Session4;

public class AdvancedString {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		
		//append
		sb.append("World");
		System.out.println("After append: "+sb);
		
		//insert
		sb.insert(5, ",");
		System.out.println("After insert: "+sb);
		
		//replace
		sb.replace(6, 11, "Java"); // Sourceindex,Dsetinationindex,  //String replace
		System.out.println("After replace: "+sb);
		
		//reverse
		sb.reverse();
		System.out.println("After reverse: "+sb);
	}

}
