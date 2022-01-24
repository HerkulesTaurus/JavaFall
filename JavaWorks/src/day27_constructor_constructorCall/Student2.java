package day27_constructor_constructorCall;

public class Student2 {

	String name;
	int age;
	String phone;
	
	Student2(){
	}
	
	Student2(String name, int age, String phone){
	this.phone = phone;
	this.name = name;
}
	public static void main(String[] args) {
		Student2 s1 = new Student2();
	
		Student2 s2 = new Student2("John", 25, "029-3627222");
		
		System.out.println(s2.name + "," + s2.age + "," +s2.phone);
		
	}
	
}
