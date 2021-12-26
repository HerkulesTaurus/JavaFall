package day13_stringManupulation;

public class C04_ReplaceALl {

	public static void main(String[] args) {

		
		String str = "*Java 98ogrenmek c..ok k876olay ";
		
		//replaceAll methodlari kullanarak "Java ogrenmek cok kolay" haline getircem  
		
		str =str.replaceAll("\\d", ""); //d digit (rakam) demek    *Java ogrenmek c..ok kolay 
		
		System.out.println(str);
		
		str=str.replaceAll("\\s", "x"); // *Javaxogrenmekxc..okxkolay
		
		System.out.println(str);
		
		str=str.replaceAll("\\W", "");  // Javaxogrenmekxcokxkolayx
										// w harfler word demek w harfleri(rakamlarida) siler
									    // W yazarsak bosluklari (harfler ve rakamlar disinda)siler ve sadece harfleri birakir
		
		System.out.println(str);
		
		str=str.replace("x", " ");    //Java ogrenmek cok kolay 
		
		System.out.println(str);
		
		//buyun syso lari yazip yazdrimak zorunda degiliz silebiliriz.sonuncuyu yazdirsak yeter burada
		
	}

}
