package day04_IncrementDecrement;

public class C05_IncrementDecrement {

	public static void main(String[] args) {

		int sayi1 = 10;

		// atama(=) islemi olursa sayini degeri kalici olarak degisir, atama islemini
		// (=) yapar.
		// atama(=) islemi olmadan yapilan islemler sadece o satirda yapilir sayinin
		// degerini kalici olarak degistirmez.

		System.out.println(sayi1 += 5); // 15

		// bu islem sayi1 in degerini 5 artirip sayi1 e assign ediyor
		// dolayisiyla sayi1 in degeri kalici olarak degisiyor

		System.out.println(sayi1); // 15

		System.out.println(sayi1 + 12); // 27

		System.out.println(sayi1); // 15

		sayi1++;

		// her ne kadar = isareti olmasada assign burada sayi1++ isleminde de vardir. ve
		// atamayi yapar

		System.out.println(sayi1); // 16

	}

}
