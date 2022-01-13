package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {

		//Soru 2: Verilen bir array�in tum elemanlarini toplayan bir program yazalim.

		int arr[] = {3,5,8,6,2,4};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
		} 
		
		System.out.println("Elementlerin Toplami:" + toplam);
		// soru 3 : Array �n tum elemanlar�n� once kucukten buyuge,
		// sonra buyukten kucuge yazd�r�n
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//kucukten buyuge s�ralama 

		// buyukten kucuge yazd�rmak �c�n 
		// ya for loop ile elemanlar� ters s�rada yazd�r�r�z 
		
		for (int i = arr.length-1; i>=0; i--) {
			
			System.out.print(arr[i]+" ");
			
		}
		//array yapmak istersen�z ayn� uzunlukta b�r array olusturup
		//elemanlar� ters s�rada yen� array a tas�yab�l�r�z
		System.out.println(" ");
		
		int tersArray[]=new int[arr.length];
		
		for (int i = 0; i < tersArray.length; i++) {
			
			tersArray[i]=arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(tersArray));
		
	}

}
