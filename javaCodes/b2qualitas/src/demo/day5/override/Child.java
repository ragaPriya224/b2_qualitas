package demo.day5.override;

public class Child extends Parent{ //inheritance
	//parent -> parent class
	//child -> subclass

	public static void main(String[] args) {
		//create object
		Child child = new Child();
		child.wealth(); 
		child.toMarry();

	}
	@Override //optional, but its good to use..
	protected void toMarry() {
		System.out.println("b");
	}
	//reducing the visibility is not allowed
	
//	parent -> protected, child -> public -> increasing visibility   OK
//	parent -> public, child -> protected -> reducing visibility   NOT OK

	
	
}
