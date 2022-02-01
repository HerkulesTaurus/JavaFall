package day39_overridingKurallari_Polymorhphism;

public class C02 extends C01 {

	public static void main(String[] args) {

		C02 obj1 = new C02();
		obj1.privateMethod();
		obj1.staticMethod();

		C01 obj2 = new C02();
		// obj2.privateMethod();
		// data turu C01 oldugundan oncelikle C01 class'ındaki method a bakmaız gerekir
		// ancak C01 clasındaki method private oldugundan ulasamayiz.
		// ulasamadıgımız bır method u override yapamayız.
		// dolayısıyla signature aynı olmasına RAGMEN bu ikisi farkli iki meth0d olarak
		// calisir.
		obj2.staticMethod();
		// static method lar override edilemez dolayısıyla everride edilemedigi icin
		// dolayısıyla signature aynı olmasına RAGMEN bu ikisi farkli iki method olarak
		// calisir.
	}

	public static void staticMethod() {
		System.out.println("Child class static method calisti");

	}

	private void privateMethod() {
		System.out.println("Child class private method ");

	}

	/*
	 * public final void finalMethod() {
	 * System.out.println("Child class final method"); //final olarak tanımlanan
	 * method override edilemez
	 * 
	 */
}
