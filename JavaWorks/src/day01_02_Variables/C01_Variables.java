package day01_02_Variables;

import java.util.Scanner;

@SuppressWarnings("unused")
public class C01_Variables {

	public static void main(String[] args) {
		
		// variable olusturmak ve deger atamak farklı islemlerdir 
		// istersek variable olusturma ve deger atmayı tek satirda yapabiliriz
		
		/*String sozlu ifadeleri yazmak once kullanılır */
		
		String ogrenciIsim = "Celal";
	
		// Celal yazdırır
		
		/*syso yaz ve ctrl space bas  system.out.print cıksın*/
		
		System.out.println(ogrenciIsim);
		
		//istersek de once olusturur, istedigimiz zaman da deger atayabiliriz
		
		int sayi;
		
		sayi=10;
		
		System.out.println(sayi); // 10 yazdırır
		
		// biz daha once olusturulmus ve deger ataması yapılmas  bir degıskene 
		// yenı deger atayabılıriz
		// bu durumda java variable'in eskı degerını silip yenı degerını atar 
		
		sayi=25;
		
		System.out.println(sayi); // 25 yazdırır
	
		ogrenciIsim="Mustafa";
		
		System.out.println(ogrenciIsim); // Mustafa yazdırır
			
	}
 }
