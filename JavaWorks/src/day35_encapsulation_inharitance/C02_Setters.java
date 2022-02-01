package day35_encapsulation_inharitance;

public class C02_Setters {

	public static void main(String[] args) {

		// ogretmenler ogrencinin notunu girebilsin 
		// ama tum notlari goremesin sadece 
		// gecip/gecemedigini gorsun.
		
		C01 ogr1=new C01();
		
		System.out.println(ogr1.isGecerMi());
		
		ogr1.setNot(60); // set method uyla degıstırdık
		
		System.out.println(ogr1.isGecerMi()); //true
	
	
	
	}
}
