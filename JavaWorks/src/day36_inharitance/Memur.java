package day36_inharitance;

import day35_encapsulation_inharitance.Muhasebe;

public class Memur extends Muhasebe{

	public static void main(String[] args) {


		Memur memur1 = new Memur();
		
		memur1.isim="Hasan";
		memur1.saatUcreti=16;
		memur1.maas=memur1.maasHesapla();
		System.out.println(memur1.isim + "'in maasi :"+memur1.maas);
		
		
	}
}
