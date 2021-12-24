package day12_stringManupulation;

import java.util.Scanner;

public class C06_ContainsMailSorusu {

	public static void main(String[] args) {
		
		//Soru 1) Kullanicidan email adresini girmesini isteyin, 
		//mail @gmail.com icermiyorsa  lutfen gmail adresi giriniz, 
		//@gmail.com ile bitiyorsa Email adresiniz kaydedildi  , 
		//@gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen gmail adresinizi giriniz");
		
		String email=scan.next();      //mail tek kelimeden olustugu icin nextln degil next
		
		int uzunluk=email.length();
		int index=email.lastIndexOf("@gmail.com");
		
		if (!email.contains("@gmail.com")) { //basina ! koyunca icermiyorsa anlamina geliyor 
			
			System.out.println("Lutfen gecerli bir gmail adresi giriniz");
			
		} else if(index==uzunluk-10){
			
			System.out.println("Email adresiniz kaydedildi");
			
		} else {
			
			System.out.println("Lutfen yazimi kontrol edin");

		}
		
	

	

		}
		
	}

