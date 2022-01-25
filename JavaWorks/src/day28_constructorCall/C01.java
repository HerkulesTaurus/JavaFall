package day28_constructorCall;

public class C01 {

	int x = 3;
	int y = 5;

	C01() {
		x += 1;
		System.out.println("-x" + x);
	}

	C01(int i) {
		this();     // 2 this yanı constructor call ıkı tane altalta olmaz.
		this.y = i; // burda bırısı constructorCall dıgerı deger ataması***this.y instance yi atıyor 
		x += y;
		System.out.println("-x" + x);
		
	}

	C01(int i, int i2) {
		this(3);
		this.x -= 4;// bu class da baska x olmadıgı ıcın this kullansak da olur kullanamsak da 
		System.out.println("-x" + x);
		
	}

	public static void main(String[] args) {
			
		C01 c01 = new C01(4, 3);
		// Constructor calısmaya basladıktan sonra x ve y ile ilgili degısmeler
		// (x ve y instance variable oldugundan )sadece C01 objesini ilgilendirir
		// constructor un isi bıttıgınde ınstance degerler ilk halini alır
	
	System.out.println("c01 icin x : "+ c01.x+" " +"c01 icin y : "+c01.y);
	
	System.out.println("");
	
	C01 c02 = new C01();	
	System.out.println("c02 icin x : "+ c02.x+" " +"c02 icin y : "+c02.y);
	
	C01 c03 = new C01(7);	
	System.out.println("c03 icin x : "+ c03.x+" " +"c03 icin y : "+c03.y);

	
	
	}

}
