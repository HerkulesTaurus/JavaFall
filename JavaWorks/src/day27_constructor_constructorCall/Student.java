
public class Student {


		String name = "Emiliy";
		int age = 20;
		
		Student(String name, int age){
			this.name = name ;
			this.age = 22;
			
		}
		public static void main(String args) {
			
	Student st = new Student("Oliver", 21);
	
	System.out.println(st.name);
	
	System.out.println(","+ st.age);
	
	}

}
