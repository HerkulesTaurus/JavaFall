package day32_Varargs_StringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {

		String str = "Ali can ";

		String str2 = new String("Veli Can");
		
		
		StringBuilder sb = new  StringBuilder("Yasasin Dunya");
 
		sb.append("!!!");
		
		System.out.println(sb);
		
		sb.toString().toUpperCase();// buyuk harf yapmak ıcın kabul etmıyor 
		
		String sbBuyukHarfStrigString = new String().toUpperCase();
		
		System.out.println(sbBuyukHarfStrigString);
	
	}

}
