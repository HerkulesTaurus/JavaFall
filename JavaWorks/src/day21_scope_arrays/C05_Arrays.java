package day21_scope_arrays;

import java.util.Arrays;

public class C05_Arrays {

	public static void main(String[] args) {
		// Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini 
		// bir soldaki konuma tasiyacak bir program yazin. 
		// Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
		
		int arr[] = {1,2,3,4,5,6,8,90}; //once 1 gecýcý býr kovaya alýndý hepsý bir sola kaydý
		
		int kova=arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			
			arr[i]=arr[i+1]; // bir assignment varsa sol= variable, sag=deger hesap yapýlýr 
		}
		
		arr[arr.length-1]=kova; // son elementin index i, o elementýn yerýne 1 i koyar
		
		System.out.println(Arrays.toString(arr));
	}

}
