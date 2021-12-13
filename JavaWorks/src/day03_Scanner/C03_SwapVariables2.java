package day03_Scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
	
				int sayi1=15;
				int sayi2=20;
								
				System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
			
				sayi1 = sayi1 - sayi2;	

				// ikinci adim fark ile sayi2'yi toplayip
				// sayi2 ye assign ediyorum 
				
				sayi2 = sayi1 + sayi2;
				
				// 3. adim olarak sayi1'e sayi2 - fark atiyorum
				
				sayi1 = sayi2 - sayi1;				
				
				System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2=" + sayi2);			
				
			}

		}
