package day21_scope_arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		// Soru 1 : Elemanlarý "Ali","Veli",
		// "Ayse" "Fatma" olan bir array olusturun ve bu array ý yazdýrýn.

		String arr[] = new String[4]; // array bu sekýlde yazýlabýlýr
		arr[0] = "Ali";
		arr[1] = "Veli";
		arr[2] = "Ayse";
		arr[3] = "Fatma";

		String arr2[] = { "Ali", "Veli", "Ayse", "Fatma" }; // yazýlabýlmesýnýn 2. yontemý

		// Soru 2 : Soru 1 deký elemanlardan "Ali" yerine "Can",
		// "Ayse" yerýne "Gul" yazýrýn
		arr[0] = "Can";
		arr[2] = "Gul";

		System.out.println(arr2[1]);

		// son elementý yazýrýn
		System.out.println(arr[arr.length-1]);// string deki length() vardý burda sadece length var parantezsýz

		//System.out.println(arr[arr.length]); // yazdýgýn Index OutofBounds error verýr
	}
}							
