package day44_iterator_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

	public static void main(String[] args) {

		List<String> liste = new ArrayList<>();
		
		liste.add("Ali");
		liste.add("Veli");
		liste.add("Ayse");
		liste.add("Fatma");
		liste.add("Emrah");

		System.out.println(liste);

		ListIterator li1 = liste.listIterator();
		
		String temp = "";
		
		while (li1.hasNext()) {

			temp = (String) li1.next();

			li1.set(temp + "X");

		}
		
		System.out.println(liste);
	}
// iterator collectıon uyelerıyle anlam bulur 
}
