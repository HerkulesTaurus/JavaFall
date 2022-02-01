package day48_maps_TheEND;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {

		// Soru 3 ) Verilen map’te istenen programlama dilini bilen kisileri
		// list olarak donduren bir method yaziniz.
		// map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// Istenen dil java Sonuc [Ali, Veli]

		Map<Integer, String> soruMap=MapOlustur.myMap();// static oldugu ıcın class ısmıyle cagırabılıyoruz
		//mapOlustur classında method olusturduk herterde kuklanıyoruz 
		String istenenDil = "Java";

		System.out.println(dilBilenListesiOlustur(soruMap, istenenDil));

	}

	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {

		List<String> dilBilenListesi = new ArrayList<>();
		// map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// istenen dil java

		//soruMap.values(); // bana collectıon donduruyor

		List<String> valueList = new ArrayList<>(soruMap.values());
		// valueList==> elemaan sayısı 3==> [Ali, Can, java, Veli, Yan, java, Ali, Yan,C#}] 
		// bu uc elamanı tek tek ele alıp split ile bolup
		// dil degerı verılen input a esıt olanalrın
		// ısım degerleerını dılBilenlerListesi ne ekleyecegım


		String parcaliArr[] = new String[3];

		for (String each : valueList) {

			parcaliArr = each.split(", "); // [Ali, Can, java] seklınde 3 elemanlı bır array getırecek
			
			if (parcaliArr[2].equalsIgnoreCase(istenenDil)) { // array in 2. ındeksındekı dil kısmında yer alan 
			dilBilenListesi.add(parcaliArr[0]);	
		
			}
		}
		return dilBilenListesi;

	}
}
