package day38_overriding;

public class Baliklar extends Animals {

	public static void main(String[] args) {
	
		Baliklar balik1 = new Baliklar();
		balik1.beslenme(); // tum hayvanlar beslenir
		balik1.hareket();  // Baliklar yuzerek hareket eder 
		balik1.solunum();  // Baliklar solungac solunumu yaparlar 

			
	}
		@Override
		// ChildClass daki bir method parent class dan bir method u override ediyorsa 
		// bunu istersek @Override notasyonu ile deklare edebiliriz
		// deklare etmesek de kodlar calısır.
		// ancak deklare etmezsek overriden methodu surekli kontrol eder ve 
		// o method da overriding e uymayan bır degisiklik olursa CTE verir
		public void hareket() {
			System.out.println("Baliklar yuzerek hareket eder ");
			
		}
		
		public void solunum() {
			System.out.println("Baliklar solungac solunumu yaparlar ");
			
	}

}
