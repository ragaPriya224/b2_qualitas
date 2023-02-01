package demo.day6;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap foodMap = new HashMap();
		foodMap.put("tea",15); //key , value
		foodMap.put("coffee",20);
		System.out.println(foodMap);
		foodMap.put("boost",20); //add the data 
		System.out.println(foodMap);
		foodMap.put("coffee",100); 
		System.out.println(foodMap);
	}

}
