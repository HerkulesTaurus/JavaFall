package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki
		 * sartlara gore kontrol edin ve sifredeki hatalari yazdirin. Kullanici gecerli
		 * bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde
		 * �Sifreniz Kabul edilmistir� yazdirin. - Sifre kucuk harf icermelidir - Sifre
		 * buyuk harf icermelidir - Sifre ozel karakter icermelidir - Sifre en az 8
		 * karakter olmalidir.
		 */

// kullan�c�dan veri alma �slemler�nde dowhile terc�h ed�l�r

		Scanner scan = new Scanner(System.in);
		String sifre = "";
		boolean khk = false;   // khk=buyuk harf kontrol
		boolean bhk = false;   // bhk=buyuk harf kontrol
		boolean okk = false;   // okk=ozel karakter kontrol
		boolean uk  = false;    // uk=ozel karakter kontrol
		do{
			System.out.println("Lutfen sifrenizi giriniz : ");
			sifre = scan.nextLine();

			khk = kucukHarfKontrol(sifre);
			bhk = buyukHarfKontrol(sifre);
			okk = ozelKarakterKontrol(sifre);
			uk  = uzunlukKontrol(sifre);

		} while (!khk || !bhk || !okk || !uk);

		System.out.println("sifreniz basarili bir sekilde kaydedildi");
		scan.close();
	}

	private static boolean uzunlukKontrol(String sifre) {
		boolean uk = false;

		if (sifre.length() >= 8) {
			uk = true;
		} else {
			System.out.println("Sifreniz en az 8 karakterden olusmalidir");
		}
		return uk;
	}

	private static boolean ozelKarakterKontrol(String sifre) {
		boolean okk = false;	
		
		String harfler="!'^#$+�6&/()=?*-_.:,;~<>|�";
		
		for (int i = 0; i < sifre.length(); i++) {

			if (harfler.contains(sifre.substring(i, i + 1))) {
				okk = true;
				break;
			}
		}
			if (!okk) {
					System.out.println("Sifreniz en az bir ozel karakter icermelidir");
				}
		return okk; 
	}
		
	private static boolean buyukHarfKontrol(String sifre) {
		boolean bhk = false;
		
		String harfler="ABCDEFGHIJKLMNOPRSTUVYZWQX";
		
		for (int i = 0; i < sifre.length(); i++) {

			if (harfler.contains(sifre.substring(i, i + 1))) {
				bhk = true;
				break;
			}
		}
			if (!bhk) {
					System.out.println("Sifreniz en az bir buyuk harf icermelidir");
				}	
			
		return bhk;
			
	}

	private static boolean kucukHarfKontrol(String sifre) {
		boolean khk = false;

		String harfler = "abcdefghijklmnoprstuvyzqxw";

		for (int i = 0; i < sifre.length(); i++) {

			if (harfler.contains(sifre.substring(i, i + 1))) {
				khk = true;
				break; // break kullanmam�z�n sebebi:soruda 1 tane kucuk harf olmas� yeterli
						// biz kucuk harfi bulduktan sonra kodu durdurmazsak sonradan kars�m�za c�kacak
						// Buyuk harfler bizi yan�lt�r.
						// eger son harf buyuk olursa buyuk buldugu �c�n gecers�z sayab�l�r. sonucu
						// bulunca b�raks�n d�ye BREAK kullan�l�r
			}
		}

		// bu sat�ra geldiginde sifrede kucuk harf varsa khk=true, h�c kucuk harf yoksa
		// khk=false
		if (!khk) {
			System.out.println("Sifreniz en az bir kucuk harf icermelidir");
		}
		return khk;
	}
	}

