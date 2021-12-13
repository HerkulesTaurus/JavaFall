package day04_IncrementDecrement;

public class C06_PreincrementPostincremenet {

	public static void main(String[] args) {

		// preincrement ve postincrement sadece sayi++ veya sayi-- yazımı icin
		// gecerlidir.

		int sayi = 10;

		sayi++;

		sayi++;

		sayi++;

		System.out.println(sayi); // 13

		System.out.println(sayi++); // bu sairda iki islem var // biri artirmak ,biri yazdirmak
									// java burda islem sonrasini biliyor

		// once artirmak sonra yazdirmak isteniyorsa ++sayi
		// once yazdirmak sonra artirmak isteniyorsa sayi++ yazilmali

		// System.out.println(sayi); // sayi yukarda once yazdirildi bu satirda ise
		// yazdirildİktan sonra arttirilan sayiyi arttirarak yazdirdi

		System.out.println(++sayi);
	}

}
