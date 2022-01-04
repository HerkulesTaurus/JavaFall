package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C04_WhileLook {

	public static void main(String[] args) {

		// Kullanýcýdan toplanmak uzere sayý ýsteyýn
		// Kullanýcý sýfýra basýncaya kadar sayýlarý alýp
		// Toplamaya devam edýn
		// Kullanýcý sýfýr a bastýgýnda,
		// O ana kadar sýfýr harýc kac sayý gýrdýgýný ve gýrýlen sayýlarýn toplamýný yazdýrýn

		// kullanýcýdan 5 sayý dese for loop da yapýlýr, ama sayý adetý belýrsýzse
		// whileloop

		for (int i = 1; i <= 5; i++) {
		// kullanýcýdan býr deger alýp, toplama eklerim
		}

		Scanner scan = new Scanner(System.in);

		// loop un icinde kullanacagým obje ve variable larý
		// loop dan once olusturmak daha guzeldýr
		// cunku loop un ýcýnde olusturursak loop her dondugunde yený býr 
		// obje veya varýable olusturur, ve bu da hafýzayý doldurur.
		
		int sayi=100; // burdaki deger 0 dýsýnda ne yazarsak olur, onemlý degýl
		int toplam=0;
		int sayac=0;
		
		while (sayi!=0) {
			
			System.out.println("Lutfen toplama eklemek icin bir tam sayi yaziniz\nbitirmek icin 0'a basin");
	
			sayi=scan.nextInt();
			
			toplam+=sayi;
			
			sayac++;					
		}
		
		// kullanýcý 0'a bastýgýnda loop islevini son kez yapýp 
		// sonra basa donecek ve loop bitecek
		
		System.out.println("girilen sayi adedi :"+ (sayac-1)); //safýrý gýrýlen sayýlardan kabul etmesýn dýye -1 yazdýk 
		
		// 0 toplanmak uzere verýlmeyýp sadece iþlemi býtýrmek icin verýldýgýnden 
		// sýfýr ý sayac-1 yazarak 0 ý saymamasýný ve toplamdan cýkarmasýný saglýyoruz
		
		System.out.println("girilen sayilarin toplami :" + toplam);
		
		scan.close();
	}

}
