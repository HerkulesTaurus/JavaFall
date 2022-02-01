package day48_maps_TheEND;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {

		// Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini
		// return eden bir method yaziniz
		// Ornek : Input : Hellooo output : H=1, e=1, l=2, o=3

		String input = "Hellooooo";

		Map<String, Integer> mainMap=harfSay(input);
		System.out.println(mainMap);

	}

	private static Map<String, Integer> harfSay(String input) {

		Map<String, Integer> harfSayilariMap = new HashMap<>();

		String inputArr[] = input.split(""); // [H, e, L, l, o, o, o] 

		for (String each : inputArr) {

			if (!harfSayilariMap.containsKey(each)) {

				harfSayilariMap.put(each, 1);
			} else {

				// harfSayilariMap.get(each)+1 bu gırılen harf ın value sunu bulup 1 artırır

				harfSayilariMap.put(each, harfSayilariMap.get(each) + 1);
			}
		}

		return harfSayilariMap;
		// maps method ları 
		// containsKey->
		// containsValue(key)->
		// entrySet()->
		// equals(map)->
		// get(key)->
		// getOrDefault(key,defaultDeger)->
		// putAll(map)->
		// compute(key,value)->yeniDeger
		// ComputeIfPresent(key,value)->yeniDeger
		// ComputeIfAbsent(key,k->yeniDeger
		// putIfABsent(key,value)->
		// putIfAbsent(key,value)->
		// size()->
	}

}
