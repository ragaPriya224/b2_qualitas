package demo.day5.finalKeywordUsage;

public class Child extends Parent{ //inheritance
	//parent -> parent class
	//child -> subclass

	public static void main(String[] args) {
		//create object
		Child child = new Child();
		child.wealth(); 
		child.toMarry();
		child.nickname ="mom";
//		child.name="welcome";

	}
	@Override //optional, but its good to use..
	public void toMarry() {
		System.out.println("b");
	}

}
