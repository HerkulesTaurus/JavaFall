package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {		
		// Verilen iki Array ý býrlestiren ve 
		// sonucu birlesikArray isminde bir array a kaydeden 
		// bir method olusturunuz 

		int arr1[]= {3,5,6,8};
		int arr2[]= {2,4,6,7,9};
		
		int birlesikArray[] = birlestir(arr1,arr2);
		Arrays.sort(birlesikArray); // sýralý yazdýrmasý ýcýn 
		System.out.println(Arrays.toString(birlesikArray));//[3, 5, 0, 0, 0]		
	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArray[] = new int[arr1.length+arr2.length];  
		
		for (int i = 0; i <arr1.length; i++) { //1. array ýn elemanlarýný birlesik array a atadýk
			
			birlesikArray[i]=arr1[i];
			
		}
		
		for (int i = 0; i < arr2.length; i++) { //2.array in elemanlarýný alacagýz
			
			birlesikArray[i+arr1.length]=arr2[i];
		}
		
		return birlesikArray;
		
		
		
		
		
	}

}
