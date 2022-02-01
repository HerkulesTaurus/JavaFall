package day35_encapsulation_inharitance;

public class Muhasebe extends Personel {//parent class la yanı personel clasıyla baglantı extends Personel kuruldu
	
	protected int saatUcreti;
	protected String statu;
	protected int maas;	
	
	public Muhasebe(){
		System.out.println("Muhasebe parametresiz constructoru calisti");
	}
	
	public static void main(String[] args) {
	
		Muhasebe clsn1=new Muhasebe();
		
		clsn1.isim="Ali";
		System.out.println(clsn1.soyisim);//null atar soyisim e atama yapılmadıgı ıcın 
					
		
		
		
		
		
	}

	public int maasHesapla() {
		
		int maas=8*25*15;
		
		return maas;
		
	}
}
