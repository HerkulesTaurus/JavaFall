package day07_ifStatement;

import java.util.Scanner;

public class C02_BasitIfCumleleri_TekMıCıftMı {

	public static void main(String[] args) {

		// Soru-1 kullanicidan bir tam sayi isteyin ve sayinin tek veya cift oldugunu
		// yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen bir tam sayi giriniz");

		int sayi = scan.nextInt();

		if (sayi % 2 == 0) {
			
			System.out.println("girdiginiz sayi cift bir sayi");
		}

		if (sayi % 2 == 1) {
			
			System.out.println("girdiginiz tek bir sayi");
		}
	}
}
