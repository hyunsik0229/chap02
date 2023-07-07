package chap02;

public class stringExample {
	
	/*
	 * 이스케이프를 사용할때
	 * 문법이 틀렸을때
	 * 키보드에 없는 문자를 표현할때
	 * 
	 */
	
	
	public static void name(String[] args) {
			char c1 = ' ';
			char c2= '\'';
			String str1 = "";	//empty string
			String str2 = "hello";
			String str3 = "\"hello\"";
			String str4 = "hello\n world\\";
			
			System.out.println(c2);
			System.out.println(str2);
			System.out.println("str3 = "+str3);
			System.out.println("str4 = "+str4);
	}

}
