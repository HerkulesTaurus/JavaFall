package day17_forLoops;

import java.util.Scanner;

public class C03_ForLoop_Interview {

	public static void main(String[] args) {
	
		// soru 7 Intervıew Questıon: Kullanıcıdan bır strıng ısteyın 
		// ve String ı tersine ceviren bir method yazın
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen tersten yazdırmak icin bir yazi girin...");
		
		String str=scan.nextLine();
		
		tersineCevir(str);
		
		System.out.println(tersineCevir(str));
			
		scan.close();
		
		}

		public static String tersineCevir(String str) {
		
		String tersStr="";
		
		for (int i = str.length()-1; i >=0; i--) {
			 
			tersStr+=str.substring(i, i+1);
			
		}
				
		return tersStr;
		
	}

}


