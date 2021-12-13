package day03_Scanner;

public class C02_SwapVariables1 {

	public static void main(String[] args) {

		/*
		 * Verilen sayi1 ve sayi2 variables larının degerlerını degıstıren (swap) bir
		 * program yazıp Orn:sayi1=10 ve sayi2=20; kod calistiktan sonra sayi1=20 ve
		 * sayi2=10
		 */

		int sayi1;
		sayi1= 10;
		// baslangicta sayi1=10 ve sayi2=20
		int sayi2;
		sayi2= 20;

		System.out.println("baslangicta :" + "sayi1=" + sayi1 + " ve sayi2=" + sayi2);

		// ilk once bos bir variable olusturalim

		int bos;

		// sayi2 yi bos variable'a atayalım

		bos = sayi1;

		// sayi2 variable'ina sayi1 degerini atayalım

		sayi1 = sayi2;

		// bos variable'daki degeri sayi 1'e atayalım

		sayi2 = bos;

		System.out.println("sonucta :" + " " + "sayi1=" + sayi1 + " ve sayi2=" + sayi2);

	}

}
