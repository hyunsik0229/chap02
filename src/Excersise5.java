
public class Excersise5 {

	public static void main(String[] args) {
		//뒤에 2자리를 없애라
		int num = (int)(Math.random()*5000 + 100);
		
		int num2 = num/100;
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num2*100);
	}

}
