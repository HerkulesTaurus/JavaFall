package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {

		//Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

		int arr[] = {3,5,8,6,2,4};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
		} 
		
		System.out.println("Elementlerin Toplami:" + toplam);
		// soru 3 : Array ýn tum elemanlarýný once kucukten buyuge,
		// sonra buyukten kucuge yazdýrýn
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//kucukten buyuge sýralama 

		// buyukten kucuge yazdýrmak ýcýn 
		// ya for loop ile elemanlarý ters sýrada yazdýrýrýz 
		
		for (int i = arr.length-1; i>=0; i--) {
			
			System.out.print(arr[i]+" ");
			
		}
		//array yapmak istersenýz ayný uzunlukta býr array olusturup
		//elemanlarý ters sýrada yený array a tasýyabýlýrýz
		System.out.println(" ");
		
		int tersArray[]=new int[arr.length];
		
		for (int i = 0; i < tersArray.length; i++) {
			
			tersArray[i]=arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(tersArray));
		
	}

}
