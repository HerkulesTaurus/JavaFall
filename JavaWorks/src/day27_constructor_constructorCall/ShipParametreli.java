package day27_constructor_constructorCall;

public class ShipParametreli {

	public static void main(String[] args) {
 
		Ship ship1 = new Ship(2020, "Sightseeing Boat", "Fiber Glass", "Pearl White", true  );
	
	
	
		Ship ship2 = new Ship(2009, "Boat", "Steal");	
	
		System.out.println(ship2.body);
	}

}
