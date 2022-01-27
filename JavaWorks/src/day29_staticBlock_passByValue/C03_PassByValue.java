package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) { //main method dan diger method lara veya diger methodlardan main method a 
		//bir variable gonderirseniz java orjinal variable ları degil onlarin degerlerini(value) goturur, orjınal variable 
		// in degeri degismez
		
		
		// burda yapilan degisiklik tamamini baglar. 
		// atama yapmak gerekir
		
		// 100 tl ye satılan bir urun icin 2 farkli indirim uygulayan iki method
		// olusturalim

		int fiyat = 100;

		System.out.println(indirimYap25(fiyat));
		System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);
		//kalıcı degısıklık yapmak ıstiyorsak maın method da atama yapmamiz gerekir.
		fiyat = indirimYap10(fiyat);
		System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);

	}
// method dan main method a gıderken yada tersi durumda fiyat degil value su gıder.
	private static int indirimYap25(int fiyat) { // burda yapilan degisiklik burayi baglar
		fiyat *= 0.75;

		return fiyat;
	}
//zamlar passbyreference indirimler passbyvalue -gecicidir- dur
	private static int indirimYap10(int fiyat) {
		fiyat *= 0.90;

		return fiyat;
		
/*
Bunu bir de adres bulma analojisinden izah edebilirim. Ornegin sana bir kagit verdim, 
kagitta evimin adresi yaziyor.
Sen bu kagidin uzerindeki adresi silip, yerine baska bir evin adresini yazarsan:
- Bu kagida bakarak benim evin adresini bulmak isteyen tum insanlar artik yeni evin adresini gorurler. 
Cunku sen direkt olarak referansi degistirdin.
- Benim adresimin bulundugu kagidin sana sadece bir kopyasini verdim, sen ona istedigini yaz. 
Sadece kendi baktigin adresi degistirirsin, diger herkes ayni sekilde benim evimin adresini okumaya devam ederler.
---> Pass by value budur.
Eger sen evin icerisinde bir sey degistirmek istersen, adresteki evi bulup, 
icerisinde istedigin degisikligi yapabilirsin. Ama sana verdigim kagida ne yazarsan yaz, 
diger insanlarin referansi uzerinde degisiklik yapamadigin icin senin disindaki insanlar ( scope disindakiler ) 
etkilenmezler.
*/
	
	
	}
}
