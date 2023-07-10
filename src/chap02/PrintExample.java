package chap02;

public class PrintExample {
	
	public static void main(String[] args) {
		System.out.printf("ch = [%c]\n" , 'A');
		System.out.printf("ch = [%10c]\n" , 'A');
		System.out.printf("ch = [%-10c]\n" , 'A');
		
		System.out.printf("str = [%s]\n" , "Hello");
		System.out.printf("str = [%10s]\n" , "Hello");
		System.out.printf("str = [%-10 s]\n" , "Hello");
	}
	
	public static void main4(String[] args) {
		System.out.printf("real = [%f]", 10.769);
		System.out.printf("real = [%20f]", 10.769);
		System.out.printf("real = [%-20f]", 10.769);
		System.out.printf("real = [%20f]\n", 10.769);
		System.out.printf("real = [%-20f]\n", 10.769);
	}
	
	public static void main3(String[] args) {
		
		System.out.printf("num = [%d]" ,99);
		System.out.printf("num = [%10d]\n" ,99);
	}

	public static void main2(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int result = num1 + num2 ;
		
		System.out.println(result);

	}

}
