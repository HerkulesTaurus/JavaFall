package day43_Interface;

public interface C02_Interface {
	
						   // boddy olmaz { olmaz yanı
	private void motor();  // normal class larda acsess modifier yazmazsanız java default kabul eder
						   // interface de ise acsess modşfşer yazmazsanız java public olarak kabul eder
		
		int sayi=10; 	   // final ve static olarak kabul etti, basına yazılsa da yazılmasada bublıc statıc final kabul eder 
						   // inherit kullanılır // class dan class a         ==> extends 
											     // class dan interface e     ==> implements 
											     // interface den interface e ==> extends 
		
		public default void kaporta() { // interface de body si olan bır method yazmak ıstersenız java sıze ıkı alternatıf sunar 
										// 1-method un basına "default" keyword yazılabılır 
										// 2- ancak bura yazılan default access modıfıer degıl, java nın ınterface icin ozel kabul ettıgıbir
			
										// yanı normalde 2 tane acsess modıfıer olmaz public default ve public static gıbı
										// ancak bunlar bıldıgımız default static ve default degıl 
		
			public default void yakit() {
				System.out.println("default keyword sayesınde body olusturabıldım");
			}
			
			public static void sanzuman() {
				System.out.println("static keyword sayesınde body olusturabıldım");
		}
		
		
		
	}
	
	
	
	
	


