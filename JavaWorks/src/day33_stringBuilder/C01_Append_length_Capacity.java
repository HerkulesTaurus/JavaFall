package day33_stringBuilder;

public class C01_Append_length_Capacity {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		
		System.out.println(sb.length());   // 0 sb nin kullanılan kısmının uzunlugunu verir.		
		System.out.println(sb.capacity()); //-16 sb nin kapasitesini verir.
		
		StringBuilder sb2 = new StringBuilder("Java candir");
		
		System.out.println(sb2.length()); //11 verir  		
		System.out.println(sb2.capacity());//27 verid		

		StringBuilder sb3 = new StringBuilder(7);
		sb3.append("Mehlika");
		
		System.out.println(sb3.length()); //7 verir  		
		System.out.println(sb3.capacity());//7 verir		

		StringBuilder sb4 = new StringBuilder(7);
		
		sb4.append("Nilgun");
		System.out.println(sb4.length()); //6 verir  		
		System.out.println(sb4.capacity());//7 verir
		

		sb4.append(" candir");
		System.out.println(sb4.length()); //13 verir  		
		System.out.println(sb4.capacity());//16 verir
		
		sb.append("java");
		System.out.println(sb); // java 
		
		sb.append(" candir");
		System.out.println(sb); // jaca candir
		
		sb.append("anlasıldı mı", 3, 6);
		
		System.out.println(sb); //java candirası
		
		
		
		
		
		
	}

}
