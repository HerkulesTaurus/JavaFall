package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MultiDimensionalArrays {

	public static void main(String[] args) {
	// MultiDimensional Array ler ic ice konulmus array lar demektir.
	// Array olusturmak icin iki yontemimiz vard�
	// 1. yontem once declare edip sonra deger atama

	int arr[][] = new int[3][2];    // outer array i 3 elemanl� yan�: outer array in eleman say�s� 3
									// her b�r inner array ise 2 elemanl� olan MDArray olusturur.. parantezlerin
									// icindeki ikili eleman say�s�

	// Bu yontemle olusturdugumuz inner array lerin hepsi ayni boyutta olmal�d�r.

	System.out.println(Arrays.toString(arr));    // direk outer array i yazd�rmak istedigimizde
												 // icindeki elemanlar non-primitive oldugundan
												 // referanslar� yazd�r�l�r.
												 // [[I@58ceff1, [I@7c30a502, [I@49e4cb85]

	System.out.println(Arrays.toString(arr[1])); // [0, 0]
	System.out.println(Arrays.toString(arr[2])); // [0, 0]

	System.out.println(Arrays.deepToString(arr)); // [[0, 0], [0, 0], [0, 0]] tamam�n� yazd�rmak �c�n bu code kullan�l�r 
	
	arr[0][1]=5;
	arr[1][0]=2;
	arr[2][1]=3;
	
	System.out.println(Arrays.deepToString(arr)); //[[0, 5], [2, 0], [0, 3]]
	
	// Array olusturmak icin iki yontemimiz vard�
	// 2. yontem hem declare edip hem de deger atama 
	
	int arr2[][]= {{0},{1,2,3},{6,7,8,9} };
	
	System.out.println(Arrays.deepToString(arr2)); //[[0], [1, 2, 3], [6, 7, 8, 9]]
	
	System.out.println(Arrays.toString(arr2[1])); //[1, 2, 3]
	
	System.out.println(arr2[2][1]); //7
	}

}
