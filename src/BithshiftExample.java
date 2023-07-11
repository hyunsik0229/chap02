
public class BithshiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num  = 0b0000_0001;
		/*
		 * 	00000001
		 */
		
		int result1 = num << 1;
		int result2 = num << 2;
		int result3 = num << 4;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
