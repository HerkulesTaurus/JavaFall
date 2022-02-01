package day33_stringBuilder;

public class C06_Subsequence {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java ne kadar kolay");

		sb.substring(15);
		
		System.out.println(sb.substring(14));       // kolay
		
		System.out.println(sb.subSequence(14, 19)); // kolay
		
		System.out.println(sb);//Java ne kadar kolay

		// ikisi de aynı sonucu dondurur ancak 
		// substring() string class ından geldıgı ıcın 
		// substring() kullandıgımda arkasından string method larını kullanabılırız
		// ancak subsequence kullandıgımızda bu mumkun olmaz 
		
	}

}
