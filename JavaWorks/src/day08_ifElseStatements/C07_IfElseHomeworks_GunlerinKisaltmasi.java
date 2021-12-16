package day08_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseHomeworks_GunlerinKisaltmasi {

public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir Gun ismi yaziniz");


		String gun=scan.next().toLowerCase();
		        
		if (gun.equals("pazartesi")) {
			
		    System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Pzrt");
		} 
		
		else if (gun.equals("sali")) {
			
		    System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Sal");
		} 

		else if (gun.equals("carsamba")) {
			
		    System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Crs");
		} 

		else if (gun.equals("persembe")) {
			
		    System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Prs");
		} 

		else if (gun.equals("cuma")) {
			
		    System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Cum");
		} 

		else if (gun.equals("cumartesi")) {
			
		    System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Cmts");
		} 

		else if (gun.equals("pazar")) {
			
		    System.out.println("Girdiginiz Gun = "+ gun +" Kisatmasi " + "Paz");
		} 
		else {
			
		    System.out.println("Lutfen Gun ismini giriniz veya Turkce karakter kullanmadan gun ismini girin");

		    scan.close();
	}
  }
}


