
public class IncrementDecrementExercise {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		int result1 = ++num1;
		int result2 = num2++;
		
		System.out.println(result1);
		System.out.println(result2);
	}
	
	public static void main3(String[] args) {
		int num1 =10;
		int num2 =10;

		int result = ++num1 + 10;
		int result2 = num2++ +10;
		
		System.out.println(result);
		System.out.println(result2);
	}
	
	public static void main2(String[] args) {
		
		int num =10;
		
		++num;	//num = num+1 이건먼저
		
		System.out.println(num);
		
		num++;	//num = num+1 이거나중
		
		System.out.println(num);
		
	}

}
