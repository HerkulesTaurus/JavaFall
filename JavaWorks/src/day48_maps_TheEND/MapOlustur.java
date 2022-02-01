package day48_maps_TheEND;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

	public static Map<Integer, String> myMap(){
		
		Map<Integer, String> ornekMap=new HashMap<>() ;
		
		// map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		
		ornekMap.put(101, "Ali, Can, java");
		ornekMap.put(102, "Veli, Yan, java");
		ornekMap.put(103, "Ali, Yan, C#");
		ornekMap.put(104, "Mustafa, Kan, java");
		ornekMap.put(105, "Ridvan, Zan, C#");
		ornekMap.put(106, "Kutlu, Dan, java");

		
		
		
		
		return ornekMap;
		
	
	}
	
	
}
