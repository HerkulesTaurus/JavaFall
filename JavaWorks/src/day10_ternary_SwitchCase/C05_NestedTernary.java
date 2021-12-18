package day10_ternary_SwitchCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		//Eger calisan kad�nca 60 yas�ndan buyuk oldugunda emekl� olab�l�r
		//cal�san erkekse 65 yas�ndan buyukse emekl� olab�l�r.
		//her sefer�nde scanner olusturmak yer�ne 
		// test datalar�m�z� var�able olarak da olusturab�l�r�z.
		//ve kod yaz�m� b�tt�g�nde bu test detaylar�n� deg�st�rerek
		// kodlar�m�z� test edeb�l�r�z 
		
		char cinsiyet = 'E';
		
		int yas=71;
		
		String sonuc = cinsiyet=='K' ? (yas>=60 ? "Emekli olabilirsiniz" : "Emekli olamazsiniz") :
									   (yas>=65 ? "Emekli olabilirsiniz" : "Emekli olamazsiniz") ;
	System.out.println(sonuc);
	
	}
}

