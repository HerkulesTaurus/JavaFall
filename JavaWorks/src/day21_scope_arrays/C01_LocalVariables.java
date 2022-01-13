package day21_scope_arrays;

public class C01_LocalVariables {

	String okulIsmi;

	public static void main(String[] args) {
		// Java Local Variable lara default deger atamas� yapmaz.
		// kodlar�m�zda sorun yasamamak icin olusturdugumuz
		// local variable lara uygun bir deger atamam�zda fayda vard�r

		int sayi = 0; // int sayi dersek java CTE veriyor.
		System.out.println(sayi);

		// int sayi;//bir local'de ayn� �s�mde birden fazla Variable OLUSTURULUMAZ
		// String sayi;//data turu farkl� olsa da java buna �z� vermez.

		@SuppressWarnings("unused")
		String isim = "Ali";
	}

	public static void staticMethod() {
		// sayi; // sayi burda da kullan�lamaz !!!!!
		// bir local'de olusturulan variable (method lar�n static olup olmamas�na
		// bagl� olmaks�z�n) farkl� local de kullan�lamaz.

		@SuppressWarnings("unused")
		String isim = "Veli";

	}
}