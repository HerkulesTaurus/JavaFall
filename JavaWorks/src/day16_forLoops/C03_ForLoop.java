package day16_forLoops;

public class C03_ForLoop {

	public static void main(String[] args) {
 
		//soru 10 ile 30 aras�ndak� (10 ve 30 dah�l ) virgille ayn� sat�rda yazd�r�n.
		
		for (int i = 10; i <= 30 ; i++) {
			
			if (i==30) {
				
				System.out.print(i);
				
			} else {
				
				System.out.print(i+ ",");
			}
			
			
		}			//***************�k�nc� yontem****
		
		System.out.println(); // bos syso sadece alt sat�ra gecmek �c�n kullan�l�r 
		
		
		for (int i = 10; i <= 29 ; i++) {
	
			System.out.print(i+ ",");
			
			
		}
			System.out.print(30);
	}
}
