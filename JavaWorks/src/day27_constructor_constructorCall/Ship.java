package day27_constructor_constructorCall;

public class Ship {
	
 
	public int year = 2021;
	String category = "Sightseeing Boat"; 
	String body = "Fiber Glass"; 
	String color = "Pearl White";
	boolean forRent;
	

	public Ship(int i, String string, String string2, String string3,  boolean b) {
			  //  year      categori          body           color       forRent   
			year=i;
			category=string;
			body=string2;
			color=string3;
			forRent=b;

	}

	public Ship(int year, String category, String color) {
			    //  year         category         color  
		
		this.year=year;
		this.category=category;
		this.color=color;
		
		
		
		
	}
	
}
	
	
	