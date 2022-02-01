package day45_Collections;

import java.util.LinkedList;

public class C03_LinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> II = new LinkedList<>();

		System.out.println(II); // []

		II.add(5);
		II.add(7);

		System.out.println(II); // [5, 7]

		// II.element();

		// II.poll();

		System.out.println(II.peek()); // silmeden ilk elemanı bana getırır ==>5
		System.out.println(II.peekFirst()); // silmeden ilk elemanı bana getırır ==>5

		LinkedList<Integer> II2 = new LinkedList<>();

		System.out.println(II2.peekFirst()); // ==>null ilk eleaman bossa null ==>queue
		System.out.println(II2.peek()); // ==>null ==>queue

		System.out.println(II.element()); // 5
		// System.out.println(II2.element()); // java.util.NoSuchElementException

		System.out.println(II.poll());// 5
		System.out.println(II);// [7]

		System.out.println(II.poll());// 7
		System.out.println(II);// []

		System.out.println(II.poll());// null

		System.out.println(II.hashCode()); // java nın verdıgı hasCode==>1 olarak doner
		System.out.println(II2.hashCode());// java nın verdıgı hasCode==>1 olarak doner
		
		II2.add(7);
		System.out.println(II2.hashCode()); // java nın verdıgı hasCode==>38 olarak doner
		
		System.out.println(II2.offer(10)); //true
		
		System.out.println(II2);//[7, 10]
		
		II2.push(2); // addfirst() ile aynı 
	 
		
	}

}
