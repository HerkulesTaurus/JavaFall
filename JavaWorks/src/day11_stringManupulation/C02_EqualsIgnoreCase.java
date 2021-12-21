   package day11_stringManupulation;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {

		//equalsIgnoreCase iki String i karsilastirirken
		//buyuk kucuk sensitive ortadan kalkar ama ekstra bosluk varsa esit kabul etmez .
				
		String str1 = "ali";
		String str2 = "can";		
		String str3 = "Ali Can";		
		String str4 = str1+ " " + str2; 
		
		System.out.println(str4); //ali can yazdirir		
		
		System.out.println(str3==str4); //false, hem degerler hem de referans farkli
		
		System.out.println(str3.equals(str4)); //false, degerler farkli 
		
		System.out.println(str3.equalsIgnoreCase(str4)); // true icerik ayni, case sensitive degil 

		// ali can = Ali Can birbirine esit kabul eder 
		
		// equalsIgnoreCase kullanildiginda ise case sensitive olmadan iceriklerin ayni olup oladigina bakar 
		
		String isim="";
		
		System.out.println(isim.length());
		
		//String isim=null;
		//System.out.println(isim.length()); 
		
		// leight yoktur isim variable ina hicbir deger ATANMAMISTIR .
		// null in uzunlugu yoktur yani 
		
		
		
	}

}
