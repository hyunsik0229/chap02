
public class ArithemticExample {

	public static void main(String[] args) {
		/*
		 * epoch time(unix time)
		 */
		long current = System.currentTimeMillis()/1000;
		
		long hour = 0;
		long minute =0;
		long seconed = current %60;
		
		
		
		System.out.println(current);
		
		System.out.printf("%02d:%02d:%02d\n" , hour, minute, seconed);

	}

}
