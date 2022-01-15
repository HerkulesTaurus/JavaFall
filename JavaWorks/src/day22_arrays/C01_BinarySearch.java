package day22_arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {

		String isimler[] = {"Hacer", "ainagul","Emine","Murat", "Kutlu"};

		//isimler array inde Murat ismi varm�???

		//array da arama yapmadan once s�ralama yapmal�y�z
		
		Arrays.sort(isimler);
		//arrayss class'i ile sort yaptigimizda array'imiz kalici olarak degisir.
		
		System.out.println(Arrays.toString(isimler)); //[Emine, Hacer, Kutlu, Murat, ainagul]
		//sort method u elementleri natural order'a gore s�ralar (dogal s�ras�na gore)
			
		isimler[4]="Ainagul";
	
		System.out.println(Arrays.toString(isimler));
		
		Arrays.sort(isimler);
		
		System.out.println(Arrays.toString(isimler));//[Ainagul, Emine, Hacer, Kutlu, Murat]
				
		System.out.println(Arrays.binarySearch(isimler, "Murat")); //4 index

		System.out.println(Arrays.binarySearch(isimler, "Mehmet")); //-5 
		
// !!!!aranan kelime varsa indeks yoksa olmas� gerekt�g� yerde "-" li sayi ancak index g�b� 0 dan baslamaz 1 den baslar saymaya
		
		System.out.println(Arrays.binarySearch(isimler, "Tuba")); //-6 

		System.out.println(Arrays.binarySearch(isimler, "Kursat")); //-4 

	}

}
