package day45_Collections;

import java.util.LinkedList;

public class C01_LinkedList {

	public static void main(String[] args) {


		LinkedList<Integer> II = new LinkedList<>();
	
		System.out.println(II); //[]
		
		II.add(5);
		II.add(7);
	
		System.out.println(II); //[5, 7]
		
		// linked list ın ıkı tane ıntreface parent ı vardır
		// birisi list oteki de Deque ==> Queue
		
		II.add(0, 10); // List interface den gelen ozellıkle basa eleman ekleme 
		System.out.println(II);// [10, 5, 7]
		II.addFirst(3); // gueue interface den gelen ozellıkle basa eleman ekleme 
		System.out.println(II);//[3, 10, 5, 7] 
		
		
		LinkedList<Integer> II2 = new LinkedList<>();
		
		II2.addAll(II);
		
		System.out.println(II2); //[3, 10, 5, 7]
		
		II2.addAll(2, II);
		
		System.out.println(II2); //[3, 10, 3, 10, 5, 7, 5, 7]

		
	}

}
