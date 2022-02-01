package day44_iterator_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {

	public static void main(String[] args, int each) {


		List<Integer> liste = new ArrayList<>();
		 
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);

		System.out.println(liste);
		
		// index kullanamdan tum elemanaları 3 eklenmıs olarak yazdırın  
		
		for (Integer integer : liste) {
			
			System.out.print(each + 3 + " ");
		}
		System.out.println(" ");
		
		System.out.println(liste);
		
		for(Integer each1 : liste) {
			each1+=3;
			System.out.println(each1 + " ");
		}
		System.out.println(" ");
		System.out.println(liste);
	}
		// for each le looğ ındex kullanamdan tum elementlere ulasabılıyoruz ama kalıcı degısıklık yapamıyoruz
}
