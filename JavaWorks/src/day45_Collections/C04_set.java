package day45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_set {

	public static void main(String[] args) {

		Set<Object> s1 = new HashSet<>(); // <Object> yazınca strıng ve ınt ın atası oldugu ıcın hepsını kabul eder  

		s1.add(4);
		s1.add(7);
		s1.add(11);
		
		System.out.println(s1);  // [4, 7, 11]
		
		s1.add("Java candır");
		
		System.out.println(s1);  // [4, 7, 11, Java candır]

		List<Object> liste = new ArrayList<>(); // 12. sıradakı set<Object> yaptıgımız ıcın tamamını kabulr edıyor.char strıng ınt 
		
		liste.add(5);
		
		liste.add("Java Super");
		
		liste.add('C');
		
		liste.add(true);
		
		liste.add(s1);
		
		System.out.println(liste); // [5, Java Super, C, true, [4, 7, 11, Java candır]]

	
	}

}
