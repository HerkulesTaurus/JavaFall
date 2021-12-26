package day13_stringManupulation;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {

		// kullanicidan bir cumle ve bir kelime alin 
		// verilen cumlenin verilen kelime (char squence) ile baslayip, baslamadigini
		// ve bitip bitmedigini yazidirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
			
		System.out.println("Lutfen bir kelime giriniz");
		
		String kelime=scan.nextLine();
		
		
		if (cumle.startsWith(kelime)) {
			
			System.out.println("girilen cumle" + kelime + "ile basliyor");
					
		} else {
			
			System.out.println("girilen cumle" + kelime + "ile baslamiyor");

		}
		
		
		if (cumle.endsWith(kelime)) {
			
			System.out.println("girilen cumle" + kelime + "ile bitiyor");
					
		} else {
			
			System.out.println("girilen cumle" + kelime + "ile bitmiyor");
			
			scan.close();
		}

	}
}


