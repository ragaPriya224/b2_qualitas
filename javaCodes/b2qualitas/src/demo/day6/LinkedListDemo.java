package demo.day7;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList heroList = new LinkedList();
		heroList.add("loki");
		heroList.add("spiderman");
		heroList.add("avengers");
		heroList.add("thor");
		heroList.add("spiderman");
		System.out.println(heroList);
		heroList.addFirst("captain america");
		heroList.addLast("xyz");
		System.out.println(heroList.getFirst());
		System.out.println(heroList.getLast());
		heroList.removeFirst();
		heroList.removeLast();
		System.out.println(heroList);
	

		LinkedList foodList = new LinkedList();
		foodList.add("dosa");
		foodList.add("juice");
		foodList.add("burger");
		heroList.addAll(foodList);
		System.out.println(heroList);
		
	}

}
