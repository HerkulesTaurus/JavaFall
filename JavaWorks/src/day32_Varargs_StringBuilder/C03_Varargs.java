package day32_Varargs_StringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {

		KafanaGoretopla(5,10, 13, 0);

	}

	private static void KafanaGoretopla(int sayi1, int...sayilar) {// int sayi1 5 i ,,int...sayilar dıger sayıları alır 
		int toplam = 0;

		for (int each : sayilar) {

			toplam += each;
		}

		System.out.println("ilk sayi ile digerlerinin toplamının carpımı :" + sayi1 * toplam);

	}

}
