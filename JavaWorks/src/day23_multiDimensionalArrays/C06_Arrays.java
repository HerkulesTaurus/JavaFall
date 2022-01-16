package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {		
		// Verilen iki Array � b�rlestiren ve 
		// sonucu birlesikArray isminde bir array a kaydeden 
		// bir method olusturunuz 

		int arr1[]= {3,5,6,8};
		int arr2[]= {2,4,6,7,9};
		
		int birlesikArray[] = birlestir(arr1,arr2);
		Arrays.sort(birlesikArray); // s�ral� yazd�rmas� �c�n 
		System.out.println(Arrays.toString(birlesikArray));//[3, 5, 0, 0, 0]		
	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArray[] = new int[arr1.length+arr2.length];  
		
		for (int i = 0; i <arr1.length; i++) { //1. array �n elemanlar�n� birlesik array a atad�k
			
			birlesikArray[i]=arr1[i];
			
		}
		
		for (int i = 0; i < arr2.length; i++) { //2.array in elemanlar�n� alacag�z
			
			birlesikArray[i+arr1.length]=arr2[i];
		}
		
		return birlesikArray;
		
		
		
		
		
	}

}
