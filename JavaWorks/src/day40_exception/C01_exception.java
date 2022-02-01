package day40_exception;

public class C01_exception {

	public static void main(String[] args) {

		int a = 20;
		int b = 0; // burası 0 olursa matemetıksel karıslıgı yoktur. yazdırılmaz


		
		try {
			
			System.out.println("sayilarin bolumu :" + a / b);
			
		} catch (ArithmeticException e) {
			
			System.out.println("sifira bolum yapılamaz");
			// System.out.println(e.getMessage()); //  / by zero exception in kaynagı
			e.printStackTrace(); // kod calısır ama java nın hatasını da alıoz //java.lang.ArithmeticException: / by zero
																			   //      	at javaFall2021/day40.C01_exception.main(C01_exception.java:14)
			

		}
		
		
		System.out.println("Gorev tamamlandi");
	}

}
