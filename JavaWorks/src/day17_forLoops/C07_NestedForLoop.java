package day17_forLoops;

import java.util.Iterator;

public class C07_NestedForLoop {

	public static void main(String[] args) {
		
		// 1 den 4 e kadar sayilari yan yana aralar�nda b�r bosluk b�rakarak yazd�r�n.

		
		
	for (int satir = 1; satir <=6; satir++) {
		
			
		for (int i = 1; i <=5; i++) { 		//inner forloop
			
		System.out.print(satir*i +" ");
		
    		}
		System.out.println(""); // alt sat�ra gecs�n d�ye  //tamam� outer for loop
	 	}
	}
}