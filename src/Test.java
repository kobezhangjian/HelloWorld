
public class Test {
	
	public static void main(String[] args) {
		out("master-develop");
	}
	
	public static void out(Object o) {
		System.out.println(o);
	}
	
	public void test() {
		out(312312);
	}

	public void doFirst() {
		out(1111);
	}
}
