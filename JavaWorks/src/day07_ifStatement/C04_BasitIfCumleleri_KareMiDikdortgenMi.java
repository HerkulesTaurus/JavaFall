package day07_ifStatement;

import java.util.Scanner;

public class C04_BasitIfCumleleri_KareMiDikdortgenMi {

	public static void main(String[] args) {

		// Soru-4 : Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		// ve dikdortgenin kare olup olmadigini yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen dikdorgenin bir kenar uzunlugunu girin");

		double kenar1 = scan.nextDouble();

		System.out.println("Lutfen dikdorgenin diger kenar uzunlugunu girin");

		double kenar2 = scan.nextDouble();

		if (kenar1 == kenar2) {

			System.out.println("Girilen dikdortgen kare");
			
		}else {
			
			System.out.println("Kare degil dikdortgen");
		}

	}
}
