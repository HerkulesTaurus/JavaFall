package day25_ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		// verilen array i Arrays class �ndan yard�m alarak 
		// Liste' e cevirebiliriz

		String arr[] = {"A","b","C","d"};
		
		List<String> arraydenList= Arrays.asList(arr);
		
	System.out.println("List :"+arraydenList);
	 
	//arraydenList.add("F"); // RTE:UnsupportedOperationException--->desteklenmeyen islem
				   		     // CTE olmas� �c�n syntax te problem olams� laz�md�,
						     // ancak bu yaz�mda syntax hatas� yok
	// bu sek�lde Arrays class �ndan yard�m alarak array i list e cev�r�rsek 
	// olusturdugumuz list �n boyutu sabit olur 
	// dolay�s�yla add() veya clear() g�b� method lar� cal�st�rmak �stersek 
	// UnsupportedOperationException:desteklenmeyen �slem hatas� ver�r 
	
	arr[1]="Z";
	
	System.out.println("Array i degistirdikten sonra, array = "+Arrays.toString(arr)); //Array i degistirdikten sonra, array = [A, Z, C, d]
	
	System.out.println("Array i degistirdikten sonra, list = "+arraydenList);          //Array i degistirdikten sonra, list = [A, Z, C, d]

	arraydenList.set(3, "D");
	
	System.out.println("List i degistirdikten sonra, list = "+arraydenList);          //List i degistirdikten sonra, list = [A, Z, C, D]

	System.out.println("List i degistirdikten sonra, array = "+Arrays.toString(arr)); //List i degistirdikten sonra, array = [A, Z, C, D]

	}
}
