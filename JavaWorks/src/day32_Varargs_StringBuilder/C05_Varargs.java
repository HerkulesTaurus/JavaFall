package day32_Varargs_StringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {

		topla(5, 10, 13, 0);

		// Varargs dan once farklı parametreler kullanılabılır ama
		// varargs dan sonra parametre yazılamaz yazarsanız, java varargs
		// son parametre olmalıdır dıye sızı uyarır ve CTE verır.

	}

	// varargs son parametre olmaldıır. farklı parametre type tanımlanabılır calsıır
	// sadecec son o olsun yeter
	private static void topla(int... sayilar) {

		int toplam = 0;

		for (int each : sayilar) {

			toplam += each;
		}

		System.out.println("girilen sayilarin toplami :" + toplam);

		// obje. dersek class daki methodlara ulasabılırız
		// obje.Go dersek class da Go methoduna ulasabılırız
		
		//mutable==>degıstırılebılır
		//unmutable==>degıstırılemez
	}

}
