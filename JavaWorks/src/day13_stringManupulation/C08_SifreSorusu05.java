package day13_stringManupulation;

import java.util.Scanner;

public class C08_SifreSorusu05 {

public static void main(String[] args) {
	
	// Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lutfen 4 harfli bir kelime giriniz ");
	
	String kelime = scan.next();
	
	if (kelime.length()!=4) {
		
		System.out.println(" 4 harfli bir kelime girmelisiniz ");
		
	} else {
		
		String tersKelime =  kelime.substring(3,4);
				
			   tersKelime += kelime.substring(2,3);	
		
		       tersKelime += kelime.substring(1,2);
		
		       tersKelime += kelime.substring(0,1);
		
		System.out.println("girdiginiz kelimenin tersten yazilisi : " + tersKelime);
	}
	
		scan.close();	
	
	}
}
