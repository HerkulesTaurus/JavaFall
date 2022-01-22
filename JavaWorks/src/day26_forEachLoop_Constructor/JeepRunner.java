package day26_forEachLoop_Constructor;

public class JeepRunner {

	public static void main(String[] args) {
		
		// Jeep class inda bir obje olusturalim ve ozelliklerini yazdiralim  

		Jeep jeep1=new Jeep();
		
		System.out.println(jeep1.fiyat + " "+ jeep1.ilanNo + " " +jeep1.marka + " "+ jeep1.model + " " +jeep1.yil);
		// 10000 1001 null null 2001
		
		// jeep class indaki  variable lar instance variable lar olduklarından 
		// atadigim degerler sadece benim objem icin degerleri degistirir.
		// jeep class indaki degerlere hic bir sey yapmaz.
		
		jeep1.fiyat=15000; // ozellikleri yeniden atama yaparak degistirdik. default olanları kullanmadi
		jeep1.ilanNo=1002;
		jeep1.marka="Toyota";
		jeep1.model="Corolla";
		jeep1.yil=2005;
		System.out.println(jeep1.fiyat + " "+ jeep1.ilanNo + " " +jeep1.marka + " "+ jeep1.model + " " +jeep1.yil);
		
		jeep1.hiz(150); //Araba saatte 150 km yapar 
		jeep1.yakit("benzin"); //Araba yakit olarak benzin kullanir 
		
	}

}
