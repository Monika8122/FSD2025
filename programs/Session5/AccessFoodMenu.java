package Session5;

public class AccessFoodMenu implements VegItems, NonVegItems {
	
	@Override
	public void fry() {
		System.out.println("Chicken fry, Prawn fry, Mutton Fry, Fish fry etc..");
	}
	
	@Override
	public void gravy() {
		System.out.println("Chicken gravy, Fish gravy etc..");
	}
	
	@Override
	public void breakfast() {
		System.out.println("Idly, Dosa, Pongal etc..");
	}

	@Override
	public void lunch() {
		System.out.println("Curd rice, Tomato rice, Meals etc..");
		
	}
	
	public static void main(String[] args) {
		
		AccessFoodMenu afm = new AccessFoodMenu();
		afm.breakfast();
		afm.lunch();
		afm.fry();
		afm.gravy();
	}
	
	

}
