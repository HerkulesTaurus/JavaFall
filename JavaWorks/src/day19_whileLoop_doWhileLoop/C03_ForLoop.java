package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin
		// ve bu sayinin rakamlari toplamini yazdirin   //bir oncek� sorunun for Loop ile cozumu
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tam sayi giriniz : ");
		int sayi = scan.nextInt(); //data turu int

		int rakamlarToplami = 0;
		int rakam = 0;
		
		String sayiStr=""+sayi; // data turu string  
		//burada bas�na "" eklersek intiger i string e cevirir 
		// intiger olarak ver�len b�r say�n�n basamak say�s�n� bulmak 
		// �stersek k�sa yoldan sayiyi string e cevirip str.lenght metodunu kullanabiliriz
			for (int i = 0; i < sayiStr.length(); i++) {
				 rakam = sayi % 10;
				 rakamlarToplami += rakam;
				 sayi /= 10;
		}
		
		System.out.println("girdiginiz sayinin rakamlar toplami :" + rakamlarToplami);
	}

}
