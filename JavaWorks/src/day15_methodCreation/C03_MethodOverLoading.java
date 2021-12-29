package day15_methodCreation;

public class C03_MethodOverLoading {

	public static void main(String[] args) {

		// Java da ayni isimde birden fazla method olurmu?
		// Cevap: EVET
		
		// Ayn� isim de b�rden fazla method olursa Java hang�s�n� cal�s�t�racag�na nas� karar ver�r 
		// Cevap:isim ayn� olan methodlarda oncel�kle parametre say�s�na bakar sonra da 
		// sonra da parametre ve arguman say�s� es�t olanlardan arguman data turler� �le 
		// parametre data turler� aras�ndak� uyuma bakar. tamamen uyusan varsa onu kullan�r 
		// tamamen uyusan yoksa kapsayan varm� bakar ve onu kullan�r .
		// B�rden fazla secenek oldugunda Java her zaman en opt�mum olan� terc�h eder  
		
		// overloadİng asİrİyukleme demek 
		// Bir class da ismi ayni fakat parametreleri farkli olan methodlar olusturursak buna overloading denir 
		topla(2,5);
		
		// method imzasi 3 bilesenden olusur (method s�gnatura) method ismi, siralamasi ve parametresi nden olusur
		// method �sm� deg�smez d�ger �k�s� deg�serek �mzas� deg�st�rmeye cal�s�lab�l�r 
		// axcess mod�f�er, return type s�gnature deg�st�rmez
	}	
	
	private static void topla(int sayi1, int sayi2, int sayi3, int  sayi4) {
		System.out.println("uc say�n�n toplam�:"+ (sayi1+sayi2+sayi3+sayi4));					
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("uc say�n�n toplam�:"+ (sayi1+sayi2+sayi3));		
	}
	
	private static void topla(int sayi1, int sayi2) {
		System.out.println("iki sayinin toplami :ii "+ sayi1 + sayi2);		
	}

	private static void topla(int sayi1, double sayi2) {
		System.out.println("iki sayinin toplami :id "+ sayi1 + sayi2);		
	}

	private static void topla(double sayi1, int sayi2) {
		System.out.println("iki sayinin toplami :di "+ sayi1 + sayi2);		
	}

	private static void topla(double sayi1, double sayi2) {
		System.out.println("iki sayinin toplami :dd "+ sayi1 + sayi2);		
			
}
}

