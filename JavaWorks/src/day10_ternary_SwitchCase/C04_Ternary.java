package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C04_Ternary {

public static void main(String[] args) {

	//Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse �Sayi pozitif� yazdirin, negatifse  sayinin karesini yazdirin

	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lutfen bir sayi giriniz :");	
	
	double sayi=scan.nextDouble();
	
	
	//sayi>0 ? System.out.println("sayi pozitif") : System.out.println(sayi*sayi);
	//ternary de direkt sonuc veya sonuc dondurecek b�r islem yapab�l�r�z
	
	System.out.println(sayi>0 ? "sayi pozitif" : sayi*sayi);
	
	scan.close();	
	}

}
