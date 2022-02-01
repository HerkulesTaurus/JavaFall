package day33_stringBuilder;

public class C03_Equals {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		
		//sb da equals method u string deki mantıkla calısmaz 
		//stringBuilder de equals, == gibi calisır
		
		System.out.println(sb1==sb2);	        //false
		System.out.println(sb1.equals(sb2));    //false 
		
		
		System.out.println(sb1.compareTo(sb2)); //0
		// ilk harflerden baslayarak bire bir sb leri karsılastırır 
		// eger tum karakterler aynı ise sonuc olarak 0 onerir
		// farklı karakter bulursa ilk ilk yazılan sb, 
		//ikinci yazılandan kac char onde doner 
		
		// eger ıkı sb ın esıt olup olamdıgını anlamak ıstersek 
		// if (sb1.compareTo(sb2)==0) ile bakabiliriz 
		
		String str = "Java";
		
		//System.out.println(sb1==str); 
		// == sb ile string i karsılastıramaz farklı data typelar cunku
		
		System.out.println(sb1.equals(str));    //false
		//System.out.println(sb1.compareTo(str)); compare string icin kullanılamaz
		
		// System.out.println(sb1=="Java");
		System.out.println(sb1.equals("Java")); //false
		// System.out.println(sb1.compareTo("Java"));
		
		
		
		
		
		
		
		
	}
}
