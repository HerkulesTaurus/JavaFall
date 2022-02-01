package day40_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	public static void main(String[]args) throws FileNotFoundException {
		// java da bir dosyaya ulasmak istedigimizde FileInputStream class indan yardim aliriz
		//
		
		FileInputStream fis = new FileInputStream("src\\day40\\yazi.txt");// 2 ihtimal ya try catch yada throws filenotfounds...
	
		// java bu kodda olası bır problem ongoruyor 
		// ve bu probleme karsı ne yapması gerektıgını bıze soruyor 
		// (yanı altı cızılen her kod CTE degıldır) 
		
		// Bunun icin iki durum sozkonusu 
		// 1-try catch kullanarak bu problem HANDLE edip java nın yoluna devam etmesini saglayabiliriz.
		// 2-Eger dosya okunamıyorsa kod calismasin istiyorsak olayin farkında oldugumuzu 
		//   ve sorumlulugun bızde oldugunu java ya soylemelıyiz.
		
		System.out.println("Gorev tamamlandı");
	}
}
