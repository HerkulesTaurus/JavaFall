package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {

		List <String> isimler = new ArrayList<>();
		System.out.println("Bos Liste : " + isimler);
		
		isimler.add("Ali");
		
		System.out.println("Bir eleman : " + isimler);//Bir eleman : [Ali]

		isimler.add("Veli");
		
		System.out.println("�ki eleman :" + isimler);//�ki eleman :[Ali, Veli]

		//add methodu listenin sonuna ekleme yapar. sondan ekleyerek devam eder 
		
		isimler.add("Can");
		
		System.out.println("uc eleman :" + isimler); //uc eleman :[Ali, Veli, Can]
		
		isimler.add(1, "Ayse");//sona degil araya bir yere eklemek istiyorsak bu secenek sec�lmel�
		
		System.out.println("1. index e Ayse ekledik :" + isimler);
		
		// isimler.add(5) declare ederken belirttigimiz data turu disinda bir data turunden ekleme yapamayiz
		System.out.println("");
		
		List<String> liste2=new ArrayList<>();
		
		liste2.add("Gunter");
		liste2.add("Emrah");
		
		System.out.println("Liste 2 : " + liste2);
		
		isimler.addAll(4, liste2); // bu yontemde liste 1 bittigi yerden liste 2 devam ett�r�ld�
		
		System.out.println("sona Liste 2 yi ekledik :" + isimler);
		
		isimler.addAll(liste2); // burda list2 yaz�larak 1. n�n devam�na eklend�
		
		System.out.println("index olmadan liste 2 yi tekrar ekledik  : "+ isimler);
		
		
	}

}
