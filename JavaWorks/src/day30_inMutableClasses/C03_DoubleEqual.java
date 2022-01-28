package day30_inMutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {
		// Java da String 2 turlu olusturulabilir
// 1-non-primitive oldugu icin new keyword ile
		// Java once esitligin sagına baktıgından
		// new kelimesi oldugu ıcın once obje olusturur.
		// sonra deger atar.
		// yani bu olusturma seklinde her zaman
		// yeni bir obje olusur

// 2-bugune kadar ogrendıgımız gıbı olusturursak
		// String str2="Mustafa"
		// Java bu durumda esitligin sagında olan
		// String in STRİNG HAVUZU'nda olup olmadıgını
		// kontrol eder ve havuzda varsa
		// yeni obje olusturmaz, oncekinin referansına
		// yeninin referansini da ekler.

		String str1 = "Mustafa";
		String str2 = "Mustafa";

		String str3 = new String("Mustafa");
		String str4 = new String("Mustafa");

		System.out.println(str1 == str3); // false
		System.out.println(str1.equals(str3)); // true

		System.out.println(str4 == str3); // false
		System.out.println(str4.equals(str3)); // true

		System.out.println(str1 == str2); // true===> istisnai bir durum
	}

}
