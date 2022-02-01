package day33_stringBuilder;

public class C02_Delete {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java candir can");

		sb.deleteCharAt(11);// sadece index 11 deki karakteri siler

		System.out.println(sb);//Java candircan

		sb.delete(11, 13); // ilk lndex inclusive, ikinci index exculisive oldugundan  
		
		System.out.println(sb);	
		
		sb.delete(11, sb.length());
		
		System.out.println(sb);//Java candir
		System.out.println(sb.capacity());
		
		sb.delete(4, 20);		
		System.out.println(sb);
		System.out.println(sb.capacity());//31

		
		
	}

}
