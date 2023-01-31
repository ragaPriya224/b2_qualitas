package demo.day5.thiskeyword;

public class Main {
	
	int instVar;//field
	//constructor - parameterized constructor
	Main(int instVar){
		this.instVar = instVar; //this keyword for current reference
		System.out.println("this reference = ");
	}
	public static void main(String[] args) {
		Main obj = new Main(8);
		System.out.println("object reference = " + obj.instVar);
	}
}
