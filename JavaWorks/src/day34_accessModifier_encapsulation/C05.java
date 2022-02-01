package day34_accessModifier_encapsulation;

public class C05 {

	 int asgariMaas=4000;
	
	private static void main(String[] args) {

			
		// bir class daki herhangi bir class uyesıne ulasılabılsın ama degıstırılemesın dıyorsanız
		// 1- class uyesını PRİVATE yapın 
		// 2- Private class uyelerine hic bır sekılde ulasım olmayacagı ıcın 
		// 	  sadece gorebılme yetkisi verin
		//    getter() olusturun
				
	}
								 //gorunsun ama degıstırlmesın ıstıyorsak getter yapmalıyız
	public int getAsgariMaas() { //source-->generete getter an setters-->get method--> 
		return asgariMaas;
	}

}
