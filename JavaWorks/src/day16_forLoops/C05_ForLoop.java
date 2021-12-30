package day16_forLoops;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		
		// Soru-4: kullanýcýdan 100 den kucuk býr tamsayý ýsteyýn.
		// 1den baslayarak gýrýlen sayýya kadar (sayý dahýl) 3'un katý olan sayýlarý yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yuzden kucuk býr sayý giriniz...");
		
		double num = scan.nextDouble();
		
		int sayi = (int) num ; //manuel cast yaptýk
		
		
		
		// sayi negatifse veya tam sayý degýlse uyarý verelým
								
				if (num<0) {
					
					System.out.println("negatif sayi giremezsiniz");
					
				} else if (sayi!=num){
					
					System.out.println("Lutfen tam sayý giriniz");
					
				} else if (sayi>100){
					
					System.out.println("Lutfen 100 den kucuk sayý giriniz");
				
				}else {
			
					for (int i = 1; i <= num; i++) { // sorunun cevabý burdan sonrasý sadece
						
						if (i%3==0) { //modulus 3 e bolunebýlen
							
							System.out.print(i+ " ");
					
				}				
			}	
		}
	}		
}


