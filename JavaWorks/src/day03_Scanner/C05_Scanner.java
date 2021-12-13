package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {

		// Kullanicidan isim ve soyismini ayri ayri isteyip
		// girilen ismi asagidaki gibi yazdiriniz

		// girilen isim : Mehmet Bulutluoz

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen isminizi giriniz :");

		String isim = scan.next();

		System.out.println("Lutfen soyisminizi yaziniz...");

		String soyisim = scan.next();

		System.out.println("Girdginiz İsim/Soyisim : " + isim + " " + soyisim);

		// burdaki kodlarin calismasi icin alttaki yere sorularin cevaplarini girdikten
		// sonra kodlar calisir

		// isim ve soyisim tek seferde yazilirsa tek seferde gecer. ayri ayri sormaz sorulari

	}

}
