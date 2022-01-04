package day18_nestedForLoop_WhileLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// kullan�c�dan 2 tam say� isteyin
		// ilk say�dan baslayarak, ikinci say�ya kadar ucer ucer yazd�r�n
		// (ikinci say� dahil olmak zorunda deg�l) 
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen aradaki sayilari yazdirmak icin iki tane tam say� g�r�nz");
	
		int sayi1 =scan.nextInt();
		
		int sayi2 = scan.nextInt();
		
		
		if (sayi1>sayi2) { // azalarak gidecek
		
			for (int i= sayi1; i>sayi2; i-=3) {
				
				System.out.println(i + " ");			
			}
				
			
		} else if (sayi1<sayi2) { //artarak

			for (int i = sayi1; i<=sayi2; i+=3) {
				
				System.out.println(i + " ");
			}
			
		} else {
			
			System.out.println("Girilen sayilar esit");
		}
		
		scan.close();
	}
}
