
public class YeapExample {
	
	public static void main(String[] args) {
		int year = (int)(Math.random()*5000+1);
		
		System.out.println(year);
		
		String yeap = (year%4==0 && year%100==0) || year%400==0 ? "윤년" : "평년";
		
		
		
		System.out.println(yeap);
	}
	
	public static void main3(String[] args) {
		double oneyear = 365.2422;
		double tenyear = oneyear * 100;
		
		System.out.println(tenyear);
	}

	public static void main2(String[] args) {
		double oneYear = 365.2422;
		
		double fourYear = oneYear * 4;
		System.out.println(fourYear);
		
		System.out.println(365*4);
	}
}
