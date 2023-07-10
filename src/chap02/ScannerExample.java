package chap02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		System.out.println("당신의 나이는 >>");
		int age = scan.nextInt();
		
		System.out.printf("10년 후 당신의 나이는 %d 살 입니다.\n" ,  age+10);
	}

}
