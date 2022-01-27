package day29_staticBlock_passByValue;

public class C01_StaticBlocks {

	static {

		System.out.println("static block main method dan bile once calisir ");
	}

	public static void main(String[] args) {
// bir class calistirildiginda ilk main method calısır ama static block varsa ılk o calısır
		
		System.out.println("Java da once main method calisir ");

	}

	static {

		System.out.println("static block nereye yazilirsa yazilsin  main method dan bile once calisir ");

		// eger birden fazla static block varsa Java yukarıdakini daha once calistirir.

	}

}
