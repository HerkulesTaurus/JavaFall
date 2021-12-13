package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {

// kullanicidan 3 basamakli bir sayi alip rakamlar toplamini yazdiran bir kod yazin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 3 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		// sayi 573 olsun

		int rakamlarToplami = 0; // birsey bulmak istiyorsak ona bir variable olusturulur

		int rakam = sayi % 10; 
// 573 un 10 a bolumu bana 3 rakamini verir yani birler basamagi % demek modulus demek.yani mod								

		rakamlarToplami += rakam; // rakamlar toplami 3 oldu

		// sayi hala 573, degismedi
		// 3 ten kurtulmak istiyoruz, cunku 3 ile isimiz bitti
		// sayiyi 57 haline getirelim.

		sayi /= 10;

		// 570 i 10 a bolunce 57 sayisi cikar

		// sayi artik 57
		// 7 yi nasil alirim?

		rakam = sayi % 10;

		rakamlarToplami += rakam;

		// sayi hala 57
		// 7 den de kurtulalim

		sayi /= 10;

		// sayi art�k 5

		rakamlarToplami += sayi;

		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);

		// sayi kac basamakliysa basamak sayisi kadar ayni islem devam edilir 

	}

}
