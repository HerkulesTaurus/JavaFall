package day07_ifStatement;

import java.util.Scanner;

public class C03_BasitIfCumleleri_HaftaİciHaftaSonu {

	public static void main(String[] args) {

		/* Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
		 * Ornek: gun=Pazar output = Hafta sonu gun=Sali output = Hafta ici
		 *** String icin equals methodunu kullanin
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen gun ismini yaziniz");

		String gun = scan.next().toLowerCase(); //kullanici nasil yazarsa yazsin kucuk harfe cevirir

		if (gun.equals("pazar") || gun.equals("cumartesi")) {

			// gun den sonra .koyup equals to equals methodu kullandik
			// string non-primitive oldugu icin equals methodu kullanilir. esitlik
			// araniyorsa equals dir.

			System.out.println("Hafta sonu");

		}

		if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe")
				|| gun.equals("cuma")) {

			System.out.println("Hafta ici");

		}else {
			
			System.out.println("Boyle bır gun yok... ");
		}				
	
		// String non-primitive oldugu icin == kullanilmaz bunun yerine equals() kullanilir.
	
	}
}
