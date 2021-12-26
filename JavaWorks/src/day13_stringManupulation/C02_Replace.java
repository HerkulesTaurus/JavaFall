   package day13_stringManupulation;

import java.util.Scanner;

public class C02_Replace {

	public static void main(String[] args) {
		
		// String olarak verilen 10.000 sayisinin 
		// 1000 den buyuk olup olmadigini yazdirin 
		
		String sonuc="10.000";
		
		sonuc=sonuc.replace(".", "");// 10000 e cevirip sonuca assign ettik
		 							 // == oldugu icin sonuc kalici olarak degisti
		System.out.println(sonuc);   // noktayi kaybedip yerine bosluk koydu

		if (Integer.valueOf(sonuc)>1000) { 
			
		// stringi intiger e cevirdik yoksa kabul etmiyor. noktayi kaybettik 
			
			System.out.println("bulunan sonuc sayisi 1000'den buyuk");
			
		} else {
			
			System.out.println("bulunan sonuc sayisi 1000'den kucuk");

		}
		
	}

}
