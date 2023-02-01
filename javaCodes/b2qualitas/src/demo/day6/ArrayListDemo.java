package demo.day6;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("hello");
		al.add(123);
		al.add(false);
		al.add("hello");
		al.add("bye");
		System.out.println(al);
//hetero data ->ok
		//duplicate data ->ok 
		//same order maintained
		
		System.out.println(al.contains("pizza"));
ArrayList nameList = new ArrayList();
		
		nameList.add("loki");
		nameList.add("spiderman");
		nameList.add("india");
		nameList.add("burger");
		nameList.add("spiderman");
		System.out.println(nameList);
		System.out.println(nameList.contains("india"));
		System.out.println(nameList.get(4));//spiderman
		System.out.println(nameList.remove(2));
		System.out.println("*********");
		System.out.println(nameList);
		nameList.set(3, "cheese");
		System.out.println(nameList);
	}

}
