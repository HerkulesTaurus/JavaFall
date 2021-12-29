package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {
	
	public static void main(String[] args) {
		
		// kullanicidan ismini ve soyismini isteyin 
		// iki farkli method olusturun methodlardan biri girilen kelimeleri,
		// ilk harf buyuk digerleri kucuk olacak sekilde birlestirsin,
		// ikinci method isim ve soyismin ilk harfleri buyuk harf,
		// kalan harfler '*' olacak sekilde birlestirsin,		
		// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun 
		// ve programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin.	
		
		Scanner scan=new Scanner(System.in);		
		
		System.out.println("Lutfen isim ve soyisminizi giriniz \nisimden sonra enter'e basin");	
		
		String isim=scan.next();
		
		String soyisim=scan.next();		
		
		System.out.println("Isminizin acik sekilde yazilmasini istiyorsaniz 1"
			           	 + "\nIlk harf haric gizli yazilmasini istiyorsaniz 2'ye basin");	
		
		int tercih=scan.nextInt();		
		
		// bu satira kadar kullanicidan ismini, soyismini ve tercihini aldim.
		
		String birlesmisIsim=null; // Emrah Saglam, E**** S***** ikisinden biri olacak 	
		
		if(tercih==1) {
			
			birlesmisIsim=acikIsim(isim,soyisim);	
			
		}else if(tercih==2) {
			
			birlesmisIsim=isimGizle(isim,soyisim);	
			
		}else {
			
			System.out.println("Lutfen 1 veya 2 secin");
			
}
	// bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli olarak 
	// kaydedildi.		
		
		System.out.println("Kullanicinin tercihi :"+ birlesmisIsim);
		scan.close();
}
	
	public static String isimGizle(String isim, String soyisim) {// method un yazdirma islemi yok dondurecegi icin void sil string yaz 
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");	
		
		return isim +" "+ soyisim ;		
	
}	
	
	public static String acikIsim(String isim, String soyisim) {
		//yazma olmadigi ve dondurme yapacagi icin void kaldirilir ve String yazilir.			
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
	    soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();	 
	    
	    return isim+ " " +soyisim;		
	 
	}
}   
     