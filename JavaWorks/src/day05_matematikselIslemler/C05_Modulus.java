package day05_matematikselIslemler;

import java.util.Scanner;

public class C05_Modulus {

	public static void main(String[] args) {

		// Kullanicidan 6 basamakli bir sayi alip rakamlar toplamini yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 6 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();

		int rakamlarToplami = 0;
		int rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;

		// bu islemi basamak sayisi kadar tekrar edersek rakamlar toplamini buluruz

		rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;

		rakam = sayi % 10;
		rakamlarToplami += rakam;
		sayi /= 10;

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

		// sayi kac basamakliysa basamak sayisi kadar ayni islem devam edilir

	}

	{
		double sayi1 = 18.934;
		int sayi2 = (int) sayi1;

		System.out.println(sayi2);

	}

}
