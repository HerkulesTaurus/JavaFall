package day12_stringManupulation;

public class C05_Contains {

	public static void main(String[] args) {

		String cumle = "Calisirsaniz, java ogrenmek cok kolay ";
		
		System.out.println(cumle.contains(" ")); //true
		
		System.out.println(cumle.contains("iz, j")); // true
		
		// bunca char artama olmaz 
		
		// se sonuc hep true/false olarak doner
		
		System.out.println(cumle.contains("Hasan")); //false
		

	}

}
