package day16_forLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		
		// Soru-5: kullan�c�dan 100 den kucuk b�r tamsay� �stey�n.
		
		// 1 den baslayarak g�r�len say�ya kadar 3'un ve 5 in kat� olan say�lar� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yuzden kucuk b�r say� giriniz...");
		
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
		
			if (i%3==0 || i%5==0) {
		
				System.out.print(i + " ");

			}

		}
			
	}
}