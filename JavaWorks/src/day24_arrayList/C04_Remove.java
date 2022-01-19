package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {
		
		List<String> harfler = new ArrayList<>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");

		System.out.println(harfler);  //[A, Z, F, D]
		
		harfler.remove(1); //z yi kaldýrýyor gerý dondermeyebýlýr 
		
		//ustteki yapýlan islemi gormek icin syso yapiliyor		
		//System.out.println(harfler.remove(1));   //Z -->bu satýr gidip 1 index deki elemaný remove eder.
		// ve remove ettigi elamaný getirir gosterýr.
		//ýkýtane remove method var býrý ýndex gýrýlýyor býrýnde de element yazýlýyor 
		
		//listenýn kalanýný gormek ýstersenýz listeyi yazdýrabýlýrsýnýz
		System.out.println(harfler);     //[A, F, D]
		
		System.out.println(harfler.remove(2));
		
		System.out.println(harfler); //[A, F]
	
		System.out.println(harfler.remove("F"));//F yi remove eder ve true doner
		
		System.out.println(harfler.remove("B")); //listede B olmadýgý ýcýn remove yapamaz
												 // gorevi yapamadýgý ýcýn false doner
		
		
		System.out.println(harfler);//[A]
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		System.out.println(harfler); //[A, A, Z, F]
		
		System.out.println(harfler.remove("A")); // true
		
		System.out.println(harfler);//[A, Z, F]
		harfler.add("A");
		
		System.out.println(harfler);//[A, Z, F, A]
		
        harfler.removeAll(harfler); // hepsini sildi
        
        System.out.println(harfler);//[]
        
        
        harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		List<String> silinecekHarfler=new ArrayList<>();
		harfler.add("A");
		harfler.add("C");
		harfler.add("F");
		
		System.out.println(harfler);
		System.out.println(silinecekHarfler);
        
		System.out.println(harfler.removeAll(silinecekHarfler));
        System.out.println(harfler);
        System.out.println(silinecekHarfler);
        
        //eger listemiz integer lardan olusuyorsa
        //java remove (index) ve remove (object) methodlarý karýsmasýn dýye 
        //girilen sayiyi index kabul eder
        
	}

}
