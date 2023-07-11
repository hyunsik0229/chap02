
public class LogicalExample {

	public static void main(String[] args) {

		System.out.println("####");
		System.out.println(" And ");
		System.out.println("####");
		System.out.println("T && T = " + (true && true));
		System.out.println("T && F = " + (true && false));
		System.out.println("F && T = " + (false && true));
		System.out.println("F && F = " + (false && false));
		
		
		System.out.println("####");
		System.out.println(" or ");
		System.out.println("####");
		System.out.println("T && T = " + (true || true));
		System.out.println("T && F = " + (true || false));
		System.out.println("F && T = " + (false || true));
		System.out.println("F && F = " + (false || false));
		
		
		System.out.println("####");
		System.out.println(" xor ");
		System.out.println("####");
		System.out.println("T && T = " + (true ^ true));
		System.out.println("T && F = " + (true ^ false));
		System.out.println("F && T = " + (false ^ true));
		System.out.println("F && F = " + (false ^ false));
		
	}

}
