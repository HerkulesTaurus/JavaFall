package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		
		
		Queue<String> kuyruk = new LinkedList<>();
		
		kuyruk.add("Lutfu");
		kuyruk.add("Mustafa");
		kuyruk.add("Ridvan");
		
		System.out.println(kuyruk);//[Lutfu, Mustafa, Ridvan]

		kuyruk.remove();
		System.out.println(kuyruk);// [Mustafa, Ridvan]


		kuyruk.remove();
		System.out.println(kuyruk); //[Ridvan]     kuyruk tan sile sile gidiyor 
		
		
		kuyruk.add("Ridvan");
		
		System.out.println(kuyruk);//[Ridvan, Ridvan]

		kuyruk.add(null);
		kuyruk.add(null);
		kuyruk.add(null);

		System.out.println(kuyruk);//[Ridvan, Ridvan, null, null, null]

  
	}

}
