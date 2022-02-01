package day40_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
		// verilen bir int array icin kullanıcıdan 
		// sayi isteyin ve girilen sayiyi index 
		// olarak kabul edip o index te ki elementi yazdırın.
		
		int arr[]= {2,3,5,6,2,7,9,1,};
		// InputMismatchException
		// ArrayIndexOutOfBoundsException
		
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Lutfen elementı yazdırmak ıcın index giriniz");
			int index=scan.nextInt();	
			System.out.println("Girdiginiz index'deki element :" + arr[index]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Girdiginiz index array de yok");
		
		} catch (InputMismatchException e) {
			System.out.println("Girdiginiz index pozitif tam sayi olmali");
		}
	
		
		
		

	}

}
