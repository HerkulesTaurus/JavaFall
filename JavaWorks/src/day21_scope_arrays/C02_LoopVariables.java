package day21_scope_arrays;

import java.util.Iterator;

@SuppressWarnings("unused")
public class C02_LoopVariables {

	public static void main(String[] args) {

		int sayi=10;
		
		for (int i = 0; i < 6; i++) { //loop d�s�ndak� veriyi loop d�s�nda kullanamay�z .
			String isim="Ali";
			System.out.println(sayi+" "+isim);
		}
		
		// System.out.println(isim);  
		// System.out.println(i);
		
		//loop i�erisinde olusturulan variable lar loop d�s�nda kullan�lamazlar
		// Bunun �c�n loop d�s�nda da �ht�yac�m�z olan b�r deg�sken varsa
		// loop dan once olusturur ve emn�yette kalmak �c�n initialize yapar�z 
		
		for (int i = 0; i < 10; i++) {
		//int sayi=20; sayi variable'� main method un icinde olusturuldugundan tum ma�n method da gecerl�d�r.
		//dolay�s�yla yen�den ayn� �s�mde b�r variable olusturamazs�n�z
			
			@SuppressWarnings("unused")
			String isim="Veli"; //isim=Ali d�ger for dongusunde oldugu �c�n burda yen�den isim=veli olusturulab�l�r
			
			
		} 
	}
}
