package day13_stringManupulation;

public class C03_Replace {

	public static void main(String[] args) {

		String str = "Java ogrenmek cok zevkli";
		
		System.out.println(str.replace(" ", "")); // bosluklari hiclige ceviriyor 
		
		//javaogrenmekcokzevkli
		
		System.out.println(str.replace("ogrenmek", "kod yazmak"));
		
		System.out.println(str.replace("Java", "Kod"));
		
		System.out.println(str.replace("a", "u"));

		System.out.println(str.replace("e", "i"));

	}
}
