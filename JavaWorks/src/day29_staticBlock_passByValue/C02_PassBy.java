package day29_staticBlock_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		// 100 tl ye satılan bir urun icin 2 farkli indirim uygulayan iki method olusturalim
		
		int fiyat =100;
				
		indirimYap25(fiyat);//%25 indirimli fiyat : 75
System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);//100
		
		indirimYap10(fiyat);//%10 indirimli fiyat : 90
System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);//100

	}
	//passbyvalue yanı %25 ındırımlı dekı fıyatı buraya alıyor ama fıyat ı degıl degerı tasıyo
	private static void indirimYap25(int fiyat) { 
		fiyat*=0.75;		
		System.out.println("%25 indirimli fiyat : " + fiyat);
	}

	private static void indirimYap10(int fiyat) {
		fiyat*=0.90;		
		System.out.println("%10 indirimli fiyat : " + fiyat);
	}
}


