package day38_overriding;

public class KumesHayvanlari extends Kuslar {

	public static void main(String[] args) {
				
	KumesHayvanlari kms1 = new KumesHayvanlari();
	kms1.beslenme(); //tum hayvanlar beslenir
	kms1.hareket();  //Kumes hayvanlari yuruyerek hareket eder 
	kms1.solunum();  //Kuslar akcigerleriyle solunum yaparlar 
	
	Kuslar kms2 = new KumesHayvanlari();
	kms2.beslenme(); //Animals==>tum hayvanlar beslenir
	kms2.hareket();  //Kuslar===>Kuslar ucar
	kms2.solunum();  //Kuslar===>Kuslar akcigerleriyle solunum yaparlar 
	// kendı spesifik ozellikleri dısında kuslara tabi oluyor 
	// ama spesifik bır durumu varsa farkını ortaya koyuyor 
	
	Kuslar kms3 = new Kuslar();
	kms3.beslenme();//tum hayvanlar beslenir
	kms3.hareket(); //Kuslar ucarak hareket eder 
	kms3.solunum(); //Kuslar akcigerleriyle solunum yaparlar 

	Animals kms4 = new KumesHayvanlari();
	kms4.beslenme(); //Animals==>tum hayvanlar beslenir
	kms4.hareket();  //Animals==>Kumes hayvanlari yuruyerek hareket eder 
	kms4.solunum();  //Animals==>Kuslar akcigerleriyle solunum yaparlar 
	
	
	
	}

public void hareket() {
	System.out.println("Kumes hayvanlari yuruyerek hareket eder ");

}
}