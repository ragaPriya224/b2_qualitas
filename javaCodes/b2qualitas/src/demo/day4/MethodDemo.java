package demo.day4;

public class MethodDemo {

	public static void main(String[] args) {

		int result=sum();
		System.out.println(result);
		calculate(3,2);
	}

	public static int sum() {
		int a = 5+1;
		//		return a;
		System.out.println(a);
		return a;
	}
	public static void divide() {
		int a = 4/2;
		System.out.println(a);
	}
	//	void -> i'm not gonna return anything
	public static void calculate(int a, int b) {
		int result = a+b;
		System.out.println(result);
	}

}
