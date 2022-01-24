package day27_constructor_constructorCall;

public class Car1 {


		
			int yil=2000;
		    String renk;
		    String model;
		    int km;
		    boolean satilikMi;
		    
		    
		    // C02 class_parametreliCunstroctor da  java onerdi parametreli constructor olusturduk. 
		    // ve bir tane de bos public class olusturduk. paramaetresiz
		    public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
		    // atama yapacagim tum ozellikleri parametre olarak yolladik
		    }
		    
		    // ben 5 ozelligi degistiren bir constructor urettigimde java default constructor u siler.
		    // bu durumda daha once yazilan ve default constructor u kullananan tum kodlar coker.
		    // bu duurmda kodlari duzeltmek icin java nin sildigi default constructor yerine 
		    // parametresiz constructor olusturmaliyim.
		    // "classAdini+()+{" syntax seklinde uretilir. basına public de yazılabılır 
		    public Car1() {

		    }
				    
			public Car1(int i) { // bu satirdaki int km ile class level deki int km farkli scope'lardadir.
				km=i; //(ismi km den farkli girebiliriz ancak en basta verilen int km ile esitlemem lazim.)
			}
			
			public Car1(int i, int j) {
						// yil     km
				
				yil=i;    
				km=j;  // burda assingment i yaptik 
			}

			public void hiz(int hiz) {
		        System.out.println("araba saatte " + hiz + " km yapar");
		    }
		    
		    public void yakit(String yakit) {
		        System.out.println("Araba yakit olarak " + yakit + " kullanir");
		    }
		}
