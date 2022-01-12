package day20_scope;

public class StaticVariables {
	// basinda static ibaresi olmak zorundadýr 
	static int no=20;
	static int sayi;
	static String adres="Ankara";
	static String cadde;
	static boolean aktifMi=true;
	static boolean tatideMi;
	
	public static void main(String[] args) {
		//static variable lara main method dan direk ulasýlabýlýr mý? EVET
		
		System.out.println(no); //20
		no++;
		System.out.println(no); //21
		staticMethod(); //method call yaptýk altta yazdýrýp cagýrdýk once buraya yazdýk
		System.out.println(no); //22	
		
		StaticVariables obje=new StaticVariables();//obje olusturduk
		obje.staticOlmayanMethod();
		System.out.println(no);
	}	
	public static void staticMethod() {	
		//static variable lara main method dan direk ulasýlabýlýr mý? EVET
		no++;
		System.out.println("static method da no : "+no);			
	}
	public void staticOlmayanMethod() {
		//static variable lara main method dan direk ulasýlabýlýr mý? EVET
		//static variable lara static olan yada olmayan tum method lardan ulasýlabýlýr
		//bu yuzden static variable lara CLASS VARÝABLE denýr.
		no++;

		System.out.println("static olmayan method da no : "+no);			

			
	}
}
