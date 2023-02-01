package demo.day7;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet foodSet = new LinkedHashSet();
		foodSet.add("dosa");
		foodSet.add("briyani");
		foodSet.add("idli");
		foodSet.add("dosa");
		foodSet.add("chapathi");
		foodSet.add(123);
		foodSet.add(true);
		System.out.println(foodSet);

	}

}
