package day03_Scanner;

import java.util.Scanner;

  public class C06_Scanner {

	public static void main(String[] args) {

						// Scanner isleminde String icin 2 method vardır
						// scan.next() dedıgımızde sadece 1 kelime alır
						// eger kullanicidan daha fazla kelime gelme ihtimalı  varsa 
						// scan.nextLine() kullanmalıyız
						// girilen isim : Mehmet Bulutluoz 
						
						
						
				Scanner scan= new Scanner(System.in);
						
						System.out.println("Lutfen isminizi giriniz...");
						
						String isim=scan.nextLine();
						
						System.out.println("Lutfen soyisminizi yaziniz...");
						
						String soyisim=scan.nextLine();
						
						System.out.println("Girilen İsim/Soyisim : " + isim + " " + soyisim);
						

					}

				}

				
	

	

	

