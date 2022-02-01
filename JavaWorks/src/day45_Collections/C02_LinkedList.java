package day45_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {
		
		List<Integer> II = new LinkedList<>();
		
		II.add(5);
		II.add(7);

		System.out.println(II); //[5, 7]
		
		II.add(9); // data turunu List sectıgımız ıcın sadece List interfaceindeki methodları kullanabılıriz
				   // LinkLİst class ında overright ettigimiz icin 
				   // List interface olmasına ragmen List method larını kullanabıldık
				   
		Queue<Integer> II2 = new LinkedList<>();
		
		II2.add(5);
		II2.add(7);
		II2.clear(); // data turu Queue secilince Queue interface inden gelen methodlar kullanabildik
 		
		Deque <Integer> II3 = new LinkedList<>();
		
		II3.add(5);
		II3.add(7);
		II3.addLast(20);   // data turu Queue secilince Queue interface inden gelen methodlar kullanabildik
	
	
	
	
	}

}
