package day10_ternary_SwitchCase;

public class C11_SMConcat {

	public static void main(String[] args) {
		
		// String olarak verilen bir degisken + ile baska bir degiskenle isleme sokulursa 
		// JAVA bunlari yanyana ekler. buna Concatenation denir.
		
		String isim="Ali";
		String soyisim="Can";
		
		System.out.println(isim+ " " +soyisim); // Ali Can

		// ayni islemi + sembolu ve concat() ile de yapabiliriz 

		System.out.println(isim.concat(soyisim));
		
		//string methodlari arka arkaya istediginiz kadar kullanilabilir 
		
		System.out.println(isim.concat(" ").concat(soyisim)); //Ali Can

		// bosluk birakmayi sagliyor 
		
		
	}

}
