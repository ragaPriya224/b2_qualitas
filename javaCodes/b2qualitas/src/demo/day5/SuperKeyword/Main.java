package demo.day5.SuperKeyword;

public class Main {
	public static void main(String[] args) {
		Dog dog1 = new Dog(); //object creation for dog
		dog1.printMessage();
	}
}
 class Animal {
	// overridden method
	public void display(){
		System.out.println("I am an animal");
	}
}
class Dog extends Animal { //dog is child, animal is parent
	// overriding method
	@Override
	public void display(){
		System.out.println("I am a dog");
	}
	
	public void printMessage(){
		// this calls overriding method
		display();
		// this calls overridden method
		super.display();
	}
}


