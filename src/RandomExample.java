
public class RandomExample {

	public static void main(String[] args) {
		System.out.println(Math.random());
		
		//주사위
		System.out.println((int)(Math.random()*6)+1);
		
		//2 [30-37]
		//[0-7]+30
		System.out.println((int)(Math.random()*8)+30);
		//a-z
		char ch = (char)(Math.random()*26 + 'A');
		System.out.println(ch);
		
		//4 [1-45]
		int lotto = (int)(Math.random()*45)+1;
		System.out.println(lotto);
				
	}

}
