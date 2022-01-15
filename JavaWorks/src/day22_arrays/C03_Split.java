package day22_arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// "Java ogrendim,  #cok para ?kazandim.,"
		// cumlesinin kelimelerini, ozel karakterler ve noktalama isaretleri olmadan 
		// harf sýrasýna gore yazdýralým.
		
		String cumle="Java ogrendim,  #cok para ?kazandim.,";
		
		String kelimeler[] = cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));
		
		for (int i = 0; i < kelimeler.length; i++) {
			kelimeler[i] = kelimeler[i].replaceAll("\\W", "");
			//replaceAll harf rakam dýsý karakterlerden kurtulma
		}
		
		System.out.println(Arrays.toString(kelimeler));
		
		Arrays.sort(kelimeler);
		String yeniCumle="";
		
		for (int i = 0; i < kelimeler.length; i++) {
			
			System.out.print(kelimeler[i]+" ");
			
					
		}
		
	}
}

