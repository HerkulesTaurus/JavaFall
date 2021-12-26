package day13_stringManupulation;

public class C11_SifreSorusu02 {

public static void main(String[] args) {
		
	
		// Soru 2) String seklinde verilen asagidaki fiyatlarin toplamini bulunuz
		// String str1 = $129.44
		// String str2 = $198.32
		// ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
	

				String str1 = "$129.44";
				
				String str2 = "$198.32";

				str1=str1.replaceAll("\\W", "");
				
				str2=str2.replaceAll("\\W", "");

				double sayi1=Double.parseDouble(str1)/100;
				
				double sayi2=Double.parseDouble(str2)/100;

				System.out.println("Girilen degerlerin toplami : $" + (sayi1 +sayi2) );
				
	}

}
