package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {

		LocalDateTime tarihSaat = LocalDateTime.now();

		System.out.println(tarihSaat); // 2021-12-02T23:44:43.078545

		// Eger tarih veya saati kendi istedigimiz bicimde yazdırmak ıstersek
		// Gun / Ay / Yil       saat:dakika:saniye

	//dakika minute ay mounth yanı ay ı MM yazmalıyız gun u mm 
	// MM rakamla yazar. MMM yazıyla ayın 3 harfını yazar MMMM tum ayı yazar
	DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd / MMM / YYYY EEE HH : mm : ss");
	
	System.out.println(duzenle.format(tarihSaat)); //02 / 12 / 2021 23 : 52 : 08
	
	/*format olustururken
	   GUN
	 * d  : basta o varsa onu yazmadan gun numarası
	 * dd : tek haneli gunlerı 01 gıbı basına sıfı ryazarak gun numarası
	 * DDD : yılın kacıncı gunu oldugunu yazar
	 * E EE EEE : gun isminin ılk 3 harfını 
	 * EEEE : gun ısmının tamamını
	 * 
		AY (ay icin M dakika icin m)
	*	M : basta 0 varsa onu yazmadan ay numarası 
	*	MM :dd: tek haneli ayları 01 gibi basına sıfır yazarak ay numarası 
	*	MMM : ay ısmının ılk 3 harfı 
	*	MMMM : ay ısmının tamamı
		
		YIL
	*   YY : yılın son ıkı rakamını 
	*   YYYY: yilin tamamını 
	*   
	*   Saat :(24 saat duzenınde istiyorsak H, 12 saat duzenınde istiyorsak h)
	*	
	*	HH : saatin tamamı, tek rakamlı saat olursa 02 gibi
	*	H  : tek rakamlı saat olursa sadece saatı
	*
	*   a yazarsak AM veya PM degerını yazar
	*
	
	
	*/
// * yy:   Yilin son iki rakamini
// * y:    Yilin tamamini
// * M:    Ay sirasini verir
// * MM:   Ay sirasini verir
// * MMM:  Ay isminin ilk uc harfini verir
// * MMMM: Ay isminin tamamini verir
// *
// *  Ay buyuk M ile belirtilmeli dakika( minute) ile
// *  cakismamasi icin.
	
	
	
	}

}
