package day19_whileLoop_doWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {

		int i=0;
		
		while(i<5) {
			System.out.print(i + " "); // 0 1 2 3 4 
			i++;
		}
			// whileLoop once kontrol eder sonra kodu calýstýrýr.
			// loop icinde artýs yapýlsada býr sonraký kontrole kadar kod calýsmaya devam eder.
			// bu da bazý durumlarda hatalý sonuclara ulasmamýza neden olabýlýr
			
			// whileloop dan herzaman býr tur daha fazla calýsýr

			// do-whileloop ýse once islemi yapar ve sonra sarti kontrol eder. 
			// ozellýkle kullanýcýdan deger almalarda do-whileloop tercýh edilir.
			int a=0;
			do {
				System.out.println(a + " ");
				a++;
			}while (a<5); //
	}
		
}


