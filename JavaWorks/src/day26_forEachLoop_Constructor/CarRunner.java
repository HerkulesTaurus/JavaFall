package day26_forEachLoop_Constructor;

import day15_methodCreation.H01_MethodCreatin2;

public class CarRunner {

	public static void main(String[] args) {
	// Car class inden bir obje olusturalim.
		
	// object olusturmak istedigimiz zaman. class adı/abje adi/keyword/constructor	
		
      Car                car1            =               new               Car(); //Cal constuctor call gibi calisiyo
//class ın ismi        obje ismi       atama 		   keyword			Constructor 
 		
	  System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil); //0
	  
// bir obje olustururken eger obje icin kendi class inda belirlenen degerleri kullanmak istiyorsam 
// hic bir degeri kendim atamadan obje olusturabilirim.
// bu durumda hicbir paramaetre kullanilmadigi icin default constructor yeterli olacaktir.
		
	  
// eger obje olusturdugum Class daki degerleri kullanmak yerine kendi degerlerimle bir obje olusturmak 
// istersem o zaman parametreli constructor olusturmam gerekir
	  
//  Car car2 = new Car("Kirmizi", "Corolla");
//  default kullanıyorsak bırsey gırmeye gerek yok, parametreli olsun dıyorsak parametreleri girmemiz lazim.
//  Car Class inda iki String parametresi olan bir constructor olmadigi icin onu kullanamadik 
//
	  
	  // ******bir class da default construtor vardır 
	  // ******eger parametre li bir constructor olusturuyorsak yeniden 
	  // ******o zaman java default constructor u yok eder. 
	  // ******parametresiz constructor a herzaman ihtiyac vardir.
	  // ******dolayisiyla hemen parametresiz bir class olsutururuz.

	   // Constructor lar
	   // -Class icinde olmalidir.
	   // -Constructor ile class ismi ayni olmalidir. buyuk harfle baslar 
	   // -return type lari olmaz 
	  
		H01_MethodCreatin2 obje = new H01_MethodCreatin2(); //day15-H01_MethodCreatin2 kopru kurduk ve ordaki method u burda kullandik
		obje.rakamlarToplami(234);
	}

}
