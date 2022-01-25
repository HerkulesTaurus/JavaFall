package day28_constructorCall;

public class C02 {

	int x = 5;
	static int y = 10;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 3 tane obje olusturup degisimleri gozlemleyelim

		C02 obje1 = new C02();
		System.out.println("               obje1 icin x : " + obje1.x + " " + "obje1 icin y : " + obje1.y);	
		
		obje1.x++;
		obje1.y++;
		System.out.println("islem sonrasi  obje1 icin x : " + obje1.x + " " + "obje1 icin y : " + obje1.y);
		System.out.println("");
		
		// ayni class ıcındeyken static variable lara ulasmak ıcın obje ye ıhtıyac yoktur.
		// kullanılırsa sorun yok ancak java uyarı verır yınde de calsıır. y burda statik obje1.y yerine sadece y yazılabılır 
		
		C02 obje2 = new C02();
		System.out.println("               obje2 icin x : " + obje2.x + " " + "obje2 icin y : " + obje2.y);
		
		obje2.x++;
		C02.y++; // burda obje2.y yerine C02.y de yazılabılır yada direk y de yazılabılır.
		System.out.println("islem sonrasi  obje2 icin x : " + obje2.x + " " + "obje2 icin y : " + obje2.y);
		System.out.println("obje 2 olusturulduktan ve islemden sonra obje1'in  : " + "x : " + obje1.x +" "+" y : " + obje2.y + " " +"nin degeri");

		
		C02 obje3 = new C02();
		
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
