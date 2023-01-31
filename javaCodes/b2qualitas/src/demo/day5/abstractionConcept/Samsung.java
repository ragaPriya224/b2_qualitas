package demo.day5.abstractionConcept;

public class Samsung implements MobileInterface{

	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.msg();

	}

	@Override
	public void msg() {
		System.out.println("welcome samsung user");
		
	}

}
