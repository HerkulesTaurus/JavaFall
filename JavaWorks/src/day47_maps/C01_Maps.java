package day47_maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class C01_Maps {

	public static void main(String[] args) {
	// ***value kısmı object de olabılır ama sonradan yonetebılmek zor olur, ama string olursa sonradan manupulasyon kolay olur  

	// 1-Bir map olusturmadan once Map e koyacagımız Key ve Value degerlerini incelmeliyiz,
	// Tum degerleri koyabilmek icin Key ve Value icin Object , object secebılrısınız.
	// ama bu durumda map icerisndeki elemanlara ait bilgilere ulasmakta zorlanabılırız.
	// Data turunu secerken hem icine koyacagımız tum elemanları kapsayacak bir data turu secmelıyız
	// hem de icine koydugumuz tum elemanları isleyebilecek sekilde basit data turu secmeliyiz

	// 2-MAP i olustururken map in turune de karar vermeliyiz.
	
	Map<Integer, String> sinif = new HashMap<>();
	
	sinif.put(101, " Ali, Can, J.Dev");
	sinif.put(102, " Veli, Yan, QA");
	sinif.put(103, " Ali, Yan, C#");

	System.out.println(sinif);
	//{101= Ali, Can, J.Dev, 102= Veli, Yan, QA, 103= Ali, Yan, C#}

	int no=104;
	String isim = " Ayse";
	String soyisim = " Can";
	String brans = " QA";
	
	sinif.put(no, isim + "," + soyisim + "," + brans);
	System.out.println(sinif);
	//{         101= Ali, Can, J.Dev, 102= Veli, Yan, QA, 103= Ali, Yan, C#, 104= Ayse, Can, QA}
	//map par. Key1= Value1          Key2= Value1        Key3= Value1       Key4= Value1

	
	// no su 102 olan ogrencinin bilgilerini gorelim
	
	System.out.println(sinif.get(102)); // Veli, Yan, QA
	
	System.out.println(sinif.get(104)); // Ayse, Can, QA

	System.out.println(sinif.get(103)); // Ali, Yan, C#

	// map deki tum key leri gorelim
	
	System.out.println(sinif.keySet()); // [101, 102, 103, 104] bunların tamamı keyset tir. set olarak keylerın tamamını dondurur.
	
	// map deki tum value ları gormek ıstersek 
	
	System.out.println(sinif.values()); // [ Ali, Can, J.Dev,  Veli, Yan, QA,  Ali, Yan, C#,  Ayse, Can, QA] value ları collectıon olarak getırıo
	// ancak yazdırma islemi disinda bir sey yapamayız
	// sınftakı ogrencılerın ısımlerını bır lıste ye ekleyıp yazdıralım
	
	List<String> valueList=new ArrayList<>((sinif.values()));
		
	System.out.println("value list :"+ valueList);//value list :[ Ali, Can, J.Dev,  Veli, Yan, QA,  Ali, Yan, C#,  Ayse, Can, QA]

	System.out.println(valueList.size());// 4 tane eleman vardır 
	
	//*************
	List<String> isimListesi=new ArrayList<>();
	
	String bilgiler[] = new String[3];
	
	for (int i = 0; i < valueList.size(); i++) {
		
		bilgiler=valueList.get(i).split(",");
		isimListesi.add(bilgiler[0]); // 0 ıncı index dekini getir 
		
	}
		System.out.println(isimListesi); //[ Ali,  Veli,  Ali,  Ayse]
	
	
	
	
	
	
	
	
	
	
	
	}

}
