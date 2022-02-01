package day39_overridingKurallari_Polymorhphism;

public class C01 {

	
	public static void staticMethod() {
		System.out.println("Parent class static method calisti");
		
	}
	private void privateMethod() {
		System.out.println("Parent class private method ");
		
	}
	// final demek bu son hali, bır daha demek
	// dolayısıyla final olarak tanımlanan method override edilemez
	public final void finalMethod() {
		System.out.println("Parent class final method");
		
		
	}
	
	//child class ile parent class aynı package de olduklarından 
	//method ların axcess modifier lari public,protected,private hıc bir sorun olmazdı 
}
