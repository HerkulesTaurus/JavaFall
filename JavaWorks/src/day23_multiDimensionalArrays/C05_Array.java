package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Array {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan bir cumle isteyin 
		//         ve cumledeki kelime sayisini yazdirin
		
	// yazmas� kolay d�ye kullan�can almad�k scanne yapmad�k
		
		String cumle = "Her sey Javayla kolay degil mi?"; 
		
		String kelimeler[] = cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler)); //[Her, sey, Javayla, kolay, degil, mi?]
		
		System.out.println("girilen cumlede : " + kelimeler.length + " adet kelime var");
	
	}

}
