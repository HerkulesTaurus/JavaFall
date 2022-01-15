package day22_arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		// "Java ogrenmek cok guzel" 
		// cumles�n�n kel�meler�n� ters s�rada yazd�r�n
		
		String cumle="Java ogrenmek cok guzel";
		
		String kelimeler[] = cumle.split(" "); // once cumleyi kelimelere ayirdik
		
		System.out.println(Arrays.toString(kelimeler)); //[Java, ogrenmek, cok, guzel] 

		for (int i = kelimeler.length-1; i >= 0; i--) {
			
			System.out.print(kelimeler[i]+" ");
	
		}
	}
}
