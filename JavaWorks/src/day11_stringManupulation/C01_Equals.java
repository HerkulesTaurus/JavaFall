package day11_stringManupulation;

public class C01_Equals {

	public static void main(String[] args) {
			
		int a=10;
		
		int b=a+0;
		
		System.out.println(a==b); //true

		char ch1 = 'K';
		
		char ch2 = 'K' + 0; // char lar matematiksel isleme girerse ASCII degerini kullanir 
		
		System.out.println(ch1==ch2); //true
		
		String str1 = "Ali";
		String str2 = "Can";		
		String str3 = "Ali Can";		
		String str4 = str1+ " " + str2; // objeler farkli oldugu icin esit kabul etmez ve false calisir 

		System.out.println(str4); //Ali Can		
		System.out.println(str3==str4); //false
		System.out.println(str3.equals(str4)); // true *********-->equals ve == farki ------->>>interviev sorusu <-----*******
		
		// == ile equals nun temel farki ==hem degree hem referansa bakar dolayisiyla ancak ayni
		// objeyi kendisiyle karsilastirdigimizda true doner, equal ise referansa degil sadece icerige bakar.
		// case sensitive olarak ayni icerige sahiplerse true doner   
		
		
		// string variable larda == hem degere hem de referansina bakar dolayisiyla objeler 
		// farkli oldugunda genelde false doner.
		
		// str1.equals(str2) ise referanslara degil SADECE DEGERE bakar,
		// eger case sensitive olarak String degerleri ayni ise true doner.
		
		
	}

}
