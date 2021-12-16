package day08_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseHomework_KisaCozum {

public static void main(String[] args) {
		
		// cozum 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir Gun ismi yaziniz");

		String gun=scan.next().toLowerCase();

		if (   gun.equals("pazartesi") || gun.equals("sali")    || gun.equals("carsamba")
			|| gun.equals("persembe")  || gun.equals("cuma")	|| gun.equals("cumartesi")
			|| gun.equals("pazar") ) {
			
			System.out.println(gun.toUpperCase().charAt(0) +""+ gun.toLowerCase().charAt(2) +""+ gun.toLowerCase().charAt(3));
		
		} else {
			
			System.out.println("Lutfen Gun ismini giriniz veya Turkce karakter kullanmadan gun ismini girin");
	
	}
  }
}


