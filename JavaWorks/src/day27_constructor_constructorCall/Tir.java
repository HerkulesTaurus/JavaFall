package day27_constructor_constructorCall;

public class Tir {
	
		int yil=2000;
	    String renk;
	    String model;
	    int km;
	    boolean satilikMi;	    
	    
		public Tir(int i,  String string,  String string2,   int j,    boolean b) {
				// int km, String model,    String renk,    int yil,  boolean satilikMi    siralama cok onemli 
			
		// TirRunner clasindan yolladigimiz degerlerin instance variable lar ile eslesmesi icin
		// atamalarin yapmam lazim.

			km=i;
			model=string;
			renk=string2;
			yil=j;
			satilikMi=b;
		
		}
				// int km, String model, String renk
		public Tir(int km, String model, String renk) {
			// i, string ve string2 isim olarak guzel isimler degil.
			// kodumuzu sonradan incelerken anlasilir degil 
			// daha anlasilir olmasi icin variable isimlerini anlamli yapalim
					
		this.km=km; // burdaki km yi class level le baglantı kurmaz.farklı scope oldugu icin.Basina this koyarsak ust class daki km ile baglantı kurar
		this.model=model;
		this.renk=renk;
		
		// basina "this." yazdigimizda Java bu variable in class level deki oldugunu anlar.
		}

}
