package day05_matematikselIslemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {

		// Kullanicidan 4 basamakli bir sayi alip rakamlar toplamini yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 4 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();

		int rakamlarToplami = 0;
		int rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;

		// bu islemi basamak say�s� kadar tekrar edersek rakamlar tolam�n� buluruz

		rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;

		rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;

		rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;

		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);

		// say� kac basamakl�ysa basamak say�s� kadar ayn� �slem devam ed�l�r

	}

}
