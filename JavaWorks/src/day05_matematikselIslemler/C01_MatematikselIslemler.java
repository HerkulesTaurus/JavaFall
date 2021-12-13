package day05_matematikselIslemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {

		System.out.println(4 * (2 + 5) / 2); // 14

		System.out.println(4 * (2 + 5) / 3); // 9 28/3=9 28 tam sayi 9 da tam sayi ikisi de int oldugu icin sonuc tam
												// sayi olur

		// sonucu virgullu yazdirmak istersek

		double sonuc = 4 * (2 + 5) / 3;

		System.out.println(sonuc); // 9.0 yazar

		sonuc = (double) (4 * (2 + 5) / 3);

		System.out.println(sonuc); // 9,0

		sonuc = (double) 4 * (2 + 5) / (double) 3;

		System.out.println(sonuc); // 9.333333333333334

		int    sayi1 = 5;
		int    sayi2 = 2;
		double sayi3 = 2;

		System.out.println(sayi1 / sayi2); // 5/2=2 yazar �k�s�de �nt oldugu �c�n sonuc hemen int olur

		System.out.println(sayi1 / sayi3); // 5/2=2.5 yazar �nt bolu double sonucu double yazar

		System.out.println(sayi1 + sayi3 / sayi2); // 6.0 yazar

		// sonucun . noktali olmasini istiyorsak sayilardan birini double yapmaliyiz

		// sayilardan birinin onune parantez icinde double yazmak onu cast etmek yani
		// virgul lu sayi yapmak demektir

	}

}
