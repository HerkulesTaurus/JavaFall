package day17_forLoops;

import java.util.Iterator;
import java.util.Scanner;

public class C02_ForLoop {

	public static void main(String[] args) {
		
		
		// soru 7: Interv�ew Quest�on: Kullan�c�dan b�r str�ng �stey�n ve str�ng � tersten yazd�r�n
	
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lutfen tersten yazd�rmak icin bir yazi girin...");
	
	String str=scan.nextLine();
	
   for (int i = str.length()-1 ; i >=0;  i--) {
	   
	   System.out.print(str.substring(i,i+1));
	
   		}
   
	scan.close();
	
	}
	

}
