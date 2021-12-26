package day13_stringManupulation;

public class C12_SifreSorusu01 {

	public static void main(String[] args) {
		
		// Soru 1) String methodlarini kullanarak  Java ogrenmek123 Cok guzel@  
		// String'ini Java ogrenmek cok guzel sekline

		String cumle="  Java ogrenmek123 Cok guzel@  ";
				
		cumle=cumle.trim();		
		cumle=cumle.replaceAll("\\s", "x");		
		cumle=cumle.replaceAll("\\W", "");		
		cumle=cumle.replaceAll("\\d", "");		
		cumle=cumle.replace("x", " ");		
		System.out.println(cumle);
		
	}

}
