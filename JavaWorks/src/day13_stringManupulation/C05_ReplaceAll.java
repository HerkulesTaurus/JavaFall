package day13_stringManupulation;

public class C05_ReplaceAll {

	public static void main(String[] args) {

		String cumle="Java    cok                zevkli";
		
		cumle=cumle.replaceAll("\\s+", " ");
		
		System.out.println(cumle); // Java cok zevkli
				
		cumle=cumle.replaceAll("[a-k]", ""); // J
											 // [a-k] arasindaki harfleri siler
											 // [ak] olursa a ve k lari siler 		
		System.out.println(cumle);
		
		
		System.out.println(cumle.replaceAll("[a-z]", "")); // J
		
		System.out.println(cumle.replaceAll("\\S", "*"));  // **** *** ****
		
		System.out.println(cumle.replaceAll("\\s", "*"));  // Jv*o*zvl

		String str="Java da rakamalar 121528121";          // ilk gordugunu degistirir
		
		System.out.println(str.replaceFirst("a", "*"));
	
		//  \\D digit olmayanlari \\d ise digit olanlari demek 
		
		//  \\w harfler ve rakamlar demek 

		// substring de char kullanilmaz, icine sayi koyulmasi lazim
	}

}
