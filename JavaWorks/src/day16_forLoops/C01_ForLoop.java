package day16_forLoops;

public class C01_ForLoop {

	public static void main(String[] args) {


		for (int i = 0; i <= 10; i++) { //9 a kadar gelmesýný ýstýyorsan i<10 olur
			
			System.out.print(i+" "); //print yazarsak yanyana println olursa altalta yazar
			
			
			
			
		}
      // for loop baslangýc ve bitis sartý býr sayýnýn degerýne baglý olan
	  //durumalrda tercýh edýlýr
		
				
		//*******************SONSUZ LOOP *************************************************************
		
		/*
		for (int i = 0; i < 10; i--) { // burada sonsuz dongu vardýr, hýcbýr zaman býtýs sartýna ulasamaz
									   // bu býr kodlama hatasýdýr 
			
		System.out.println(i+ " ");
		*/
			//eger baslangýc sayýsý artýs/azalýs ile bitis degerýne yaklasmýyor, uzaklasýyor ýse 
			// loop hýc býr zaman durmaz. int sýnýrýna dayanýr 
			// bu duruma sonsuz loop denýr, bu durumun gerceklesmesýný ýstemeyýz 
		
		
		//*******************LOOP BROKEN***************************************************************
		
		
		for (int i = 0; i > 10; i++) {
			System.out.println(i+"acaba calýsýr mý ?");
			
			// kod calsýýr ama ýlk degerden ýtýbaren olumsuz oldugu ýcýn calýsmaz i=0 i buyuktu sýfýr olamz i>10 
			// eger ilk deger icin bitiþ sarti true olmazsa 
			//dah ilk adýmda loop broken olur 
			//dolayýsýyla body hýc calýsmadan, loop un sonrasýna gecýlýr 
			// loop CALISIR ancak hýc býr ÝSLEM yapmaz 
		
		
		}		
	}
}


