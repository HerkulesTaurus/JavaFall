package day16_forLoops;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		
		// Soru-4: kullan�c�dan 100 den kucuk b�r tamsay� �stey�n.
		// 1den baslayarak g�r�len say�ya kadar (say� dah�l) 3'un kat� olan say�lar� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yuzden kucuk b�r say� giriniz...");
		
		double num = scan.nextDouble();
		
		int sayi = (int) num ; //manuel cast yapt�k
		
		
		
		// sayi negatifse veya tam say� deg�lse uyar� verel�m
								
				if (num<0) {
					
					System.out.println("negatif sayi giremezsiniz");
					
				} else if (sayi!=num){
					
					System.out.println("Lutfen tam say� giriniz");
					
				} else if (sayi>100){
					
					System.out.println("Lutfen 100 den kucuk say� giriniz");
				
				}else {
			
					for (int i = 1; i <= num; i++) { // sorunun cevab� burdan sonras� sadece
						
						if (i%3==0) { //modulus 3 e boluneb�len
							
							System.out.print(i+ " ");
					
				}				
			}	
		}
	}		
}


