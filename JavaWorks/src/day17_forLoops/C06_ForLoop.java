package day17_forLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		
		// Soru 11: Interview Questions: Kullan�c�dan 10 dan kucuk b�r tamsay� isteyin,
		//ve girilen say�n�n faktoryel �n� bulun.(5!=5*4*3*2*1)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Faktoryel hesaplamak icin 10 dan kucuk b�r tam sayi giriniz...");
		
		int sayi = scan.nextInt();

		System.out.print(sayi + "!=");
		

		int faktoryel=1;
		
		for (int i = sayi; i > 0; i--) {
			
			faktoryel*=i;
			System.out.print(i+"*");
		}	
			System.out.println("1=" + faktoryel); //println yapt�k bunda gecerl� deg�l bundan sonrak� b�r alt sat�ra gecer
			
		
	}

}
