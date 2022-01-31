package day32_Varargs_StringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {

		KafanaGoreislem(5, 10, 13, 0);//(5=int sayi1)--(10=intsayi2)----(13,0=int...sayilar)
		
		//varargs ın eleman sayısı hic eleman olmasada itiraz etmez.
		//once int olarak tanimlanan sayilari eslestirir
		//kalan tum sayilari varargs a doldurur 
	}
	// tamamı aynı verı type olmaı... integer yada string gıbı
	private static void KafanaGoreislem(int sayi1, int sayi2, int sayi3, int sayi4, int...sayilar) {
		//int...sayilar=====>Varargs
		int toplam = 0;

		for (int each : sayilar) {

			toplam += each;
		}

		System.out.println("ilk sayi ile digerlerinin toplamının carpımı :" + sayi1 * toplam);
	}

}
