package demo.day4;

public class Avenger {
	int power;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object
		Avenger spidy = new Avenger(); //spidy -> obj name
		spidy.power = 100;
		System.out.println(spidy.power);
		spidy.introSelf("i am spidy");
		
		//create object for hulk
		Avenger hulk = new Avenger(); //spidy -> obj name
		hulk.power = 50;
		System.out.println(hulk.power);
		hulk.introSelf("i am hulk");
		//anatomy
//		Avenger hulk = new Avenger();
//		Avenger -> class name
//		hulk - > reference name
//		new -> keyword
//		Avenger() -> constructor 
	}

	public void introSelf(String intro) {
		System.out.println(intro);
	}
}
