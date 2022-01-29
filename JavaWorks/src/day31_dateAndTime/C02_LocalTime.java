package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Iterator;

public class C02_LocalTime {

	public static void main(String[] args) {

	LocalTime saat = LocalTime.now();

	System.out.println("start time:" + saat); // 23:03:15.944602500

	int sayi = 10;

	for (int i = 0; i < 100000; i++) {
		sayi++;
	}
	LocalTime saatBitis=LocalTime.now();
	System.out.println("end time:" + saatBitis);// bitis saati :23:05:58.978330300

	// Eger bir islemin baslangıc ve bıtıs zamanını kaydetmek ıstıyorsak
	// Hem basinda, hem sonunda LocalTime objesi olusturmalıyız
	
	
	System.out.println(saat.getNano());//653679700
	
	double nano1 = saat.getNano();
	double nanobitis = saatBitis.getNano();
	
	System.out.println("For Loop "+ (nanobitis-nano1) + "nano saniyede tamamladi");
	//For Loop 1995000.0nano saniyede tamamladi

	
	System.out.println(saat.getMinute());       //29 su an kı dakıka 
	System.out.println(saat.plusMinutes(10000));//22:10:17.779445800
	
	System.out.println(saat.minusHours(20));    //03:31:51.918939
	
	
	LocalTime yerelSaat = LocalTime.now(ZoneId.of("Turkey"));//yerel saat bulunabilir
	
	System.out.println(yerelSaat);//23:35:28.505074400

	
	
	
	
	
	
	
	
	}

}
