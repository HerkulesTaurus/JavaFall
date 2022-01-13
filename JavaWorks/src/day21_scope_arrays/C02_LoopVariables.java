package day21_scope_arrays;

import java.util.Iterator;

@SuppressWarnings("unused")
public class C02_LoopVariables {

	public static void main(String[] args) {

		int sayi=10;
		
		for (int i = 0; i < 6; i++) { //loop dýsýndaký veriyi loop dýsýnda kullanamayýz .
			String isim="Ali";
			System.out.println(sayi+" "+isim);
		}
		
		// System.out.println(isim);  
		// System.out.println(i);
		
		//loop içerisinde olusturulan variable lar loop dýsýnda kullanýlamazlar
		// Bunun ýcýn loop dýsýnda da ýhtýyacýmýz olan býr degýsken varsa
		// loop dan once olusturur ve emnýyette kalmak ýcýn initialize yaparýz 
		
		for (int i = 0; i < 10; i++) {
		//int sayi=20; sayi variable'ý main method un icinde olusturuldugundan tum maýn method da gecerlýdýr.
		//dolayýsýyla yenýden ayný ýsýmde býr variable olusturamazsýnýz
			
			@SuppressWarnings("unused")
			String isim="Veli"; //isim=Ali dýger for dongusunde oldugu ýcýn burda yenýden isim=veli olusturulabýlýr
			
			
		} 
	}
}
