package day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {

		// verilen bir array de tekrar eden elementleri sadece birer tane yazarak
		// unique elementlerden olusan bir array haline getirelim.

		int arr[] = { 1, 2, 3, 4, 5, 3, 6, 2, 5, 3, 7, 4, 8, 5, 9, 1, 0, 3, 5, 20, 50, 99 };

		// 2,3,4,5,6,7,8,9,1,0 bu hale gelecek

		List<Integer> tekrarsiz = new ArrayList<>(); // *****************burasi list biciminde
		// listede yoksa ekle demek bu alttaki for dongusu
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsiz.contains(arr[i])) {

				tekrarsiz.add(arr[i]);

				// contains methodu true/false doner
				// varmý yok mu dýye bakar

			}
		}
		// !!!!!!!!!array da length vardi list de size var!!!!!!!

		System.out.println("tekrarsiz list : " + tekrarsiz); // *******************burasý array biciminde

		int tekrarsizArray[] = new int[tekrarsiz.size()]; // [0,0,0,0,0,0,0,0]

		for (int i = 0; i < tekrarsizArray.length; i++) {

			tekrarsizArray[i] = tekrarsiz.get(i);
		}
		System.out.println("tekrarsiz array : " + Arrays.toString(tekrarsizArray));
	}

}
