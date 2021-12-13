 package day01_02_Variables;

public class C02_Variables {

	public static void main(String[] args) {

				String okul="Yildiz Koleji";
				
				// ayni isim ve degısken turuyle ıkıncı defa variable olusturulamaz
				// String okul="Mehmet Koleji";
				
				// farklı data turu de olsa ayni isimle ikinci defa variable olusturulamaz
				// int okul=20; olmaz
				
				// var olan bı varıable yenı deger atayabılırız 
				
				okul="Mehmet Koleji";
						
				System.out.println(okul); //Mehmet Koleji
				
				// yazdirma isleminde aciklama eklemek istersek 
				// mesela (sabit)okul adi : Mehmet Koleji(variable a bagli) yazdiralim
				
				System.out.println("okul adi : " + okul);   // okul adi : Ankara Koleji
				System.out.println("okul adi : " + "okul"); //okul adi : okul
			
	}
		
}

