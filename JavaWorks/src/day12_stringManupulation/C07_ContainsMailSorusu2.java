 package day12_stringManupulation;

import java.util.Scanner;

public class C07_ContainsMailSorusu2 {

public static void main(String[] args) {
		
		// Soru 2) Kullanicidan bir cumle isteyin.
		// Cumle buyuk kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
		// kucuk kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin, 
		// iki kelimeyi de icermiyorsa 
		// iki kelimeyi de iceriyorsa "kucuk mu buyukmu karar ver"
		// Cumle kucuk yada buyuk kelimesi icermiyor yazdirin.

	Scanner scan=new Scanner(System.in);
		
	System.out.println("Lutfen bir cumle giriniz");
		
	String cumle=scan.nextLine().toLowerCase();      
		
	if (cumle.contains("buyuk") && cumle.contains("kucuk")){  // en dar anlami icerene ilk bakilir
		
		System.out.println("kucuk mu buyuk mu karar ver");			
			
	} else if(cumle.contains("kucuk")){
			
		System.out.println(cumle.toLowerCase());
			
	} else if (cumle.contains("buyuk")){
		
		System.out.println(cumle.toUpperCase());
		
	} else {
			
		System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor ");		
		}
	}
}




