package day25_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Sort {

	public static void main(String[] args) {
			
		List<String> isimler = new ArrayList<>();
		
		isimler.add("Kutlu");
		isimler.add("Emrah");
		isimler.add("Ferhat");

		System.out.println(isimler);
		
		Collections.sort(isimler);      // [Kutlu, Emrah, Ferhat]
		
		//sýralama yapmak ýcýn collection class ýný kullanýyoruz 
		
		System.out.println(isimler);    // [Emrah, Ferhat, Kutlu]  naturel order
		
		isimler.add("filiz"); //filiz araya girmez sýralamada cunku f-F den aský degerý kucuktur 
							  //dolayýsýyla sýralamada en sonr ayer alýr 
		
		Collections.sort(isimler);
		
		System.out.println(isimler);
	}

}
