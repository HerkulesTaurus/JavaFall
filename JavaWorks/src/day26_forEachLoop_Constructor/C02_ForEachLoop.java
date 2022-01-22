package day26_forEachLoop_Constructor;

public class C02_ForEachLoop {

	public static void main(String[] args) {
		// Bir integer array olusturunuz 
		// ve bu array deki tum sayıların carpımı for each loop kullanarak  bulunuz
		// sonucu ekrana yazdiriniz.
	
	int arr[] = {3,4,2,5};
	
	int carpim = 1;
	
	for (int each : arr) {
		
		carpim *= each;
		
	}
	
	System.out.println("Array in elemanlari carpimi :"+ carpim);
	
	}

}
