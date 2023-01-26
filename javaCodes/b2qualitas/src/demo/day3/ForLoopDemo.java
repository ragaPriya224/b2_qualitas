package demo.day3;

public class ForLoopDemo {

	public static void main(String[] args) {

//		for(int i = 15; i >= 10; i--){    
//			System.out.println(i);   
//		} 
		
		for(int i = 1; i <5; i++){   //outer loop 
			for(int j = 0; j <i; j++){   //inner loop   
				System.out.print("*");   
			} 
			System.out.println("");
		} 

	}

}