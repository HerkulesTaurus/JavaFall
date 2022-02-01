package day40_exception;

import java.util.Scanner;

public class C08_IllegalArgumentException {

	public static void main(String[] args) {
		//Soru: Kullanıcıdan yasını gırmesını ısteyın.
		// Kodunuzu kullaıcı sıfırdan kucuk bır sayı gırerse Exception verecek sekıled yazın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen consol da gormek ıcın yasınızı gırınız ");
		
		int yas = scan.nextInt();
		
		try {
			if (yas<0) {
				throw new IllegalArgumentException();
			}else {
				System.out.println(yas);
			}
			
			
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Yas 0 dan kucuk olamaz ");
		}

	}

}
