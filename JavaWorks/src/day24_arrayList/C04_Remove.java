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
		
		harfler.remove(1); //z yi kald�r�yor ger� dondermeyeb�l�r 
		
		//ustteki yap�lan islemi gormek icin syso yapiliyor		
		//System.out.println(harfler.remove(1));   //Z -->bu sat�r gidip 1 index deki eleman� remove eder.
		// ve remove ettigi elaman� getirir goster�r.
		//�k�tane remove method var b�r� �ndex g�r�l�yor b�r�nde de element yaz�l�yor 
		
		//listen�n kalan�n� gormek �stersen�z listeyi yazd�rab�l�rs�n�z
		System.out.println(harfler);     //[A, F, D]
		
		System.out.println(harfler.remove(2));
		
		System.out.println(harfler); //[A, F]
	
		System.out.println(harfler.remove("F"));//F yi remove eder ve true doner
		
		System.out.println(harfler.remove("B")); //listede B olmad�g� �c�n remove yapamaz
												 // gorevi yapamad�g� �c�n false doner
		
		
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
        //java remove (index) ve remove (object) methodlar� kar�smas�n d�ye 
        //girilen sayiyi index kabul eder
        
	}

}
