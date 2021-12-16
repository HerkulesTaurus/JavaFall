package day08_ifElseStatements;

import java.util.Scanner;

public class C02_IfElse_HarfMiDegilmi {

	public static void main(String[] args) {

		// Soru-2 : kullanicidan bir karakter girmesini isteyin ve girilen karekterin harf olup olmadigini yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir karakter giriniz");

		char karakter = scan.next().charAt(0); // kullanicidan bir harf almak istiyorsak bu kisim olmali

		if ((karakter >= 'A' && karakter <= 'Z') || (karakter >= 'a' && karakter <= 'z')) {

			System.out.println("girdiginiz :" + karakter + " bir harftir ");

		} else {

			System.out.println("girdiginiz :" + karakter + " bir harf degildir ");

		}
	}
}
