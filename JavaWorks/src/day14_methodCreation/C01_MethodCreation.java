package day14_methodCreation;

public class C01_MethodCreation {
	public static void main(String[] args) {
		// verilen iki sayinin toplamini ve carpimini yapip yazd�ran 2 ayri method
		// olusturun
		// method olusturmK icin 4 adim takip edelim
		// 1. adim method call yazalimm
		// 2. adim method'a arguman yazacakmiyiz karar vermeliyiz
		int sayi1 = 42;
		int sayi2 = 51;
		carpma(sayi1, sayi2);
		toplama(sayi1, sayi2); // bu bir method call dur
		carpma(sayi1, sayi2);
		// 3. adim 1. ve 2. adimi yaptiktan sonra java dan yardim alip method u
		// olustururuz.
		// burda toplama ve carpma method dur.
	}

	public static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin carpimi :" + (sayi1 * sayi2));
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("sayilarin toplami :" + (sayi1 + sayi2));
		// 4. adim erisim duzenleyici ve return type'a karar vermeliyiz
		// erisim duzenleyici (methodu kimlerin kullanabilecegine karar verme) axcess
		// modifier : public yaptik
		// return type :bizden sadece yazdirma istedigi icin void kalabilir
	}
}
