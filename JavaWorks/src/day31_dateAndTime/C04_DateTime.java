package day31_dateAndTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {

	public static void main(String[] args) {
		// bir string ve bir int variable olusturalim.
		// bir loop icerisinde bu variable ları 1000 kere degistirelim
		// islem surelerini kıyaslayalım.

		LocalTime saatS = LocalTime.now();

		System.out.println("start time:" + saatS);

		String str = "celil";

		for (int i = 0; i < 100000; i++) {
			str += " ";
		}

		LocalTime saatBitisS = LocalTime.now();
		System.out.println("bitis saati:" + saatBitisS);
		double nanoS = saatS.getNano();
		double nanobitisS = saatBitisS.getNano();

		System.out.println("String For Loop " + (nanobitisS - nanoS) + "nano saniyede tamamladi");
//String For Loop -7.423443E8nano saniyede tamamladi

		double stringSure = nanobitisS - nanoS;
		double intSure = nanobitisS - nanoS;
		System.out.println("int string den " + (stringSure - intSure) + " nano saniye daha hizli bitirdi");
//int string den0.0nano saniye daha hizli bitirdi yanlıslık var 

	}

}
