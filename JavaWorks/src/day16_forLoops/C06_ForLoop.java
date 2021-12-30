package day16_forLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		
		// Soru-5: kullanýcýdan 100 den kucuk býr tamsayý ýsteyýn.
		
		// 1 den baslayarak gýrýlen sayýya kadar 3'un ve 5 in katý olan sayýlarý yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yuzden kucuk býr sayý giriniz...");
		
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
		
			if (i%3==0 || i%5==0) {
		
				System.out.print(i + " ");

			}

		}
			
	}
}