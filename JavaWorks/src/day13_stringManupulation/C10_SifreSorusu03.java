package day13_stringManupulation;

import java.util.Scanner;

public class C10_SifreSorusu03 {

public static void main(String[] args) {		
		 //	Soru 3) Kullanicidan isim isteyin. Eger 
		 //	- isim  a harfi iceriyorsa Girdiginiz isim a harfi iceriyor
		 //	- isim Z harfi iceriyorsa Girdiginiz isim Z harfi iceriyor
		 //	- isim a ve  Z harfi iceriyorsa Girdiginiz isim a ve Z harfi iceriyor
		 //	- ikisi de yoksa Girdiginiz isim a veya Z harfi icermiyor yazdirin	
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz ");
		
		String isim = scan.nextLine();
		
		if (isim.contains("a") && isim.contains("Z")) {
			
			System.out.println("Girdiginiz isim a ve Z iceriyor");
			
		}else if(isim.contains("a")){
			
			System.out.println("Girdiginiz isim a iceriyor");
			
		}else if(isim.contains("Z")) {
			
			System.out.println("Girdiginiz isim en az bir buyuk karakter �cermel� ");
			
		}else{
			
			System.out.println("Girdiginiz isim a veya Z icermiyor");
			
		} scan.close();
	}
}


