package demo.day2;

public class StringDemo {

	public static void main(String[] args) {
		String name = "grandfather";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(2));
		System.out.println(name.concat(" max"));
		System.out.println(name);
		System.out.println(name.startsWith("jo"));
		System.out.println(name.endsWith("jo"));
		System.out.println(name.indexOf("a")); //first occurence index
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.trim());
		System.out.println(name.substring(5));
		System.out.println(name.substring(5,8));
	}

}
