package day06_wrapper;

public class C04_ifBuyukturKucuktur {

	public static void main(String[] args) {

	int a = 10;
	int b = 20;

	if (a > 5) {   // true-ekrana yazilir
		System.out.println("a sayisi besten buyuk");
	}

	if (a > b) {   // false-yazilmaz
		System.out.println("a sayisi b den buyuk");
	}

	if (b > 100) { // false-yazilmaz

		System.out.println("b sayisi 100 den buyuk");

// basit if cumleleri birbirinden bagimsiz calisir
// tum if lerin body si calisabilir bazilari calisabilir, hic calismayabilirde
// her bir if cumlesi kendi sartina bakar sart true ise bady calisir
// sart false ise body calismaz
// if fonksiyonlari boolean olmali
// if yazilir crtl space bas ordan if fonksiyonunu tikla

    }
  }
}
