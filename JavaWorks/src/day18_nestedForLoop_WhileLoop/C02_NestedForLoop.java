package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {

		// Kullan�c�ndan 10 dan kucuk poz�t�f b�r tam say� girmesini isteyin
		// girdigi say�ya gore asag�dak� sekl� yazd�r�n
		// ornek: 3 girilirse
		// 1
		// 1 2
		// 1 2 3

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 10'dan kucuk pozitif bir tam say� giriniz...");

		int sayi = scan.nextInt();

		for (int satir = 1; satir <= sayi; satir++) {

			for (int i = 1; i <= satir; i++) {

				System.out.print(i + " ");
				
				// syso burda olursa her ad�mda yazar. parantez alt�na yazarsak sonucu yazd�r�r
			}

			System.out.println(""); // isini yapt�ktan saonra alt sat�ra gecmes� �c�n b�rak�lan bos syso

		}

		scan.close();

	}
}
