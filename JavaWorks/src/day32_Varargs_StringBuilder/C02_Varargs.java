package day32_Varargs_StringBuilder;

import java.util.Iterator;

public class C02_Varargs {

	public static void main(String[] args) {

		topla(5, 8, 10, 13, 15, 0);
// varargs list gibi davranir ama 
// array methodlarıyla calsıır
	}

// int den sonra 3 nokta koyarsak topla fonksıyonuna sınırsız verı gırlebılır
// buna buna varargs denır
	private static void topla(int... sayilar) {
		int toplam = 0;

		for (int each : sayilar) {

			toplam += each;
		}

		System.out.println("girilen sayilarin toplami :" + toplam);

	}

}
