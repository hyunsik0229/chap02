package chap02;

public class NANEExample {
	/*
	 * 1. +0, -0
	 * 2. Infinity, -Infinity
	 * 3. NAN
	 * 
	 */
	public static void main(String[] args) {
		
		double d1 = Double.NaN;
		double d2 = 0.0/0.0;
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		
	}

}
