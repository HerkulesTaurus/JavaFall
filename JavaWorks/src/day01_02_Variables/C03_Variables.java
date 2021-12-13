 package day01_02_Variables;

public class C03_Variables {

public static void main(String[] args) {
		 
		int sayi1= 10; //int verisi sayıdır
		int sayi2= 20;
		
		String sayi3="10"; //string verisi yazıdır.tırnak icinde ne gorurse onu yazar 
		String sayi4="20";

	System.out.println(sayi1+sayi2); // 30 yazdırır, string kelime verisidir
	System.out.println(sayi3+sayi4); // 1020 yazdırır

	// Farklı data turleri aynı degeri alabılır 
	// burada onemlı olan bu degıskenlerı degısken turune gore islem yapabılecegıdır

	String harf1="A";
	char harf2='A';

	System.out.println(harf1);
	System.out.println(harf2);
	 
	// yukaridaki degiskenleri kullanarak 30A yazdirin 

	System.out.println(sayi1+sayi2+harf1); // 30A yazar

	System.out.println(sayi1+sayi2+harf2); // 95 yazar cunku harf2 nin ASCII degerını aldı

	// char ekstra ozellıgı nedenıyle matematıksel ıslemlerde numerık deger alır.

	System.out.println(harf1+sayi1+sayi2); // matematiksel islem olmayip toplamadan yanyana yazdirirsa concatination deniyor o isleme

	//toplama ıslemınde bır  tane bıle eleaman string se hepsını yanyana yazdırır ve string yapar

	System.out.println(sayi1+harf1+sayi2); //10A20 yazdırır

	System.out.println(harf1+(sayi1+sayi2)); // A30 yazdırır

	}

	}


