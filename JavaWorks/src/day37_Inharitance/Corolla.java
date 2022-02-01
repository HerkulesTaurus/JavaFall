package day37_Inharitance;

public class Corolla extends Toyota {

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi = 4;
	String uretmYeri = "Turkiye";

	public static void main(String[] args) {

		Corolla                 arb1               =           new           Corolla();
//Class name&&Data type     Object name       assignment     Keyword        Cunstructor

		// java da obje olusturdugumuz her class ismi aynı zmaanda bir data turudur.
		// bu ornek icin corolla hem class adı hem de olusturdugumuz arb1 objesinin data
		// type dir.
		// String str=new String("Ali Can"); burada string oldugu gıbı.

		// Java da obje uretilen her bir class ayni zamanda non-primitive data turu
		// olur.
		// class isimleri parent isimlerinden yazılabılır

		System.out.println(arb1.calisiyorMu); // true
		System.out.println(arb1.tekerSayisi); // 4
		System.out.println(arb1.uretmYeri); // Turkiye

		Toyota arb2 = new Corolla();
		Toyota arb4 = new Toyota();

		System.out.println(arb2.calisiyorMu); // true
		System.out.println(arb2.tekerSayisi); // 0

		Araba arb3 = new Corolla();

		System.out.println(arb3.calisiyorMu); // true

	}

}
