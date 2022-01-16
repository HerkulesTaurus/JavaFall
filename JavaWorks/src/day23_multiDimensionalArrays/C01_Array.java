package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Iterator;

public class C01_Array {

	public static void main(String[] args) {
		// Verilen bir array dan istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array i yazdirin

		int arr[] = { 3, 4, 5, 6, 3, 5, 8, 3, 4, 9, 3, 5, 6, 7, 8, 9, 4, 45, 66, 7, 13};
		int silinecekEleman = 6;

		// array da yeni eleman ekleyemeyiz veya var olan elemanlari silemeyiz
		// cunku arrayin declare edilen uzunlugu DEGiSMEZ

		// bu soruda istenen elementi sildigimizde geriye kac element kaliyor bulmamiz
		// lazim
		// silinecek sayi adedini bulalim

		int sayac  = 0; // sayac gecen karakter sayisini sayiyor
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == silinecekEleman) {
				sayac++;
			}
		}
		
		System.out.println(sayac);
		int yeniArrayUzunluk = arr.length - sayac;
		// artik yeni array � olusturabiliriz
		
		int yeniArr[] = new int[yeniArrayUzunluk];

		// simdi eski array daki elemanlar� birer birer alip
		// silinecek elemanlara esit olmayanlari yeni array a atamaliyiz
		
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != silinecekEleman) {

				yeniArr[index] = arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(yeniArr));

	}

}
