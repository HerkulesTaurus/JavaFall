package day17_forLoops;

import java.util.Scanner;

public class C04_Palindrome_OZEL {

	public static void main(String[] args) {
		
		// soru 7 Interview Question: Kullanicidan bir string isteyin 
		// ve String in PALİNDROME olup olmadigini kontrol edin 
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen tersten yazd�rmak icin bir yazi girin...");
		
		String str=scan.nextLine();
					
		if (str.equals(tersineCevir(str))) {
			
			System.out.println("Girdiginiz String palindrome");
			
		}else {
			
			System.out.println("Girdiginiz String palindrome degil");
		}
	}
		public static String tersineCevir(String str) {
		
		String tersStr="";
		
		for (int i = str.length()-1; i >=0; i--) {
			 
			tersStr+=str.substring(i, i+1);
			
		}
				
		return tersStr;
		
	}

}


