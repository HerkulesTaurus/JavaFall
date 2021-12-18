package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C06_Ternary {

	public static void main(String[] args) {
		
		// Soru2 : verilen karakteri inceleyin (char da verilen)
		// kucuk harf ise consola Kucuk Harfi ,
		// buyuk harfse consola Buyuk Harfi
		// yoksa girdiginiz karakter harf degil yazdirin.
		
		char krk='&';
		
		//String sonuc = (krk>='a' && krk<='z') ? "kucuk harf" : (//sart yanlis  ise sonuc);
		
		String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (
				
					   (krk>='A' && krk<='Z') ? "Buyuk Harf" : "girilen karakter harf degil"
						   
						   );
					  
		System.out.println(sonuc);
	}

}
