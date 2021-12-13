package day04_IncrementDecrement;

public class C03_AutoWidening {

	public static void main(String[] args) {

		byte sayi1 = 44;

		short sayi2 = sayi1;

		// esitligın short sayi2 kısmı VALUABLE = sayi1 kısmı DEGER dir
		// esitligın sol tarafı short, sag tarafı byte
		// cunku atama yapılan variable'in data turu (short)
		// atanan degerin veri turunden (byte) buyuk oldugundan sorun olusmaz

		System.out.println("sayi2 : " + sayi2);

		int sayi3 = 55;

		double sayi4 = sayi3; // sayi3 data turu int // sayi4 un data turu de double

		System.out.println("sayi4 : " + sayi4);

		// atanan degerın data turu, deger atanan variable ın data turunden kucukse
		// java casting i otomatık yapar bu ısleme auto widening denır

	}

}
