package demo.day5;

public class Dog extends Animal{
	// animal -> parent
	// Dog -> child class
	
	
	public static  void main(String[] args) {
		
		Dog d = new Dog();
		System.out.println(d.leg);
		d.sleep();
	}

}
