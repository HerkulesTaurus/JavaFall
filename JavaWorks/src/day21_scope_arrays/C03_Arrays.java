package day21_scope_arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		// Soru 1 : Elemanlar� "Ali","Veli",
		// "Ayse" "Fatma" olan bir array olusturun ve bu array � yazd�r�n.

		String arr[] = new String[4]; // array bu sek�lde yaz�lab�l�r
		arr[0] = "Ali";
		arr[1] = "Veli";
		arr[2] = "Ayse";
		arr[3] = "Fatma";

		String arr2[] = { "Ali", "Veli", "Ayse", "Fatma" }; // yaz�lab�lmes�n�n 2. yontem�

		// Soru 2 : Soru 1 dek� elemanlardan "Ali" yerine "Can",
		// "Ayse" yer�ne "Gul" yaz�r�n
		arr[0] = "Can";
		arr[2] = "Gul";

		System.out.println(arr2[1]);

		// son element� yaz�r�n
		System.out.println(arr[arr.length-1]);// string deki length() vard� burda sadece length var parantezs�z

		//System.out.println(arr[arr.length]); // yazd�g�n Index OutofBounds error ver�r
	}
}							
