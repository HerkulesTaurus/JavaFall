package day30_inMutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {

	public static void main(String[] args) {
		// String immutable bir class iken, List mutable dir.
		
		String str="Ali";
				
		str.toUpperCase();// str==>ALI
		
		System.out.println(str);//Ali yazdırır cunku
		
		System.out.println(str.toUpperCase());//ALİ
		
		
		System.out.println(str);//Ali
		
		List<String> isimler = new ArrayList<>();
		
		System.out.println(isimler);//[]
		
		isimler.add("Ali");// add,set vb methodlarla 
		
		System.out.println(isimler);//[Ali]
		
		isimler.set(0, "Veli");

		System.out.println(isimler);//[Veli]

		isimler.remove(0);
		
		System.out.println(isimler);//[]

	}

}
