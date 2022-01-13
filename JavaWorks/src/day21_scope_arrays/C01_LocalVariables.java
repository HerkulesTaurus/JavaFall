package day21_scope_arrays;

public class C01_LocalVariables {

	String okulIsmi;

	public static void main(String[] args) {
		// Java Local Variable lara default deger atamasý yapmaz.
		// kodlarýmýzda sorun yasamamak icin olusturdugumuz
		// local variable lara uygun bir deger atamamýzda fayda vardýr

		int sayi = 0; // int sayi dersek java CTE veriyor.
		System.out.println(sayi);

		// int sayi;//bir local'de ayný ýsýmde birden fazla Variable OLUSTURULUMAZ
		// String sayi;//data turu farklý olsa da java buna ýzý vermez.

		@SuppressWarnings("unused")
		String isim = "Ali";
	}

	public static void staticMethod() {
		// sayi; // sayi burda da kullanýlamaz !!!!!
		// bir local'de olusturulan variable (method larýn static olup olmamasýna
		// baglý olmaksýzýn) farklý local de kullanýlamaz.

		@SuppressWarnings("unused")
		String isim = "Veli";

	}
}