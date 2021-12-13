package day04_IncrementDecrement;

import java.util.Scanner;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {

		// eger buyuk data turundeki bir veriyi daha kucuk data turundeki
		// variable'a atamak istersek java bunu otomatik olarak yapmaz

		int sayi1 = 300;

		short sayi2 = (short) sayi1; // burdaki parantez icinde javanin oneriyor (short) hatayi duzeltmek icin
		// esitligin sagi ile solundaki veri turleri farkli oldugundan java mismatch
		// hatasi verir.
		// hatayi gidermek icin buyuk data turundeki deger in onune manuel onayimizi
		// gosteren (short) yazilir
		// yada hata veren yerin ustune gelince orda cikan onerilerden add short (chash)
		// secilir

		System.out.println("sayi2 : " + sayi2);

		byte sayi3 = (byte) sayi2;

		System.out.println("sayi3 : " + sayi3);

		// deger byte in sinirlarindan buyuk oldugu icin java int 300' u kendi yontemine
		// gore byte donusturur.
		// ve bu arada bizim sayimiz degisir

		double sayi4 = 87.9;

		int sayi5 = (int) sayi4; // double int den buyuk oldugu icin hata veriyor, onerisini tiklamak lazim

		System.out.println("sayi5 : " + sayi5);

		// deger virgullu oldugundan ve int'da ondalikli kisim olmadigindan
		// java ondalikli kismi keser yazmaz dolayisiyla data kaybi olusur.

		int sayi6 = 27;
		int sayi7 = 4;

		System.out.println(sayi6 / sayi7);

		// bolme islemi yapilan say�lar�n �ks��de �nt oldugu �c�n java sonucu �nt yapar
		// tam yazar yan� kusuru siler.

		double sayi8 = 4;
		double sayi9 = 17;

		System.out.println(sayi9 / sayi8);

		// i�lem yap�lan say�lardan daha gen�s data rurune sah�p olan double oldugundan
		// sonucu double olarak ver�r.

		System.out.println(sayi9 / sayi7);

	}

}
