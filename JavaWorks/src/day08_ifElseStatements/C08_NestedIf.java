package day08_ifElseStatements;

import java.util.Scanner;

public class C08_NestedIf {

	public static void main(String[] args) {

// Eger calisan kadinsa 60 yasindan buyuk oldugunda,
//              erkekse 65 yasindan buyukse emekli olabilir

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen cinciyetinizi giriniz \nErkek icin E, kadin icin K");

		char cinsiyet = scan.next().toUpperCase().charAt(0); // ilk harfi buyuk yap ve 1. harfine bak demek 

		System.out.println("Lutfen yasinizi giriniz");

		double yas = scan.nextDouble();

		if (cinsiyet == 'E') {

			if (yas >= 65) {

				System.out.println("Emekli olabilirsin");

			} else {

				System.out.println("Emekli olamazsin");
			}

		} else if (cinsiyet == 'K') {

			if (yas >= 60) {

				System.out.println("Emekli olabilirsin");

			} else {

				System.out.println("Emekli olamazsin");
			}
			
		} else {

			System.out.println("Lutfen cinsiyet icin gecerli bir harf secin");

			scan.close();

		}
	}
}
