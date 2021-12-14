package day06_wrapper;

public class C03_ConditionalOperators {

	public static void main(String[] args) {

	System.out.println(5 + 3 == 8 || 6 + 5 == 10 || 7 - 2 == 3); // true bir tanesi dogru olsa yeter true doner

	System.out.println(5 + 3 == 8 && 6 + 5 == 10 && 7 - 2 == 3); // false bir tanesi yanlis olsa yeter false doner

	int a = 10;
	int b = 20;
	int c = 30;

	boolean sonuc = a > b || b > c || a + b >= c;

	System.out.println(sonuc); // true 

	// true olur or isareti ile baglandigi icin dizi de bir tane true sonucu true cikar
	// && isareti & de kullanilabilir ancak arada bir fark var
	
	// && isareti ilk false i buldugunda bu islemin sonucunun false oldugunu bilir ve geriye
	// kalan islemleri kontrol etmeden sonucun yazdirir

	// & isareti ise once tum islemleri bitirir ve sonra sonucu false olarak
	// yazdirir

	System.out.println(5 + 3 == 8 && 6 + 5 == 10 && 7 - 2 == 3);

	// cift && isaretli oldugunda her bir elaman a tek tek bakar ilk false buldugunda false yazar
	// gerisine bakmaz ikisi false biri true oldugu icin sonuc false olacak. 

	System.out.println(5 + 3 == 8 & 6 + 5 == 10 & 7 - 2 == 3); 
	
	// tek & konuldugunda bakar false olsa da islemin sonuna kadar gider ve bakar. islemi devam ettirir

	int yas = 50;

	int boy = 180;

	char cinsiyet = 'M';

	System.out.println(yas < 30 && boy > 170 && cinsiyet == 'M');

	// yas false, digerleri true ancak sonuc tek false oldugu icin false yazar

	}

}
