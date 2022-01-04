 package day18_nestedForLoop_WhileLoop;

public class C05_WhileLoop {

	public static void main(String[] args) {

		// Soru-2: For loop ve while Loop kullanarak 3 basamakl� say�lardan
		// 15, 20 ve 90 na tam boluneb�len say�lar� yazd�r�n.

		for (int i = 100; i < 1000; i++) {

			if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
				System.out.println(i);
			}
		}

		int sayi = 100; // baslang�c deger�m

		while (sayi < 1000) {
			if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
			System.out.println(sayi);	
			}
			sayi++;
		}
		
		// Eger baslang�c ve b�t�s sarti b�r say�n�n art�s�na bagl�ysa 
		// veya tekrar ed�lecek i�lem adedi belliyse forloop terc�h ed�l�r.
		// islem tekrar say�s� bell� deg�lse veya b�t�s �c�n b�r s�n�r deger�nden buyuk olma 
		// g�b� b�r sart varsa WhileLoop terc�h ed�l�r   
	}

}
