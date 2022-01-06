package day19_whileLoop_doWhileLoop;

public class C05_DoWhileLoop {

	public static void main(String[] args) {
		
		//Soru-2: 'm' harfinden baslayarak 'c' harfine kadar tum harflerý yazdýrýn.
		
		//*********************for loop ile**************
		
		for (char i = 'm'; i >'c'; i--) { // int yaparsak ASCII degerler devreye gýrer 
										  // char ile yaparsak o zaman harflerý alýr 
			
			System.out.print(i+"  ");
		}
		
		
		//*********************while loop ile**************
		System.out.println(" ");
		char krk='m';
		
		while(krk>'c') {
			System.out.print(krk +"  ");
			krk--;
	}
		//*********************do while loop ile**************
		System.out.println(" ");

		char harf='m';
		do {
			System.out.print(harf+ "  ");
			harf--;
		} while (harf>'c');
		
		
		
		
		
 }
}