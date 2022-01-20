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
		
		//s�ralama yapmak �c�n collection class �n� kullan�yoruz 
		
		System.out.println(isimler);    // [Emrah, Ferhat, Kutlu]  naturel order
		
		isimler.add("filiz"); //filiz araya girmez s�ralamada cunku f-F den ask� deger� kucuktur 
							  //dolay�s�yla s�ralamada en sonr ayer al�r 
		
		Collections.sort(isimler);
		
		System.out.println(isimler);
	}

}
