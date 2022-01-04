package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {

		// Kullan�c�dan toplamak uzere say�lar isteyin
		// sayi adedi 10 u gecerse veya toplam 500 u gecerse
		// "Bu kadar say� yeter "
		// ".... adet sayi girdin, toplam�...." yazd�r�n.

		// forloop la da whileloop la da yap�lab�l�r

		Scanner scan = new Scanner(System.in);

		int sayi = 0;
		int toplam = 0;
		int sayac = 0;

		while (sayac < 10 && toplam < 500) {

			System.out.println("Lutfen toplama eklemek icin bir tamsayi yazin ");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;

		}

		System.out.println("Bu kadar sayi yeter");
		System.out.println(sayac + " adet sayi girdin, toplami: " + toplam);
		scan.close();

	}
}
