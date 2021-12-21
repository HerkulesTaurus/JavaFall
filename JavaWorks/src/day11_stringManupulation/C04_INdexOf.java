package day11_stringManupulation;

public class C04_INdexOf {

	public static void main(String[] args) {
		//girilen parametre olarak girilen bir char veya string 'in 
		//ilk index ini verir 
		
		String str="Calisirsaniz, Java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s'));

		System.out.println(str.indexOf("J"));
		
		System.out.println(str.indexOf("Java"));
		
		int index=str.indexOf("r"); // indexOf methodu herzaman integer bir deger doner 

		System.out.println(index);
		
		System.out.println(str.indexOf('q')); //-1 yazida bu harf olmadıgı ıcın -1 doner 
		
		// Eger bir String'in index degeri olarak -1 gelirse o String'in olmadigini anlariz 
		
		System.out.println(str.indexOf('A')); // Java casesensitive oldugu icin A yok a var -1 cikar 
		
		System.out.println(str.indexOf("va og")); //16
		
		// aradiginiz charSquence anlamli veya anlamsiz bir kelime olabilir 
		// bu durumda java aradigimiz CS'i tek bir paket gibi dusunur.
		// ve o paketin baslangic index ini bize dondurur.
		
		
		System.out.println(str.indexOf('e', 15)); // 22
		
	}

}
