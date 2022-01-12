package day20_scope;

public class InstanceVar { 
	//scope ozellik: main d�s�nda class �c�nde 
	
	int notMat=50;
	int notFen; 
	
	// instance variable lar�n scop unda Main Method yoktur 
	// variable olusturuyorsak deger atamak zorunda deg�l�z
	
	public static void main(String[] args) {

	//	System.out.println(notMat); // main method static oldugu icin static olmayan variable lar 
									// main method da direk kullan�lamaz ve goruntulenemezler
	// instance variable'lara main method dan ulasmak �stersek obje olusturup
	// obje uzer�nden er�s�m saglayab�l�r�z
		
	// Scanner scan = new Scanner(System.in)
	// icinde oldugumuz Class dan bir obje olustural�m
		
	InstanceVar celil=new InstanceVar();
	
	System.out.println(celil.notMat);
	
	InstanceVar nihal=new InstanceVar();
	
	nihal.notMat=70;
	
	System.out.println(nihal.notMat);
	
	//�nstance variable larda deger atamazsak java instance olarak atanan degeri al�r.
	//Bu class icin notMat=50 gibi
	//ama istersek deger de atayab�l�r�z
	//bu duurmda deger atad�g�m�z obje �c�n yen� deger gecerl� olur
	
	System.out.println(celil.notMat); // 50 dir 
	// celil in notu nu degistirmek istiyorsak celil.notMat a yeni deger atamal�y�z 
	
	celil.notMat=88;
	System.out.println(celil.notMat);
	
	celil.method2();// method2 static olmad�g� icin main method dan direk cag�r�lamaz

	}		
	public static void staticMethod() {		
		//System.out.println(notFen);
		//instance variable lara static method lardan direk ulas�lamaz
	}	
	
	public void method2() {	
		System.out.println("method2'deki notfen : " + notFen);// BU method static olmad�g� icin instance variable lara ulasilabilir 
		//instance variable olusturulurken deger atanmasa da olur.
		//bu durumda java default degerler atar. 
		//int i�in default deger=0 dir. string icin=null, boolean=false,say�sal data turler� �c�n=0 d�r.
		
		notFen=100;
		System.out.println("method2'deki d�zeltilmis notFen : " + notFen);
	}	
}
