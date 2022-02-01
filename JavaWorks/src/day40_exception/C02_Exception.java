package day40_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {
		// Kullanıcıdan ıstedıgı kadar sayı alıp
		// bu sayıları toplayan bır program yapınız
		//sayi girisini bitirmek icin q ya basınız
				
		int sayi=0;
		int toplam=0;
		int count=0;
		
		Scanner scan=new Scanner(System.in);
		//InputMismatchException
		
		
		
		try {
			while(count<10000) {
			
			System.out.println("lutfen toplamak icin bir sayi yaziniz \nBitirmek icin sayı disinda bir tusa basiniz");
			sayi=scan.nextInt();
			toplam+=sayi;
			count++;
			
			}
			
		} catch (InputMismatchException e) {
			
			System.out.println("girdiginiz "+ count + " adet sayinin toplami :" + toplam);

		}
		

	}

}
