package day16_forLoops;

public class C01_ForLoop {

	public static void main(String[] args) {


		for (int i = 0; i <= 10; i++) { //9 a kadar gelmes�n� �st�yorsan i<10 olur
			
			System.out.print(i+" "); //print yazarsak yanyana println olursa altalta yazar
			
			
			
			
		}
      // for loop baslang�c ve bitis sart� b�r say�n�n deger�ne bagl� olan
	  //durumalrda terc�h ed�l�r
		
				
		//*******************SONSUZ LOOP *************************************************************
		
		/*
		for (int i = 0; i < 10; i--) { // burada sonsuz dongu vard�r, h�cb�r zaman b�t�s sart�na ulasamaz
									   // bu b�r kodlama hatas�d�r 
			
		System.out.println(i+ " ");
		*/
			//eger baslang�c say�s� art�s/azal�s ile bitis deger�ne yaklasm�yor, uzaklas�yor �se 
			// loop h�c b�r zaman durmaz. int s�n�r�na dayan�r 
			// bu duruma sonsuz loop den�r, bu durumun gerceklesmes�n� �stemey�z 
		
		
		//*******************LOOP BROKEN***************************************************************
		
		
		for (int i = 0; i > 10; i++) {
			System.out.println(i+"acaba cal�s�r m� ?");
			
			// kod cals��r ama �lk degerden �t�baren olumsuz oldugu �c�n cal�smaz i=0 i buyuktu s�f�r olamz i>10 
			// eger ilk deger icin biti� sarti true olmazsa 
			//dah ilk ad�mda loop broken olur 
			//dolay�s�yla body h�c cal�smadan, loop un sonras�na gec�l�r 
			// loop CALISIR ancak h�c b�r �SLEM yapmaz 
		
		
		}		
	}
}


