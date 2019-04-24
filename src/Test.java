
public class Test {
	
	public static void main(String[] args) {
		out("master-develop");
	}
	
	public static void out(Object o) {
		System.out.println(o);
	}
	
	public void tets() {
		out(312312);
	}

	public void doFirst() {
		out(1111);
	}

	public void doSecond() {
		out(9999);
	}
	
	public void doThird() {
		out(333);
	}
}
