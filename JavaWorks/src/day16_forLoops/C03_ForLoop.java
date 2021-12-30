package day16_forLoops;

public class C03_ForLoop {

	public static void main(String[] args) {
 
		//soru 10 ile 30 arasýndaký (10 ve 30 dahýl ) virgille ayný satýrda yazdýrýn.
		
		for (int i = 10; i <= 30 ; i++) {
			
			if (i==30) {
				
				System.out.print(i);
				
			} else {
				
				System.out.print(i+ ",");
			}
			
			
		}			//***************ýkýncý yontem****
		
		System.out.println(); // bos syso sadece alt satýra gecmek ýcýn kullanýlýr 
		
		
		for (int i = 10; i <= 29 ; i++) {
	
			System.out.print(i+ ",");
			
			
		}
			System.out.print(30);
	}
}
