package day21_scope_arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		
		// Array ýn elemanlarýný yazdýrmak ýstersek loop ýle yazdýrabýlýrz 
		int arr[] = {2, 4, 5, 6, 78, 89};
		// tum elementleri yazdirabiliriz
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + "  "); // array ýn kendýsý degýl elementlerý bunlar 			
		}
		
		System.out.println(" ");
		// ya da Arrays class'idan yardim alarak direk Array olarak yazdriabiliriz
		System.out.println(Arrays.toString(arr));
	
	}
}
