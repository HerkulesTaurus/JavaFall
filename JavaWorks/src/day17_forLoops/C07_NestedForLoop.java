package day17_forLoops;

import java.util.Iterator;

public class C07_NestedForLoop {

	public static void main(String[] args) {
		
		// 1 den 4 e kadar sayilari yan yana aralarýnda býr bosluk býrakarak yazdýrýn.

		
		
	for (int satir = 1; satir <=6; satir++) {
		
			
		for (int i = 1; i <=5; i++) { 		//inner forloop
			
		System.out.print(satir*i +" ");
		
    		}
		System.out.println(""); // alt satýra gecsýn dýye  //tamamý outer for loop
	 	}
	}
}