package day08_ifElseStatements;

import java.util.Scanner;

public class C04_IfElse_UcgenEskenarMı {

	public static void main(String[] args) {

		// Soru-Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
		// birbirine esit ise ekrana *Eskenar ucgen* yazdirin.
		// Diger durumlarda ekrana *Eskenar degil* yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ucgen kenar uzunluklarını yazınız\n\nsayi girdikten sonra diger kenarlar icin enter'e basin");

		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();

		if (kenar1 == kenar2 && kenar2 == kenar3) {

			// java karsilastirmada iki tane kullanir uc tane olmaz
			// ucuncu kenari da esitlemeye calisirsan calismaz
			// yani iki durum sadece karsilastirilabilir iki deger ...

			System.out.println("Eskenar ucgen");

		} else {

			System.out.println("Eskenar ucgen degil");

			scan.close();

		}
	}
}
