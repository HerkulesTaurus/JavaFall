package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C04_WhileLook {

	public static void main(String[] args) {

		// Kullan�c�dan toplanmak uzere say� �stey�n
		// Kullan�c� s�f�ra bas�ncaya kadar say�lar� al�p
		// Toplamaya devam ed�n
		// Kullan�c� s�f�r a bast�g�nda,
		// O ana kadar s�f�r har�c kac say� g�rd�g�n� ve g�r�len say�lar�n toplam�n� yazd�r�n

		// kullan�c�dan 5 say� dese for loop da yap�l�r, ama say� adet� bel�rs�zse
		// whileloop

		for (int i = 1; i <= 5; i++) {
		// kullan�c�dan b�r deger al�p, toplama eklerim
		}

		Scanner scan = new Scanner(System.in);

		// loop un icinde kullanacag�m obje ve variable lar�
		// loop dan once olusturmak daha guzeld�r
		// cunku loop un �c�nde olusturursak loop her dondugunde yen� b�r 
		// obje veya var�able olusturur, ve bu da haf�zay� doldurur.
		
		int sayi=100; // burdaki deger 0 d�s�nda ne yazarsak olur, oneml� deg�l
		int toplam=0;
		int sayac=0;
		
		while (sayi!=0) {
			
			System.out.println("Lutfen toplama eklemek icin bir tam sayi yaziniz\nbitirmek icin 0'a basin");
	
			sayi=scan.nextInt();
			
			toplam+=sayi;
			
			sayac++;					
		}
		
		// kullan�c� 0'a bast�g�nda loop islevini son kez yap�p 
		// sonra basa donecek ve loop bitecek
		
		System.out.println("girilen sayi adedi :"+ (sayac-1)); //saf�r� g�r�len say�lardan kabul etmes�n d�ye -1 yazd�k 
		
		// 0 toplanmak uzere ver�lmey�p sadece i�lemi b�t�rmek icin ver�ld�g�nden 
		// s�f�r � sayac-1 yazarak 0 � saymamas�n� ve toplamdan c�karmas�n� sagl�yoruz
		
		System.out.println("girilen sayilarin toplami :" + toplam);
		
		scan.close();
	}

}
