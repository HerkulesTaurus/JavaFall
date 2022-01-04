package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {

		// Kullanýcýndan 10 dan kucuk pozýtýf býr tam sayý girmesini isteyin
		// girdigi sayýya gore asagýdaký seklý yazdýrýn
		// ornek: 3 girilirse
		// 1
		// 1 2
		// 1 2 3

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 10'dan kucuk pozitif bir tam sayý giriniz...");

		int sayi = scan.nextInt();

		for (int satir = 1; satir <= sayi; satir++) {

			for (int i = 1; i <= satir; i++) {

				System.out.print(i + " ");
				
				// syso burda olursa her adýmda yazar. parantez altýna yazarsak sonucu yazdýrýr
			}

			System.out.println(""); // isini yaptýktan saonra alt satýra gecmesý ýcýn býrakýlan bos syso

		}

		scan.close();

	}
}
