package day26_forEachLoop_Constructor;

public class C01_ForEachLoop {

	public static void main(String[] args) {
		// iki string array olusturunuz
		// ve bu array lardaki ortak elemanları For-each loop kullanarak  bulunuz.
		// Sonucu ekrana yazdırınız.
		// Ortak eleman yoksa ekrana "ortak eleman yok " yazdırınız.
	
		String arr1[] = {"A", "K", "C"};
		String arr2[] = {"A", "R", "O"};
		
		int flag=0;
		
		for (String each1 : arr1 ) {
			//arr1 den string olan elemanları tek tek getır demektır  for each loop 
		
			for (String each2 : arr2 ) {
				
				if (each1.equals(each2)) {
					System.out.print(each1 + " ");
						flag++; // ortak eleman varsa flag ı artır. ortak elemaan varsa bayrak havaya kalkar 
				}
		
	}

}
if (flag ==0) {
	
}
	}
}