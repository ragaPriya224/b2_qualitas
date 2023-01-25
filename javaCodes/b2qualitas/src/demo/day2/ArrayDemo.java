package demo.day2;

public class ArrayDemo {

	public static void main(String[] args) {

		int ccc = 100;
		int abc = 100;
		int xyz = 200;
		int cde = 200;
		int kjkhjkhjk = 200;

		//type []var-name = new type [size];
		int []empId = new int [5];
		
		empId[2] = 100;
		empId[4] = 200;
		
		System.out.println(empId[2]); //100
		System.out.println(empId[3]);  //0
		
//		System.out.println(empId[32]); //arrayindexoutof bound exception
		System.out.println(empId.length); //5

	}

}
