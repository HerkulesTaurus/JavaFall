package day35_encapsulation_inharitance;

public class C01 {

	

	private double not=49.9;
	
	private boolean gecerMi=false;

	
	public void setNot(double not) { // baska class larda argument olarak yazılan degerler 
		this.not = not;              // bu class a parametre olarak gelecek 
	}


	public boolean isGecerMi() {
		
		if (not>=50) {
			gecerMi=true;
		}
		return gecerMi;
	}

	

}
