package day34_accessDeneme;

import day34_accessModifier_encapsulation.C01;

public class C02_BaskaPackageChildClass extends C01{ //child yapmak ıcın extend yazmak yeterli extend=uzanmak

	public static void main(String[] args) {


		C01 obj = new C01();
			
		// System.out.println(obj.sayiPrivate);
		// System.out.println(obj.sayiDefault); main method dan ulasamamızın nedenı statik kulubu ıle ılgılı
		System.out.println(obj.sayiPublic);	
		
	}

	public void statikOlmayanMethod() {
		
		C01 obj = new C01();		
		// System.out.println(obj.sayiDefault);
		
		System.out.println(sayiProtected);// bu class da sayiProtected diye bir variable olmadıgı halde 
											  // parent class da var oldugu icin java problem yapmadi		
		System.out.println(obj.sayiPublic);

	}

}
