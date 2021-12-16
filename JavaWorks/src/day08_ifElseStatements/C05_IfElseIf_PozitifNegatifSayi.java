package day08_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseIf_PozitifNegatifSayi {

	public static void main(String[] args) {

		// Soru 6) Kullanicidan iki sayi isteyin,

		// sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
		// sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
		// sayilarin ikisi farkli isaretlere sahipse farkli isaretlerde sayilarla islem
		// yapamazsiniz yazdirin,
		// sayilardan sifira esit olan varsa sifir carpmaya gore yutan elemandir yazdirin.


		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen iki sayi yaziniz \nilk sayidan sonra diger sayi icin enter'e basiniz");

		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();

		if (sayi1 > 0 && sayi2 > 0) {

			System.out.println("Sayilarin toplami : " + (sayi1 + sayi2));

		} else if (sayi1 < 0 && sayi2 < 0) {

			System.out.println("Sayilarin carpimi : " + (sayi1 * sayi2));

		} else if (sayi1 * sayi2 < 0) { // sayılarin biri pozitif biri negatif se carpimlari o sonucu verir

			System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");

		} else {

			System.out.println("Sifir carpmaya gore yutan elemandir");
		}

		scan.close();
	}
}
