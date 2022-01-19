package day24_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_List {

	public static void main(String[] args) {
		
		// Verilen bir array'den istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin
				
				int arr[]= {3,4,5,6,3,5,5,6,5,7,5,8,5};
				int silinecekEleman=5;
				
				List<Integer> gecici = new ArrayList<>();
				
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] !=silinecekEleman) {
						gecici.add(arr[i]);						
					}
				}
				// sonucu list olarak istiyorsak 
				System.out.println("List olarak :"+ gecici);	//list olarak istenmeyen eleman haric tum elemanlarý goruruz
				
				//sonucu array olarak istiyorsak 
				//listedekileri yeni array a ekleyebiliriz
				
				int yeniArray[] = new int[gecici.size()];
				
				for (int i = 0; i < yeniArray.length; i++) {
//ilk listeden olusan lýsteyý gecici listede tuttuk ordan yeni listeye aktarýyoruz					
					yeniArray[i]=gecici.get(i); 
				}
				//Sonucu Array olarak istiyorsak  
				System.out.println("Array olarak : "+Arrays.toString(yeniArray));
	}
}
