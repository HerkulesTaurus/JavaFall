package day20_scope;

public class InstanceVar { 
	//scope ozellik: main dýsýnda class ýcýnde 
	
	int notMat=50;
	int notFen; 
	
	// instance variable larýn scop unda Main Method yoktur 
	// variable olusturuyorsak deger atamak zorunda degýlýz
	
	public static void main(String[] args) {

	//	System.out.println(notMat); // main method static oldugu icin static olmayan variable lar 
									// main method da direk kullanýlamaz ve goruntulenemezler
	// instance variable'lara main method dan ulasmak ýstersek obje olusturup
	// obje uzerýnden erýsým saglayabýlýrýz
		
	// Scanner scan = new Scanner(System.in)
	// icinde oldugumuz Class dan bir obje olusturalým
		
	InstanceVar celil=new InstanceVar();
	
	System.out.println(celil.notMat);
	
	InstanceVar nihal=new InstanceVar();
	
	nihal.notMat=70;
	
	System.out.println(nihal.notMat);
	
	//Ýnstance variable larda deger atamazsak java instance olarak atanan degeri alýr.
	//Bu class icin notMat=50 gibi
	//ama istersek deger de atayabýlýrýz
	//bu duurmda deger atadýgýmýz obje ýcýn yený deger gecerlý olur
	
	System.out.println(celil.notMat); // 50 dir 
	// celil in notu nu degistirmek istiyorsak celil.notMat a yeni deger atamalýyýz 
	
	celil.notMat=88;
	System.out.println(celil.notMat);
	
	celil.method2();// method2 static olmadýgý icin main method dan direk cagýrýlamaz

	}		
	public static void staticMethod() {		
		//System.out.println(notFen);
		//instance variable lara static method lardan direk ulasýlamaz
	}	
	
	public void method2() {	
		System.out.println("method2'deki notfen : " + notFen);// BU method static olmadýgý icin instance variable lara ulasilabilir 
		//instance variable olusturulurken deger atanmasa da olur.
		//bu durumda java default degerler atar. 
		//int için default deger=0 dir. string icin=null, boolean=false,sayýsal data turlerý ýcýn=0 dýr.
		
		notFen=100;
		System.out.println("method2'deki düzeltilmis notFen : " + notFen);
	}	
}
