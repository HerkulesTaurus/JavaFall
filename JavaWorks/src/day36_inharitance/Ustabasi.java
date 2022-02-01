package day36_inharitance;

import day35_encapsulation_inharitance.Isci;

public class Ustabasi extends Isci{

	
	Ustabasi(){
		System.out.println("Ustabasi parametresiz constructor calisti");
	}
	
	
	public static void main(String[] args) {
		
		Ustabasi ust1=new Ustabasi();
				
		// Java da her class olusturuldugunda otomatik olarak 
		// default constructor olustugu GİBİ
		// Child class da olusturulan her bir constructor ın 
		// ilk satirinda gizli super()  default olusturur.		
		
		// Yapıcılar(constructor) her zaman bir üst sınıf(superclass constructor) 
		// yapıcısını çağırarak başlar. Yapıcı (constructor) açıkça bir üst sınıf 
		// yapıcısına çağrı içeriyorsa, bu yapıcı(constructor) kullanılır. 
		// Aksi takdirde parametre  siz (constructor) kurucu ima edilir. 
		// Argümansız (constructor) kurucu yoksa veya alt sınıf tarafından görülmüyorsa, 
		// derleme zamanı hatası alırsınız.
		
		// extends varsa constructor ilk satirda da super vardır 
		
		// ya this ya super olur extends olsa da olmaz. ikisinden bir olur mutlaka 
		// super de this de ilk satirda olur hangisini ilk satira yazarsan o vardır digeri olur 
	}

}
