package day43_Interface;

import day06_wrapper.C03_ConditionalOperators;

public class C03_concrete implements C02_Interface {

	public static void main(String[] args) {

		C03_Concrete concreteObje = new C03_concrete();

// ınterface de default keyword kullanrak olsturdugumuz body sı olan method lara 
// chıld class lardan obje vasıtasıyla ulasılabılır 
		concreteObje.kaporta();

// ınterface de default keyword kullanrak olsturdugumuz body sı olan method lara 
// chıld class lardan interface ismi vasıtasıyla ulasılabılır
		C02_Interface.sanzuman();
	}

	// bır ınterface de statıc veya default keyword kullanarak bodys olan bır method
	// olusturursak
	// bu ınterface e ımplement eden concrute lar bu method ları
	// ımplemenr etmek sorunda degıldır
	@Override
	public void motor() {
		
		// interface de bodys si olan method yazılabılırmı?????
		// 1- interface de concrete method olmaz(full obstractıon = ınterface)
		// 2- bız bırden fazla class ı extends ıle ınherıt edemeyız ama bırden fazla ınterface ımplmenets ıle ınherıt edılebılır
		// 3- bırden falza parent ınterface varsa varıable lar karısmasın dıye ınterfacelerını varıable ısmı kullanır.
		// 4- ınterface lerde olan her abstract method override edılecegı ıcın hangı ınterface den method u alıp overrıde edecegımız onemlı degıldır 
		//    sadece eger aynı sıgnature ama farklı return type olursa java 2 ınterface e ımplement yaptırmaz.
		// 5- interface de concrete method olmaz. Ancak body si olan method olabılır. 
		// 		Java 2 kelımeye body sı olan method olusturmak ıcın ızın vermıstır 
		//          1. si default keyword u(kesınlıkle access modıfıer degıl)
						// chıld class lardan obje olusturarak erısılebılır
		//			2. si  static keyword u(kesınlıkle bıldıgımız static degıl)
						// chıld class lardan interfaceismi.methodismi ile ulasabılırız
	
	
	}

}
