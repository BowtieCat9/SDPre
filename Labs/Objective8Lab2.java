public class Objective8Lab2 {
	public static void main(String [] args) {
		int num1;
		int total = 0;

		for(num1 = 1; num1 <= 20; num1++)
			total = num1 + total;
		System.out.println(total);
	}
}