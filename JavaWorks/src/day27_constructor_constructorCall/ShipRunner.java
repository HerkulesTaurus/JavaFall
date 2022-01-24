package day27_constructor_constructorCall;

public class ShipRunner {

	public static void main(String[] args) {	



		Ship ship1=new Ship(2021,  "Ski",    "Wood",  "Blue", false);
					   //  year  category     body    color  forRent   
	
		
		System.out.println(ship1.year+" "+ship1.category+" "+ship1.body+" "+ship1.color+" "+ship1.forRent);
		
		
		Ship ship2 = new Ship(2020,  "Boat",   "White");		
				       //  year   category    color  
		
		System.out.println(ship2.year+" "+ship2.category+" "+ship2.body+" "+ship2.color+" "+ship2.forRent);  // 2020 Boat Fiber Glass White false
		
						
	}

}	

