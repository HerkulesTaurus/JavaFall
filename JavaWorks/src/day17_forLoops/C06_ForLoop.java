package day17_forLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		
		// Soru 11: Interview Questions: Kullanýcýdan 10 dan kucuk býr tamsayý isteyin,
		//ve girilen sayýnýn faktoryel ýný bulun.(5!=5*4*3*2*1)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Faktoryel hesaplamak icin 10 dan kucuk býr tam sayi giriniz...");
		
		int sayi = scan.nextInt();

		System.out.print(sayi + "!=");
		

		int faktoryel=1;
		
		for (int i = sayi; i > 0; i--) {
			
			faktoryel*=i;
			System.out.print(i+"*");
		}	
			System.out.println("1=" + faktoryel); //println yaptýk bunda gecerlý degýl bundan sonraký býr alt satýra gecer
			
		
	}

}
