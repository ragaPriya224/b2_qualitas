package demo.day6;

public class Demo {

	public static void main(String[] args) {
		Page p = new Page();
		System.out.println(p.getTitle());
		p.setTitle("index");
		System.out.println(p.getTitle());
	}

}
//numbers -> 0
//string -> null