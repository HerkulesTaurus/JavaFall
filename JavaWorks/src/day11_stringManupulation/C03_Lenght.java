package day11_stringManupulation;

public class C03_Lenght {

	public static void main(String[] args) {

		String str1= "Ali Kahyaoglu";
		
		System.out.println(str1.length()); //13
		
		// verilen str1 in son harfini yazdirin
		
		System.out.println(str1.charAt(str1.length()-1)); //u
		
		String str2="";
		System.out.println(str2.length()); //0
		
		String str3=null; 
		//null degeri bizim bu variable i bilerek olusturdugumuzu ama henuz deger atamadigimizi belirtiyor 
		//System.out.println(str3.length());
		
		String str4;
		
		System.out.println(str3); // null verir str4 olusturuldu ama deger atanmadi
		//Eger String i olusturur ama deger atamazsak yazdirdigimizda hata verir 
		
		// System.out.println(str4);
		
		// null pointer olusturdugumuz fakat sonra kullanacagimiz bir string'i isaretlemek icin kullanilir  
		
		// bir String i yazdirdigimizda null cikiyorsa turkce olarak 
		// "ben bu degiskeni olusturdum ama henuz deger atamadim demek istiyor"
		
		
	}

}
