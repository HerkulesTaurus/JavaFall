package day08_ifElseStatements;

import java.util.Scanner;

public class C03_IfElseEmekliOlabilirsin {

	public static void main(String[] args) {

		// Soru-3 : Kullanicidan yasini sorun, eger
		// yas 65 den kucuk ise "emekli olamazsin, calismalisin"
		// 65'e esit yada buyukse "Emekli olabilirsin" yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen yasinizi giriniz");

		int yas = scan.nextInt();

		if (yas < 65) { // if yazip ctrl-space e basinca cikar

			System.out.println("emekli olamazsin, calismalisin");

		} else {

			System.out.println("Emekli olabilirsin");
		}
		scan.close();
	}
}










