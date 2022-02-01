package day34_accessDeneme;

import day34_accessModifier_encapsulation.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {
		
		C01 obj = new C01();
		//System.out.println(obj.sayiPrivate); 
		//System.out.println(obj.sayiDefault); // sadece aynı package dakiler ulasabılır 
		//System.out.println(obj.sayiProtected);//aynı package dakile  class lar ve child ler ulasabılır 
		System.out.println(obj.sayiPublic);
			
	}

}
