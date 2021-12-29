package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
		// Kullanici 2,3 veya 4 degerini girerse, 
		// kullanicidan bu sayilari girmesini isteyin 
		// ve sayilarin toplamini yazdirin. 
		// Kullanici toplamak istedigi sayi adedini 4 den buyuk girerse 
		// Cok sayi girdiniz, ben toplayamam yazdirin.
		
		Scanner scan =new Scanner(System.in);
	
		System.out.println("Lutfen toplamak istediginiz sayi adedini 2, 3 veya 4 den biri olarak secin");
	
		int tercih=scan.nextInt();
		
		if (tercih>4) {
			tercih=5;			
		}		
		switch(tercih) {
		
		case 2:
			ikiSayiTopla();
			break;
			
		case 3:
			ucSayiTopla();
			break;
			
		case 4:
			dortSayiTopla();
			break;
			
		case 5:// burdaki 4 en fazlasini yukarda if yazarak 4 den buyukleri orda yazdik
			System.out.println("Cok sayi girdiniz, ben toplayamam, hadi oradannnnn");
			break;
			
		default:
			System.out.println("gecersiz tercih");
		}
		
		scan.close();
		
	}

	private static void dortSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dort sayi girin \nher sayidan sonra enter e basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		
		System.out.println("Girdiginiz dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
		scan.close();		
	}

	private static void ucSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen uc sayi girin \nher sayidan sonra enter e basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		
		System.out.println("Girdiginiz uc sayinin toplami : " + (sayi1+sayi2+sayi3));
		scan.close();		
	}

	private static void ikiSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi girin \nher sayidan sonra enter e basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Girdiginiz iki sayinin toplami : " + (sayi1+sayi2));
		scan.close();
		
	}
}


/* alternatif cozum
 * Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen toplamak istediginiz sayi adedini 2,3 ve 4 den biri olarak secin");
    
        int tercih = scan.nextInt();
                                
        switch (tercih) {
        case 2:
            ikiSayiTopla();
            break;
        case 3:
            ucSayiTopla();
            break;
        case 4:
            dortSayiTopla();
            break;
        default:
            System.out.println("gecersiz tercih");
            break;
        }
        
        scan.close();
    }
    private static void dortSayiTopla() {
        
        System.out.println(sayigir() + sayigir() + sayigir()+sayigir());
        
    }
    private static void ucSayiTopla() {
        System.out.println(sayigir() + sayigir() + sayigir());
        
    }
    private static void ikiSayiTopla() {
        
        System.out.println(sayigir() + sayigir());
        
    }
    public static int sayigir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplanacak Sayi Giriniz");
        return scan.nextInt();
        //System.out.println(sayi);
        
    }
    
    
    
 /* alternat�f cozum
  * 
  
if (tercih<2) {
	System.out.println("lutfen en az iki sayi girmelisiniz");
	
} else if (tercih==2) {
	ikiSayiTopla();
	
} else if (tercih==3) {
	ucSayiTopla();
	
} else if (tercih==4) {
	dortSayiTopla();
}  else {
	System.out.println("cok sayi girdiniz ben toplayamam");
}


 */