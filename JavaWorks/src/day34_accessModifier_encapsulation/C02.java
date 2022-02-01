package day34_accessModifier_encapsulation;

public class C02 {

	public static void main(String[] args) {

			C01 obj = new C01();
			//System.out.println(obj.sayiPrivate); private variable lara kendi class ı dısında ulasılamaz
			System.out.println(obj.sayiDefault);
			System.out.println(obj.sayiProtected);
			System.out.println(obj.sayiPublic);
				
		
	}
	public void staticOlmayanMethod(String[] args) {

		C01 obj = new C01(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
}
}
/* hocanınkı
public void staticOlmayanMethod() {
	
	C01 obj=new C01();
	//System.out.println(obj.sayiPrivate); // static'de olsa private variablara sadece kendi class inda gorulur
											// static'de olsa private variable'lara kendi class disindan ulasilamaz
	System.out.println(obj.sayiDefault);
	System.out.println(obj.sayiProtected);
	System.out.println(obj.sayiPublic);


*/