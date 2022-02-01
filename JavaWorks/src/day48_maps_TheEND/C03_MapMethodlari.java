package day48_maps_TheEND;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {

		Map<Integer, String> ornek = MapOlustur.myMap();

		System.out.println(ornek);

		System.out.println(ornek.containsKey(110)); //false

		System.out.println(ornek.containsKey("JAVA"));//false  tek basına Java yok false doner 

		System.out.println(ornek.containsValue("Mustafa, Kan, JAVA")); //true

		Set<Entry<Integer, String>>  entrySet = ornek.entrySet();// herbır elamanın data turu Entry 101=Ali, Can, java gibi
														

		int sayac = 1;

		for (Entry<Integer, String> each : entrySet) {

			System.out.println(sayac + ".entry :" + each);
			sayac++;
		}

		System.out.println(ornek.getOrDefault(110, "girilen key map de yok")); // girilen key map de yok
		System.out.println(ornek.getOrDefault(103, "girilen key map de yok")); // Ali, Yan, C^#
		
		ornek.putIfAbsent(103, "Ali, Yan, C#"); // eklemeyecek
		ornek.putIfAbsent(110, "Fikri, Yan, QA"); // ekleyecek
		
		sayac = 1;

		for (Entry<Integer, String> each : entrySet) {

			System.out.println(sayac + ".entry :" + each);
			sayac++;
		}
		String maptenString=ornek.toString();
		System.out.println(maptenString);
	}

}
