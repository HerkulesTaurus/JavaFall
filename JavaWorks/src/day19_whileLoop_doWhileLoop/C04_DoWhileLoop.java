package day19_whileLoop_doWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {

		int i=0;
		
		while(i<5) {
			System.out.print(i + " "); // 0 1 2 3 4 
			i++;
		}
			// whileLoop once kontrol eder sonra kodu cal�st�r�r.
			// loop icinde art�s yap�lsada b�r sonrak� kontrole kadar kod cal�smaya devam eder.
			// bu da baz� durumlarda hatal� sonuclara ulasmam�za neden olab�l�r
			
			// whileloop dan herzaman b�r tur daha fazla cal�s�r

			// do-whileloop �se once islemi yapar ve sonra sarti kontrol eder. 
			// ozell�kle kullan�c�dan deger almalarda do-whileloop terc�h edilir.
			int a=0;
			do {
				System.out.println(a + " ");
				a++;
			}while (a<5); //
	}
		
}


