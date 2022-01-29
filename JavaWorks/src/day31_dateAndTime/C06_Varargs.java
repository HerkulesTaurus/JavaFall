package day31_dateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {
	// Verilen sayıları toplayan bır method olusturmak istiyorum
	//

	int a = 10;
	int b = 20;
	int c = 30;
	int d = 40;
	int e = 50;
	int f = 50;

	topla(a, b);
	topla(a, b, c);
	topla(a, b, c, d); 
	topla(a, b, c, d, e);
	topla(a, b, c, d, e, f);
	//su ana kadar gordugumuz teknıklerle degısken sayıda parametreli tek bır method olusturamayız

	}

	private static void topla(int... a) { //Integer parametreli kac tane olursa olsun kabul edıyor
		
		System.out.println("varargs calisir"); // variety argument
	}

	private static void topla(int a, int b, int c) {

		System.out.println("iki sayının toplami :" + (a + b + c));

	}

	private static void topla(int a, int b) {

		System.out.println("iki sayının toplami :" + (a + b));
	}

}
