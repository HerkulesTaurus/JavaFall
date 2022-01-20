package day25_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// Verilen bir listede, icinde belirli bir harf olan elemanlar� 
		// silen bir method yaz�n�z
		
		List<String> str=new ArrayList<>();

		str.add("arda");
		str.add("Jeyhun");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgut");
		str.add("Tugba");

		
		System.out.println(str);
	
	    String silinecekharf="a";
	    
	   str = killThemAll(str,silinecekharf);
			
	}

	private static List<String> killThemAll(List<String> str, String silinecekharf) {

		
		for (int i = 0; i < str.size(); i++) {
			
			if (str.get(i).contains(silinecekharf)) {
				
				str.remove(i);
				i--; 
// burdaki i-- bir eleman silindiginde index azalm�s oluyor ve silinenin yerine kay�yor 
//ve okumuyor yerine gecen� kontrol ets�n d�ye yazd�k 
			
			} 
		}
		
		System.out.println(str);
		return str;
	}

}
