package demo.day3;

public class IfDemo {

	public static void main(String[] args) {
		int age = 90;
		if(age > 18) {
			if(age == 100) {
				System.out.println("century");
			}
			System.out.println("hello");//not executed
		}else { //optional
			System.out.println("bye");
		}

	}

}
