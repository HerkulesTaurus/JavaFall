 package day04_IncrementDecrement;

import java.util.Collections.SynchronizedSortedMap;
import java.util.Scanner;

	public class C01_Scanner_CemberCevre {

		public static void main(String[] args) {
				
			// soru 3) kullanıcdan yarıcap  ısteyıp cemberın cevresını 
			// ve dairenin alanını  hesaplayıp yazdırın 
				
				
				Scanner scan=new Scanner (System.in);
				
				System.out.println("Lutfen cemberin yaricapini giriniz");

				double yaricap=scan.nextDouble();
				
				double cevre = 2*3.14*yaricap; // cevre = 2*pi*yaricap
				
				double alan = 3.14*yaricap*yaricap; // alan = pi*yaricap*yaricap
				
				// cemberin cevresi : 25.7
				// dairenin alani   : 26.31
				
				System.out.println("cemberin cevresi : " + cevre);
				System.out.println("dairenin alani : " + alan);
				
				
				scan.close();
				
				
			}

		}



