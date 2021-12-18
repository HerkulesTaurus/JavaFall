package day10_ternary_SwitchCase;

import java.util.Locale;

public class C013_ToUpperCaseLowerCase {

	public static void main(String[] args) {
		
		// verilen String in tamamini buyuk yada kucuk harfe cevirir
		
		String isim="aLI"; // bunu Ali olarak yazdiralim 
		
		System.out.println(""+isim.toUpperCase().charAt(0)+ 
				isim.toLowerCase().charAt(1)+isim.toLowerCase().charAt(2));
		// burdaki "" eklenmezse o zaman char olarak harflerin ASCII degerlerini alir 
		// "" bunu ekleyerek char i string yapiyoruz 

		
		// turkce lokal harfler kullanilarak tamamini kucuk harfe cevirelim
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
		// diller ciksin diye toLowerCase yazinca locale. yazinca diller cikar 
		System.out.println(isim.toLowerCase(Locale.KOREAN));
		
		
		

	}

}
