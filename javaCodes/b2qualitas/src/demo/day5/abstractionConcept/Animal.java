package demo.day5.abstractionConcept;

public abstract class Animal {
	
	public abstract void sleep();//method without a body=abstract

	public void eat() { //non abstract method 
		System.out.println("eating");
	}
}
//abs method na, class should be abstract
//abs class -> normal method, abs method 