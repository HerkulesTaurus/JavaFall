package day26_forEachLoop_Constructor;

public class Car {
	// java biz bir class olusturdugumuz da o class dan obje uretecigimizi bilir.
	// ve her class a default bir constructor yerlestirir.
	// Java nin class a koydugu bu default constructor gorunmez ama 
	// obje uretmek uzere kod yazdigimizda otomatik olarak devreye girer.
	
	// bir constructor olusturmak cok kolaydir.
	// method a benzer ama method dan farklidir.
	// KURAL 1- Consructor ismi Class ismi ile ayni olmalidir.
	// class isimleri buyuk harfle basladigi icin constructor ismi de buyuk harfle baslar
	// (Method dan 1. farki budur. method lar kucuk harfle baslar)
	// KURAL 2- Constructor larin return type i olmaz.
	// (Method dan ikinci fork budur, method larin mutlaka return type i olmalidir.)
	
	public Car() {
	
	}
	// Java'nin her class'da olusturdugu constructor bu dur.
	
	public int yil=2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	
	// bugun itibariyle class larda main method olma mecburiyeti yoktur
	// ancak bildigimiz gibi main method olamayan bir class direk calistirilamaz
	// main methodu olmayan class lar baska class lardan obje olusturularak kullanilmak uzere 
	// ihtiyac duyulan variable ve method lari sakladigimiz bir depo gibidir. 
	
}
