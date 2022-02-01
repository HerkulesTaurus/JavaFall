package day42_AbstractClasses;

public class AbsUstabasi extends AbsIsci{

	
	// concrete bir child class  parent i olan abstract class lardaki tum abstract method ları 
	// implement etmelidir.
	// ama parent class ı ................etmek zorunda degıldır 
	public static void main(String[] args) {
		AbsUstabasi ust1=new AbsUstabasi(); 		
				ust1.statu();
				ust1.maas();
				ust1.mesai();
		
		
	}

	@Override
	public void mesai() {	
	System.out.println("bu class dakı tum persınel ustabasıdır.imza ");
	}

	@Override
	public void maas() {
	}

	@Override
	public void statu() {	
	}

}
