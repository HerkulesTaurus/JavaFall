package day03_Scanner;

public class C01_Variable {

	public static void main(String[] args) {

		/*
		 * 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin 
		 * 2- isim ve soyisim icin iki variable olusturun ve bunlari 
		 * 	  isminiz : Mehmet soyisminiz :Bulutluoz seklinde yazdirin 
		 * 3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin 
		 * 4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin 
		 * 5- Char data turunde bir variable olusturun ve yazdirin 
		 * 6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
		 */

		String ismim;
		ismim = "Mehmet Bulutluoz";
		System.out.println(ismim);

		char ilkHarf;
		ilkHarf = 'S';

		boolean anlasildiMi;
		anlasildiMi = true;

		String isminiz;
		isminiz = "Ali";

		String soyisminiz;
		soyisminiz = "Tuskan";

		System.out.println("isminiz : " + isminiz);

		System.out.println("soyisminiz :" + soyisminiz); // soyisminiz : Bulutluoz

		int a = 10;
		short b = 20;

		System.out.println(a + b); // 30 yazar

		int sayi;
		sayi = 25;

		char karakter;
		karakter = 'a';

		System.out.println(sayi + karakter);
		// 122 yazar (ASCII TABLE da a nin karsiligi)(burdaki "karakter" tirnak icinde
		// olursa ASCII degerine bakmazdi)

	}

}
