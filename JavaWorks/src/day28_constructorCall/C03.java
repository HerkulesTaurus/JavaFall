package day28_constructorCall;

public class C03 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Java Run Time bir programdır. 
		// run tusuna bastıgımızda java calısmaya baslar va islemleri yapar
		// Java nın islemleri bittginde hersey bitmis olur (calısma ısıgı kırmızıdan griye dondugunde)
		// hersey basa doner 
		
		
		// static gokteki ay gıbıdır heryerden gorunur kullanılır, ama instance oyle degıldır class ında gecerlıdır 
		
		// static variable ve method lar bulunduklari class ile ilintilidir.
		// (obje ile degil class ile) dolayısıyla baska bır class daki static variable veya method a ulasmak ıstedıgımızde 
		// C02.staticVariableIsmi ve C02.staticMethodIsmı() yazmamiz yeterli olur.
		
		C02 obje1 = new C02();
		System.out.println("               obje1 icin x : " + obje1.x + " " + "obje1 icin y : " + obje1.y);	//C02 sayfasından cektık
		
		obje1.x++;
		obje1.y++; //y static tir basına class ısmı.static yazarsak ulasabılırız sadece static.y yada sedece y yazılabılır 
	// static bir variable a class ismi uzerınden ulasmak yerine 
	// instance variable lar gibi obje ile ulasmaya calısırsanız
	// Java CTE vermez ama solda ! isareti ile bizi uyarır.
	// "static bir field olan C02.y ye static bir yoldan ulas" der. 
	// yanı C02.y yazmak daha guzel obje1 yazmaktansa. veya sadece y de yazabiliriz 
		
		System.out.println("islem sonrasi  obje1 icin x : " + obje1.x + " " + "obje1 icin y : " + obje1.y);
		System.out.println("");
		
		C02 obje2 = new C02();
		System.out.println("               obje2 icin x : " + obje2.x + " " + "obje2 icin y : " + obje2.y);
		
		System.out.println(" ");
		
		obje2.x++;
		obje2.y++;
		System.out.println("islem sonrasi  obje2 icin x : " + obje2.x + " " + "obje2 icin y : " + obje2.y);
		System.out.println("obje 2 olusturulduktan ve islemden sonra obje1'in  : " + "x : " + obje1.x +" "+" y : " + obje2.y);

		
		C02 obje3 = new C02();
		System.out.println(" ");

		obje3.x=20;
		obje3.y=40;
		
		System.out.println("obje3 den sonra obje1 in x : " + obje1.x );//x : 6 x ler obje ye gore degıstı
		System.out.println("obje3 den sonra obje2 in x : " + obje2.x );//x : 6
		System.out.println("obje3 den sonra obje3 in x : " + obje3.x );//x : 20

System.out.println(" ");

		System.out.println("obje3 den sonra obje1 in y : " + obje1.y );//y : 40 y ler obje ye gore degıl class a gore degıstı 
		System.out.println("obje3 den sonra obje2 in y : " + obje2.y );//y : 40
		System.out.println("obje3 den sonra obje3 in y : " + obje3.y );//y : 40
		
	
	}

}
