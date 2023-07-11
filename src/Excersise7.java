
public class Excersise7 {

	public static void main(String[] args) {
		double x = 5;
		double y = 0;
		
		double z = x % y;
		
		if(z == Double.NaN) {
			System.out.println("0으로 나눌수 없습니다");
		}else {
			z = z +10;
			System.out.println(z);
		}
	}

}
