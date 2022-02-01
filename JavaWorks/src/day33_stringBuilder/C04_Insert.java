package day33_stringBuilder;

public class C04_Insert {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java ogrendik");
		
		// araya "cok iyi" ekleyelim
		
		sb.insert(4, "yi cok iyi");//Javayi cok iyi ogrendik
		// index 4 den sonrasına istedigimiz kısmı ekleme
		
		System.out.println(sb);
		
		
		
		
		String str2 = "cok iyiyim"; // string de olusturulan durumu 0-4 arasındakı karakterleri 
		
		sb.insert(4, str2, 0, 4); // burda referans gostererek alıyor burda kullanıyor 

		System.out.println(sb);//Javacok yi cok iyi ogrendik

	}

}
