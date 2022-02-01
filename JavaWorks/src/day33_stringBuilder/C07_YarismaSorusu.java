package day33_stringBuilder;

public class C07_YarismaSorusu {

	public static void main(String[] args) {
		// Soru : For loop ile 1000 defa bir islem yapalim.
		// Oncesinde ve sonrasinda zamani kontrol edip ,
		// StringBuilder ve String class’larinin performanslarini karsilastiralim.
		// Ipucu: long TimeSb = System.nanoTime(); kullanalim

		String str = "Merhaba";

		StringBuilder sb = new StringBuilder("Merhaba");

		sb.trimToSize(); // boslukları kırpsın, kapasiteyi length boyutuna indirir

		long time1 = System.nanoTime();

		for (int i = 0; i < 1000; i++) {
			str += " ";

		}

		long time2 = System.nanoTime();

		long StringSure = time2 - time1;

		long time3 = System.nanoTime();

		for (int i = 0; i < 1000; i++) {
			sb.append(" ");

		}

		long time4 = System.nanoTime();

		long sbSure = time4 - time3;

		if (sbSure > StringSure) {

			System.out.println("String daha hizli");

		} else {
			
			System.out.println("StringBuilder daha hizli");
		}
		
		System.out.println(StringSure/sbSure);            // 14 hızlarının oranı  
		System.out.println("String sure : "+ StringSure); //String sure : 767600
		System.out.println("sb sure :"+ sbSure);          //sb sure :51300

	}

}
