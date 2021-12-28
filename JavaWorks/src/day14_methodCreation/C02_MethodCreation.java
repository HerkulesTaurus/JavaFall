package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
	
	public static void main(String[] args) {
		
		// Kullanicidan 2 sayi isteyin
		// sayilarin karelerini ve kuplerini toplayip yazdiran 2 ayri method yazin
		// kullaniciya s sorun 
		// 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi girin \nilk sayidan sonra enter e basiniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Girilen sayilarin kareler toplamini istiyorsaniz 2 "
				+ "\nkupler toplamini istiyorsaniz 3 e basin");
		
		int secim = scan.nextInt();

		switch(secim) {
		
		case 2:
			kareTopla(sayi1,sayi2);
			break;
			
		case 3:
			kupTopla(sayi1,sayi2);
			break;
			
		default :
			
			System.out.println("Lutfen istenen tercihlerden birini yapin");
		}
		
		//method 4 adimda olusturulur.
			
		/* Bir method u 4 adimda olusturulur;
		 1-method'u java ya olusturtabilmek icin method call yapiyoruz.
		 2-arguman ihtiyaci var mi belirleyelim
		 3-Javadan yardim alarak method u olusturalim
		 4-Axcess modifier ve return type e karar ver.
		 bundan sonra method un yapacagi islevi gerceklestirecek kodlarimizi yazariz
		 */
		scan.close();
	}

	public static void kupTopla(double sayi1, double sayi2) {

		double kuplerToplami=sayi1*sayi1*sayi1+sayi2*sayi2*sayi2 ;		

		System.out.println("Girilen sayilarin kupleri toplami ="+ kuplerToplami);
		
	}

	public static void kareTopla(double sayi3, double sayi4) { 
		// burdaki sayi3,sayi4 sayi1,sayi2 olarak da yazilabilirdi secenek olarak 
		// bu bir zorunluluk degil imkandir, istedimizi secebiliriz
		// Bizim arguman isimlerimizle parametre isimlerimiz ayni olmak zorunda degil
		// Java isimlere degil degerlere bakar 
		
		
		double karelerToplami=sayi3*sayi3+sayi4*sayi4;
		
		System.out.println("Girilen sayilarin kareleri toplami ="+ karelerToplami);
			
		
	}

}
