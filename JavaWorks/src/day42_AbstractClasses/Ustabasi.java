package day42_AbstractClasses;

public class Ustabasi extends Isci{
	
	public void statu() { //override ettik
		System.out.println("bu classdaki tum personel ustabasi dir. imza Ustabasi");
	}
	
	public void maas() {
		System.out.println("Ustabaslari aylik 10000 tl maas alır. imza Ustabasi");
		
	}
	public void mesai() {
		System.out.println("Ustabasi ariza durumunda ariza cozulunceye kadar calisir. imza ustabasi");
		
	}
	
	// obje olusturdugumuz en alttaki class parent class lar daki methodlari 
	// override edince class dan olusturulan objeler en dogru ve spesifik ozellıklere kavustu
	
	// Ama klasik parent-child iliskisinde tum methodları override etme mecburiyeti yoktur
	
	// Java parent class'lardaki tum method lari override etmek mecburiyeti kazandırmak icin 
	// abstract class ını olusturmustur
	
	// Yani bir class ı abstrac class olarak tanımlarsanız child class lar tum method lari override 
	// etmek zorunda kalir.

	// Dolayısıyla abstract yaptıgımız Parent class lar sadece kalıp gorevi yapacaklar.
	public static void main(String[] args) {
		
		Ustabasi ust1 = new Ustabasi();
		
		ust1.statu();
		ust1.maas();
		ust1.mesai();
	
	}

}
