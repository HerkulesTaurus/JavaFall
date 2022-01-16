package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MultiDimensionalArrays {

	public static void main(String[] args) {
	// MultiDimensional Array ler ic ice konulmus array lar demektir.
	// Array olusturmak icin iki yontemimiz vardý
	// 1. yontem once declare edip sonra deger atama

	int arr[][] = new int[3][2];    // outer array i 3 elemanlý yaný: outer array in eleman sayýsý 3
									// her býr inner array ise 2 elemanlý olan MDArray olusturur.. parantezlerin
									// icindeki ikili eleman sayýsý

	// Bu yontemle olusturdugumuz inner array lerin hepsi ayni boyutta olmalýdýr.

	System.out.println(Arrays.toString(arr));    // direk outer array i yazdýrmak istedigimizde
												 // icindeki elemanlar non-primitive oldugundan
												 // referanslarý yazdýrýlýr.
												 // [[I@58ceff1, [I@7c30a502, [I@49e4cb85]

	System.out.println(Arrays.toString(arr[1])); // [0, 0]
	System.out.println(Arrays.toString(arr[2])); // [0, 0]

	System.out.println(Arrays.deepToString(arr)); // [[0, 0], [0, 0], [0, 0]] tamamýný yazdýrmak ýcýn bu code kullanýlýr 
	
	arr[0][1]=5;
	arr[1][0]=2;
	arr[2][1]=3;
	
	System.out.println(Arrays.deepToString(arr)); //[[0, 5], [2, 0], [0, 3]]
	
	// Array olusturmak icin iki yontemimiz vardý
	// 2. yontem hem declare edip hem de deger atama 
	
	int arr2[][]= {{0},{1,2,3},{6,7,8,9} };
	
	System.out.println(Arrays.deepToString(arr2)); //[[0], [1, 2, 3], [6, 7, 8, 9]]
	
	System.out.println(Arrays.toString(arr2[1])); //[1, 2, 3]
	
	System.out.println(arr2[2][1]); //7
	}

}
